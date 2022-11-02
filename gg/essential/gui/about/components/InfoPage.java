package gg.essential.gui.about.components;

import gg.essential.data.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import java.util.*;
import kotlin.collections.*;
import gg.essential.elementa.dsl.*;
import gg.essential.elementa.components.*;
import kotlin.jvm.functions.*;
import kotlin.*;
import gg.essential.elementa.constraints.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000$
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u000e
                                                   \u0002\b\u0003
                                                   \u0002\u0010 
                                                   \u0002\b\u0003
                                                   \u0002\u0018\u0002\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050	2\u0006\u0010
                                                   \u001a\u00020\u0005H\u0002¨\u0006\u000b²\u0006
                                                   \u0010\f\u001a\u00020X\u008a\u0084\u0002""" }, d2 = { "Lgg/essential/gui/about/components/InfoPage;", "Lgg/essential/gui/about/components/Page;", "name", "Lgg/essential/data/MenuData$FetchableCategory;", "linkText", "", "linkURI", "(Lgg/essential/data/MenuData$FetchableCategory;Ljava/lang/String;Ljava/lang/String;)V", "splitStringByLengthAndLine", "", "string", "essential", "link", "Lgg/essential/elementa/UIComponent;" })
public final class InfoPage extends Page
{
    public InfoPage(@NotNull final MenuData.FetchableCategory name, @NotNull final String linkText, @NotNull final String linkURI) {
        Intrinsics.checkNotNullParameter((Object)name, "name");
        Intrinsics.checkNotNullParameter((Object)linkText, "linkText");
        Intrinsics.checkNotNullParameter((Object)linkURI, "linkURI");
        super(name.getCategory().getNameState());
        MenuData.INSTANCE.getINFO().get(name).whenComplete(InfoPage::_init_$lambda-0);
    }
    
    private final List<String> splitStringByLengthAndLine(final String string) {
        final StringTokenizer tokenizer = new StringTokenizer(string, System.lineSeparator());
        final List strings = new ArrayList();
        while (tokenizer.hasMoreTokens()) {
            final String line = tokenizer.nextToken() + System.lineSeparator() + System.lineSeparator();
            if (!strings.isEmpty()) {
                final String appended = CollectionsKt.last(strings) + line;
                if (appended.length() > 2000) {
                    strings.add(line);
                }
                else {
                    strings.set(CollectionsKt.getLastIndex(strings), CollectionsKt.last(strings) + line);
                }
            }
            else {
                strings.add(line);
            }
        }
        return strings;
    }
    
    private static final void _init_$lambda-0(final InfoPage this$0, final String $linkURI, final String $linkText, final String markdown, final Throwable t) {
        Intrinsics.checkNotNullParameter((Object)this$0, "this$0");
        Intrinsics.checkNotNullParameter((Object)$linkURI, "$linkURI");
        Intrinsics.checkNotNullParameter((Object)$linkText, "$linkText");
        Intrinsics.checkNotNullExpressionValue((Object)markdown, "markdown");
        final List splitStrings = this$0.splitStringByLengthAndLine(markdown);
        final RelativeConstraint componentWidth = UtilitiesKt.getPercent(65);
        Window.Companion.enqueueRenderOperation((Function0<Unit>)new InfoPage$1.InfoPage$1$1(splitStrings, $linkURI, $linkText, this$0, componentWidth));
    }
}
