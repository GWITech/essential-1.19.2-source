package gg.essential.lib.gson;

import gg.essential.lib.gson.stream.*;
import java.io.*;

public interface ToNumberStrategy
{
    Number readNumber(final JsonReader p0) throws IOException;
}
