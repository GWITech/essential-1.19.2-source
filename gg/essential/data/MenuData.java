package gg.essential.data;

import org.jetbrains.annotations.*;
import kotlin.*;
import gg.essential.gui.about.components.*;
import java.nio.charset.*;
import java.net.*;
import kotlin.jvm.internal.*;
import gg.essential.util.*;
import gg.essential.lib.gson.*;
import kotlin.collections.*;
import java.util.*;
import kotlin.text.*;
import java.util.concurrent.*;
import gg.essential.lib.caffeine.cache.*;
import gg.essential.gui.about.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000,
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0000
                                                   \u0002\b\u0002
                                                   \u0002\u0010\u000e
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0003
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0007\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\u0013B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u000f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020	0\b2\u0006\u0010\u0010\u001a\u00020\u0004H\u0002J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\rH\u0002R\u0016\u0010\u0003\u001a
                                                    \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002
                                                   \u0000R+\u0010\u0006\u001a\u001c\u0012\u0004\u0012\u00020\u0004\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020	0\b0\u0007¢\u0006\b
                                                   \u0000\u001a\u0004\b
                                                   \u0010\u000bR\u001d\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00040\u0007¢\u0006\b
                                                   \u0000\u001a\u0004\b\u000e\u0010\u000b¨\u0006\u0014""" }, d2 = { "Lgg/essential/data/MenuData;", "", "()V", "BASE_URL", "", "kotlin.jvm.PlatformType", "CHANGELOGS", "Lgg/essential/lib/caffeine/cache/AsyncLoadingCache;", "Lkotlin/Pair;", "Lgg/essential/gui/about/components/ChangelogComponent$Changelog;", "getCHANGELOGS", "()Lgg/essential/lib/caffeine/cache/AsyncLoadingCache;", "INFO", "Lgg/essential/data/MenuData$FetchableCategory;", "getINFO", "fetchChangelogs", "version", "fetchInfo", "category", "FetchableCategory", "essential" })
public final class MenuData
{
    @NotNull
    public static final MenuData INSTANCE;
    private static final String BASE_URL;
    @NotNull
    private static final AsyncLoadingCache<String, Pair<String, ChangelogComponent.Changelog>> CHANGELOGS;
    @NotNull
    private static final AsyncLoadingCache<FetchableCategory, String> INFO;
    
    private MenuData() {
        super();
    }
    
    @NotNull
    public final AsyncLoadingCache<String, Pair<String, ChangelogComponent.Changelog>> getCHANGELOGS() {
        return MenuData.CHANGELOGS;
    }
    
    @NotNull
    public final AsyncLoadingCache<FetchableCategory, String> getINFO() {
        return MenuData.INFO;
    }
    
    private final Pair<String, ChangelogComponent.Changelog> fetchChangelogs(final String version) {
        final String encode = URLEncoder.encode(version, StandardCharsets.UTF_8.toString());
        Intrinsics.checkNotNullExpressionValue((Object)encode, "encode(version, StandardCharsets.UTF_8.toString())");
        final String encodedVersion = StringsKt.replace$default(StringsKt.replace$default(encode, "+", "%20", false, 4, (Object)null), "#", "%23", false, 4, (Object)null);
        final String dataString = WebUtil.fetchString(MenuData.BASE_URL + "/mods/v1/essential:essential/changelogs?branch=" + VersionData.INSTANCE.getEssentialBranch() + "&before=" + encodedVersion);
        final ChangelogComponent.Changelog[] fromJson = new Gson().fromJson(dataString, ChangelogComponent.Changelog[].class);
        Intrinsics.checkNotNullExpressionValue((Object)fromJson, "Gson().fromJson(dataStri\u2026t.Changelog>::class.java)");
        final List data = ArraysKt.toList((Object[])fromJson);
        String nextVersion = null;
        String previousVersion = version;
        ChangelogComponent.Changelog previousLog = null;
        for (final ChangelogComponent.Changelog log : data) {
            if (previousLog != null) {
                MenuData.CHANGELOGS.put(previousVersion, CompletableFuture.completedFuture(new Pair((Object)log.getVersion(), (Object)previousLog)));
            }
            else {
                nextVersion = log.getVersion();
            }
            previousLog = log;
            previousVersion = log.getVersion();
        }
        final String versionResponse = WebUtil.fetchString(MenuData.BASE_URL + "/mods/v1/essential:essential/versions/" + encodedVersion + "/changelog");
        return (Pair<String, ChangelogComponent.Changelog>)new Pair((Object)nextVersion, (Object)new Gson().fromJson(versionResponse, ChangelogComponent.Changelog.class));
    }
    
    private final String fetchInfo(final FetchableCategory category) {
        String url = MenuData.BASE_URL + "/v2/documents/";
        url += category.getQuery();
        final String fetchString;
        String data = fetchString = WebUtil.fetchString(url);
        Intrinsics.checkNotNullExpressionValue((Object)fetchString, "data");
        if (StringsKt.contains$default((CharSequence)fetchString, (CharSequence)"Failed to fetch", false, 2, (Object)null)) {
            MenuData.INFO.asMap().remove(category);
            data = "An error occurred fetching this data. Please check your internet connection and try again.";
        }
        final String s = data;
        Intrinsics.checkNotNullExpressionValue((Object)s, "data");
        final String replace;
        data = (replace = new Regex("\\{\\..*?}").replace((CharSequence)new Regex("===.*").replace((CharSequence)s, ""), ""));
        Intrinsics.checkNotNullExpressionValue((Object)replace, "data");
        return replace;
    }
    
    private static final Pair CHANGELOGS$lambda-0(final String version) {
        Intrinsics.checkNotNullParameter((Object)version, "version");
        return MenuData.INSTANCE.fetchChangelogs(version);
    }
    
    private static final String INFO$lambda-1(final FetchableCategory category) {
        Intrinsics.checkNotNullParameter((Object)category, "category");
        return MenuData.INSTANCE.fetchInfo(category);
    }
    
    static {
        INSTANCE = new MenuData();
        BASE_URL = System.getProperty("essential.api.url", System.getenv().getOrDefault("ESSENTIAL_API_URL", "https://api.essential.gg"));
        final AsyncLoadingCache<Object, Pair> buildAsync = (AsyncLoadingCache<Object, Pair>)Caffeine.newBuilder().expireAfterAccess(15L, TimeUnit.MINUTES).buildAsync((CacheLoader<? super String, Pair<String, ChangelogComponent.Changelog>>)MenuData::CHANGELOGS$lambda-0);
        Intrinsics.checkNotNullExpressionValue((Object)buildAsync, "newBuilder()\n        .ex\u2026etchChangelogs(version) }");
        CHANGELOGS = buildAsync;
        final AsyncLoadingCache<Object, String> buildAsync2 = (AsyncLoadingCache<Object, String>)Caffeine.newBuilder().expireAfterAccess(15L, TimeUnit.MINUTES).buildAsync((CacheLoader<? super FetchableCategory, String>)MenuData::INFO$lambda-1);
        Intrinsics.checkNotNullExpressionValue((Object)buildAsync2, "newBuilder()\n        .ex\u2026 -> fetchInfo(category) }");
        INFO = buildAsync2;
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                       \u0000\u0018
                                                       \u0002\u0018\u0002
                                                       \u0002\u0010\u0010
                                                       \u0000
                                                       \u0002\u0018\u0002
                                                       \u0000
                                                       \u0002\u0010\u000e
                                                       \u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b
                                                       \u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b
                                                       \u0000\u001a\u0004\b	\u0010
                                                       j\u0002\b\u000b¨\u0006\f""" }, d2 = { "Lgg/essential/data/MenuData$FetchableCategory;", "", "category", "Lgg/essential/gui/about/Category;", "query", "", "(Ljava/lang/String;ILgg/essential/gui/about/Category;Ljava/lang/String;)V", "getCategory", "()Lgg/essential/gui/about/Category;", "getQuery", "()Ljava/lang/String;", "PRIVACY", "essential" })
    public enum FetchableCategory
    {
        @NotNull
        private final Category category;
        @NotNull
        private final String query;
        
        PRIVACY("PRIVACY", Category.PRIVACY, "privacy-policy");
        
        private static final /* synthetic */ FetchableCategory[] $VALUES;
        
        private FetchableCategory(final String $enum$name, final Category category, final String query) {
            this.category = category;
            this.query = query;
        }
        
        @NotNull
        public final Category getCategory() {
            return this.category;
        }
        
        @NotNull
        public final String getQuery() {
            return this.query;
        }
        
        public static FetchableCategory[] values() {
            return FetchableCategory.$VALUES.clone();
        }
        
        public static FetchableCategory valueOf(final String value) {
            return Enum.valueOf(FetchableCategory.class, value);
        }
        
        private static final /* synthetic */ FetchableCategory[] $values() {
            return new FetchableCategory[] { FetchableCategory.PRIVACY };
        }
        
        static {
            $VALUES = $values();
        }
    }
}
