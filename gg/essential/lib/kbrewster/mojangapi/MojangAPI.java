package gg.essential.lib.kbrewster.mojangapi;

import gg.essential.lib.kbrewster.*;
import java.util.regex.*;
import java.io.*;
import java.util.*;
import gg.essential.lib.kbrewster.mojangapi.profile.*;
import gg.essential.lib.kbrewster.exceptions.*;
import gg.essential.lib.gson.*;

@Reference(apiName = "Mojang API", apiVersion = "1.5")
public class MojangAPI extends API
{
    private static final String BASE_URL = "https://api.mojang.com";
    private static final String STATUS_URL = "https://status.mojang.com/check";
    private static final Pattern STRIPPED_UUID_PATTERN;
    private static final Pattern UUID_PATTERN;
    
    public MojangAPI() {
        super();
    }
    
    public static Profile getProfile(final UUID uuid) throws IOException, APIException {
        final String json = API.sendGet("https://sessionserver.mojang.com/session/minecraft/profile/" + stripDashes(uuid));
        final JsonElement jsonElement = new JsonParser().parse(json);
        if (jsonElement.isJsonNull()) {
            throw new APIException("This shouldn't happen");
        }
        final JsonObject jsonObject = jsonElement.getAsJsonObject();
        if (jsonObject.get("error") instanceof JsonNull) {
            throw new APIException(jsonObject.get("errorMessage").getAsString());
        }
        return new Gson().fromJson(jsonObject, Profile.class);
    }
    
    public static String getUsername(final UUID uuid) throws IOException, APIException {
        return getProfile(uuid).getName();
    }
    
    public static String stripDashes(final String uuid) {
        return uuid.replaceAll("-", "");
    }
    
    public static String stripDashes(final UUID uuid) {
        return stripDashes(uuid.toString());
    }
    
    public static String addDashes(final String uuid) {
        return MojangAPI.STRIPPED_UUID_PATTERN.matcher(uuid).replaceAll("$1-$2-$3-$4-$5");
    }
    
    public static ArrayList<Name> getNameHistory(final UUID uuid) {
        final Gson gson = new Gson();
        final ArrayList<Name> names = new ArrayList<Name>();
        try {
            final String json = API.sendGet(String.format("https://api.mojang.com/user/profiles/%s/names", stripDashes(uuid)));
            final JsonElement parser = new JsonParser().parse(json);
            if (json.isEmpty()) {
                throw new InvalidPlayerException();
            }
            if (!parser.isJsonArray()) {
                return names;
            }
            final JsonArray arrayNames = parser.getAsJsonArray();
            arrayNames.forEach(obj -> {
                final Name name = gson.fromJson(obj, Name.class);
                names.add(name);
                return;
            });
        }
        catch (final IOException e) {
            e.printStackTrace();
        }
        return names;
    }
    
    public static UUID getUUID(final String username) throws IOException, APIException, InvalidPlayerException {
        final String json = API.sendGet("https://api.mojang.com/users/profiles/minecraft/" + username);
        final JsonElement parse = new JsonParser().parse(json);
        if (parse.isJsonNull()) {
            throw new InvalidPlayerException();
        }
        final JsonObject obj = parse.getAsJsonObject();
        if (obj.get("error") instanceof JsonNull) {
            throw new APIException(obj.get("errorMessage").getAsString());
        }
        return UUID.fromString(addDashes(obj.get("id").getAsString()));
    }
    
    private static /* synthetic */ void lambda$getNameHistory$1(final Gson gson, final ArrayList names, final JsonElement obj) {
        final Name name = gson.fromJson(obj, Name.class);
        names.add(name);
    }
    
    static {
        STRIPPED_UUID_PATTERN = Pattern.compile("(\\w{8})(\\w{4})(\\w{4})(\\w{4})(\\w{12})");
        UUID_PATTERN = Pattern.compile("(\\w{8})-(\\w{4})-(\\w{4})-(\\w{4})-(\\w{12})");
    }
}
