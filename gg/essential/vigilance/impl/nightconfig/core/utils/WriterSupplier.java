package gg.essential.vigilance.impl.nightconfig.core.utils;

import java.io.*;

public interface WriterSupplier
{
    Writer get() throws IOException;
}
