package gg.essential.lib.okhttp3;

import java.io.*;

public interface Call extends Cloneable
{
    Response execute() throws IOException;
}
