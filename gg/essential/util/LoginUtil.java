package gg.essential.util;

import java.net.*;
import gg.essential.lib.gson.*;
import java.nio.charset.*;
import java.io.*;

public class LoginUtil
{
    public static int joinServer(final String token, final String uuid, final String serverHash) {
        try {
            final URL url = new URL("https://sessionserver.mojang.com/session/minecraft/join");
            final HttpURLConnection conn = (HttpURLConnection)url.openConnection();
            conn.setRequestMethod("POST");
            conn.setDoOutput(true);
            final JsonObject obj = new JsonObject();
            obj.addProperty("accessToken", token);
            obj.addProperty("selectedProfile", uuid);
            obj.addProperty("serverId", serverHash);
            final byte[] jsonBytes = obj.toString().getBytes(StandardCharsets.UTF_8);
            conn.setFixedLengthStreamingMode(jsonBytes.length);
            conn.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
            conn.connect();
            try (final OutputStream out = conn.getOutputStream()) {
                out.write(jsonBytes);
            }
            return conn.getResponseCode();
        }
        catch (final IOException ex) {
            return -1;
        }
    }
}
