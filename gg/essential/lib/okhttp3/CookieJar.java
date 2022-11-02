package gg.essential.lib.okhttp3;

import java.util.*;

public interface CookieJar
{
    public static final CookieJar NO_COOKIES = new CookieJar() {
        CookieJar$1() {
            super();
        }
        
        @Override
        public List<Cookie> loadForRequest$792063fe() {
            return Collections.emptyList();
        }
    };
    
    List<Cookie> loadForRequest$792063fe();
}
