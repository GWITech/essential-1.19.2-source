package gg.essential.lib.okhttp3;

import java.io.*;
import javax.annotation.*;

public interface Authenticator
{
    public static final Authenticator NONE = new Authenticator() {
        Authenticator$1() {
            super();
        }
        
        @Override
        public Request authenticate$31deecb3() {
            return null;
        }
    };
    
    @Nullable
    Request authenticate$31deecb3() throws IOException;
}
