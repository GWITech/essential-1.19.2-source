package gg.essential.connectionmanager.common.util;

import java.security.*;
import java.util.*;
import java.math.*;
import org.jetbrains.annotations.*;

public class LoginUtil
{
    private static final byte[] SHARED_CONSTANT;
    private static final int SHARED_SECRET_LENGTH = 16;
    private static final SecureRandom SECURE_RANDOM;
    
    public LoginUtil() {
        super();
    }
    
    private static byte[] sha1(final byte[] source) {
        try {
            final MessageDigest digest = MessageDigest.getInstance("SHA-1");
            return digest.digest(source);
        }
        catch (final NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
    
    public static byte[] generateSharedSecret() {
        final byte[] bytes = new byte[16];
        LoginUtil.SECURE_RANDOM.nextBytes(bytes);
        return bytes;
    }
    
    @Nullable
    public static String computeHash(final byte[] sharedSecret) {
        if (sharedSecret.length != 16) {
            return null;
        }
        final byte[] buf = Arrays.copyOf(sharedSecret, sharedSecret.length + LoginUtil.SHARED_CONSTANT.length);
        System.arraycopy(LoginUtil.SHARED_CONSTANT, 0, buf, sharedSecret.length, LoginUtil.SHARED_CONSTANT.length);
        return new BigInteger(sha1(buf)).toString(16);
    }
    
    static {
        SHARED_CONSTANT = new BigInteger("173be201d4e5591dcef37bcaf701d136", 16).toByteArray();
        SECURE_RANDOM = new SecureRandom();
    }
}
