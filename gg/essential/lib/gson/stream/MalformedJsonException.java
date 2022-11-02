package gg.essential.lib.gson.stream;

import java.io.*;

public final class MalformedJsonException extends IOException
{
    public MalformedJsonException(final String msg) {
        super(msg);
    }
}
