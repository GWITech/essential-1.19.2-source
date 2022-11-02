package gg.essential.lib.jitsi.utils.logging2;

import com.google.common.collect.*;
import java.lang.ref.*;
import org.jetbrains.annotations.*;
import java.util.*;
import java.util.stream.*;

public class LogContext
{
    protected ImmutableMap<String, String> ancestorsContext;
    protected ImmutableMap<String, String> context;
    protected String formattedContext;
    private final List<WeakReference<LogContext>> childContexts;
    
    public LogContext() {
        this(Collections.emptyMap());
    }
    
    public LogContext(final Map<String, String> context) {
        this(context, ImmutableMap.of());
    }
    
    protected LogContext(final Map<String, String> context, final ImmutableMap<String, String> ancestorsContext) {
        super();
        this.childContexts = new ArrayList<WeakReference<LogContext>>();
        this.context = ImmutableMap.copyOf((Map<? extends String, ? extends String>)context);
        this.ancestorsContext = ancestorsContext;
        this.updateFormattedContext();
    }
    
    protected synchronized void updateFormattedContext() {
        final ImmutableMap<String, String> combined = combineMaps(this.ancestorsContext, this.context);
        this.formattedContext = formatContext(combined);
        this.updateChildren(combined);
    }
    
    public synchronized LogContext createSubContext(final Map<String, String> childContextData) {
        final ImmutableMap<String, String> childAncestorContext = combineMaps(this.ancestorsContext, this.context);
        final LogContext child = new LogContext(childContextData, childAncestorContext);
        this.childContexts.add(new WeakReference<LogContext>(child));
        return child;
    }
    
    protected synchronized void updateChildren(final ImmutableMap<String, String> newAncestorContext) {
        final Iterator<WeakReference<LogContext>> iter = this.childContexts.iterator();
        while (iter.hasNext()) {
            final LogContext c = iter.next().get();
            if (c != null) {
                c.ancestorContextUpdated(newAncestorContext);
            }
            else {
                iter.remove();
            }
        }
    }
    
    protected synchronized void ancestorContextUpdated(final ImmutableMap<String, String> newAncestorContext) {
        this.ancestorsContext = newAncestorContext;
        this.updateFormattedContext();
    }
    
    @Override
    public String toString() {
        return this.formattedContext;
    }
    
    @SafeVarargs
    @NotNull
    protected static ImmutableMap<String, String> combineMaps(@NotNull final Map<String, String>... maps) {
        final Map<String, String> combinedMap = new HashMap<String, String>();
        for (int i = 0; i < 2; ++i) {
            final Map<String, String> map = maps[i];
            combinedMap.putAll(map);
        }
        return ImmutableMap.copyOf((Map<? extends String, ? extends String>)combinedMap);
    }
    
    protected static String formatContext(final Map<String, String> context) {
        final StringBuilder contextString = new StringBuilder();
        final String data = context.entrySet().stream().map(e -> e.getKey() + "=" + e.getValue()).collect((Collector<? super Object, ?, String>)Collectors.joining(" "));
        contextString.append(data);
        if (contextString.length() > 0) {
            return "[" + (Object)contextString + "]";
        }
        return "";
    }
    
    private static /* synthetic */ String lambda$formatContext$0(final Map.Entry e) {
        return e.getKey() + "=" + e.getValue();
    }
}
