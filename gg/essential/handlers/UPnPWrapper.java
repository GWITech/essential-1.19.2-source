package gg.essential.handlers;

import gg.essential.*;
import gg.essential.util.*;
import gg.essential.lib.weupnp.*;
import java.io.*;
import org.xml.sax.*;
import javax.xml.parsers.*;
import java.net.*;
import java.util.*;

public class UPnPWrapper
{
    public static final boolean ICE;
    public static final boolean FAKE_UPNP;
    public static transient GatewayDevice device;
    public static String ip;
    public static int port;
    private static UPnPCompatibility compatibility;
    
    public static UPnPCompatibility getCompatibility() {
        return UPnPWrapper.compatibility;
    }
    
    public static void checkCompatibility() {
        if (UPnPWrapper.ICE || UPnPWrapper.FAKE_UPNP) {
            UPnPWrapper.compatibility = UPnPCompatibility.COMPATIBLE;
            return;
        }
        try {
            final GatewayDiscover discover = new GatewayDiscover();
            discover.discover();
            UPnPWrapper.compatibility = ((discover.getValidGateway() != null) ? UPnPCompatibility.COMPATIBLE : UPnPCompatibility.INCOMPATIBLE);
        }
        catch (final Exception e) {
            Essential.logger.error("Exception during UPnP compatibility check, assuming incompatible.", (Throwable)e);
            UPnPWrapper.compatibility = UPnPCompatibility.INCOMPATIBLE;
        }
    }
    
    public static UPnPWrapper.UPnPStatus openOnPort(final int port) {
        if (UPnPWrapper.ICE) {
            UPnPWrapper.ip = UUIDUtil.getClientUUID() + ".essential-sps";
            return UPnPWrapper.UPnPStatus.SUCCESS;
        }
        UPnPWrapper.port = port;
        if (UPnPWrapper.FAKE_UPNP) {
            UPnPWrapper.ip = "localhost";
            return UPnPWrapper.UPnPStatus.SUCCESS;
        }
        try {
            final GatewayDiscover discover = new GatewayDiscover();
            final Map<InetAddress, GatewayDevice> values = discover.discover();
            if (values.size() == 0) {
                Essential.logger.error("Unable to forward port: UPnP is not enabled on your router!");
                return UPnPWrapper.UPnPStatus.UNAVAILABLE;
            }
            System.out.println(values.size());
            final Iterator<GatewayDevice> iterator = values.values().iterator();
            while (iterator.hasNext()) {
                final GatewayDevice device = UPnPWrapper.device = iterator.next();
                final String localIp = device.getLocalAddress().getHostAddress();
                boolean run = true;
                try {
                    int i = 0;
                    while (true) {
                        final PortMappingEntry entry = new PortMappingEntry();
                        if (!device.getGenericPortMappingEntry(i++, entry)) {
                            break;
                        }
                        if ((entry.getExternalPort() == port || (entry.getInternalPort() == port && entry.getInternalClient().equals(localIp))) && (!entry.getPortMappingDescription().equals("ESSENTIAL") || !entry.getInternalClient().equals(localIp))) {
                            Essential.logger.error("Unable to forward port: {} has already claimed port {} for {}.", (Object)entry.getPortMappingDescription(), (Object)port, (Object)entry.getInternalClient());
                            run = false;
                            break;
                        }
                    }
                }
                catch (final Exception ex) {
                    Essential.logger.error("thrown exception during searching, assuming we're ok", (Throwable)ex);
                    continue;
                }
                if (run) {
                    Essential.logger.info("Attempting UPnP on " + device.getFriendlyName() + " " + device.getDeviceType() + " " + device.getManufacturer() + " " + device.getModelNumber() + " " + device.getModelDescription());
                    if (device.addPortMapping(port, port, localIp, "tcp", "essential")) {
                        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
                            try {
                                if (device != null) {
                                    device.deletePortMapping(port, "tcp");
                                }
                            }
                            catch (final IOException | SAXException ex3) {
                                Essential.logger.error("Failed to delete port mapping for {}", (Object)port);
                            }
                            return;
                        }));
                        UPnPWrapper.ip = device.getExternalIPAddress();
                        Essential.logger.info("External UPnP IP: " + UPnPWrapper.ip);
                        return UPnPWrapper.UPnPStatus.SUCCESS;
                    }
                    Essential.logger.error("Unable to forward port: unknown error while adding port mapping. Trying next device if available");
                }
            }
        }
        catch (final IOException | ParserConfigurationException | SAXException ex2) {
            Essential.logger.error("Unable to forward port: {}", (Object)ex2.getLocalizedMessage(), (Object)ex2);
            return UPnPWrapper.UPnPStatus.FAILED;
        }
        return UPnPWrapper.UPnPStatus.FAILED;
    }
    
    public static String refreshIp() {
        if (UPnPWrapper.ICE) {
            return UUIDUtil.getClientUUID() + ".essential-sps";
        }
        if (UPnPWrapper.FAKE_UPNP) {
            return "localhost";
        }
        if (UPnPWrapper.device != null) {
            try {
                final String updatedIP = UPnPWrapper.device.getExternalIPAddress();
                if (updatedIP != null) {
                    return UPnPWrapper.ip = updatedIP;
                }
            }
            catch (final IOException | SAXException e) {
                e.printStackTrace();
            }
        }
        return UPnPWrapper.ip;
    }
    
    public static boolean close(final int port) {
        if (UPnPWrapper.device == null) {
            return true;
        }
        try {
            UPnPWrapper.device.deletePortMapping(port, "tcp");
            UPnPWrapper.device = null;
            return true;
        }
        catch (final IOException | SAXException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    private static /* synthetic */ void lambda$openOnPort$0(final GatewayDevice device, final int port) {
        try {
            if (device != null) {
                device.deletePortMapping(port, "tcp");
            }
        }
        catch (final IOException | SAXException ex) {
            Essential.logger.error("Failed to delete port mapping for {}", (Object)port);
        }
    }
    
    static {
        ICE = Boolean.parseBoolean(System.getenv().getOrDefault("ESSENTIAL_ICE", "true"));
        FAKE_UPNP = Boolean.parseBoolean(System.getenv().getOrDefault("ESSENTIAL_FAKE_UPNP", "false"));
        UPnPWrapper.compatibility = UPnPCompatibility.UNCHECKED;
    }
    
    public enum UPnPCompatibility
    {
        UNCHECKED, 
        CHECKING, 
        INCOMPATIBLE, 
        COMPATIBLE;
        
        private static final /* synthetic */ UPnPCompatibility[] $VALUES;
        
        public static UPnPCompatibility[] values() {
            return UPnPCompatibility.$VALUES.clone();
        }
        
        public static UPnPCompatibility valueOf(final String name) {
            return Enum.valueOf(UPnPCompatibility.class, name);
        }
        
        private static /* synthetic */ UPnPCompatibility[] $values() {
            return new UPnPCompatibility[] { UPnPCompatibility.UNCHECKED, UPnPCompatibility.CHECKING, UPnPCompatibility.INCOMPATIBLE, UPnPCompatibility.COMPATIBLE };
        }
        
        static {
            $VALUES = $values();
        }
    }
}
