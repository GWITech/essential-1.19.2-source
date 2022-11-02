package gg.essential.loader.stage2.util;

import java.nio.file.*;
import org.apache.commons.codec.digest.*;
import java.io.*;

public class Checksum
{
    public Checksum() {
        super();
    }
    
    public static String getChecksum(final Path path) {
        try (final InputStream inputStream = Files.newInputStream(path, new OpenOption[0])) {
            return DigestUtils.md5Hex(inputStream);
        }
        catch (final Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
