package gg.essential.loader.stage2;

import org.apache.commons.lang3.tuple.*;
import java.util.*;
import java.util.function.*;
import java.io.*;
import java.util.stream.*;
import java.nio.file.*;

public class Utils
{
    public Utils() {
        super();
    }
    
    public static Pair<Path, Integer> findMostRecentFile(final Path dir, final String baseName, final String ext) throws IOException {
        final String dotExt = "." + ext;
        List<Path> rawFiles;
        try (final Stream<Path> stream = Files.list(dir)) {
            rawFiles = stream.collect((Collector<? super Path, ?, List<Path>>)Collectors.toList());
        }
        final List<Pair<Path, Integer>> files = rawFiles.stream().map(it -> {
            final String name = it.getFileName().toString();
            if (!name.startsWith(baseName)) {
                return null;
            }
            else {
                final String ending = name.substring(baseName.length());
                if (ending.equals(dotExt)) {
                    return Pair.of(it, 0);
                }
                else {
                    final String ending2 = ending.substring(0, ending.length() - dotExt.length());
                    if (!ending2.startsWith(".")) {
                        return null;
                    }
                    else {
                        final String ending3 = ending2.substring(1);
                        try {
                            return Pair.of(it, Integer.parseInt(ending3));
                        }
                        catch (final NumberFormatException e) {
                            return null;
                        }
                    }
                }
            }
        }).filter(Objects::nonNull).collect((Collector<? super Object, ?, List<Pair<Path, Integer>>>)Collectors.toList());
        final Pair<Path, Integer> mostRecent = files.stream().max(Comparator.comparing((Function<? super Pair<Path, Integer>, ? extends Comparable>)Pair::getRight)).orElse(null);
        if (mostRecent == null) {
            return Pair.of(dir.resolve(baseName + dotExt), 0);
        }
        files.stream().filter(it -> it != mostRecent).forEach(it -> {
            try {
                Files.delete(it.getKey());
            }
            catch (final IOException e2) {
                e2.printStackTrace();
            }
            return;
        });
        return mostRecent;
    }
    
    public static Path findNextMostRecentFile(final Path dir, final String baseName, final String ext) throws IOException {
        final Pair<Path, Integer> mostRecent = findMostRecentFile(dir, baseName, ext);
        if (!Files.exists(mostRecent.getLeft(), new LinkOption[0])) {
            return mostRecent.getLeft();
        }
        return dir.resolve(baseName + "." + (mostRecent.getRight() + 1) + "." + ext);
    }
    
    public static Path mapFileBaseName(final Path path, final Function<String, String> mapper) {
        return path.resolveSibling(mapFileBaseName(path.getFileName().toString(), mapper));
    }
    
    public static String mapFileBaseName(final String fileName, final Function<String, String> mapper) {
        final int separator = fileName.lastIndexOf(46);
        if (separator == -1) {
            return mapper.apply(fileName);
        }
        final String base = fileName.substring(0, separator);
        final String ext = fileName.substring(separator);
        return mapper.apply(base) + ext;
    }
    
    private static /* synthetic */ void lambda$findMostRecentFile$2(final Pair it) {
        try {
            Files.delete(it.getKey());
        }
        catch (final IOException e) {
            e.printStackTrace();
        }
    }
    
    private static /* synthetic */ boolean lambda$findMostRecentFile$1(final Pair mostRecent, final Pair it) {
        return it != mostRecent;
    }
    
    private static /* synthetic */ Pair lambda$findMostRecentFile$0(final String baseName, final String dotExt, final Path it) {
        final String name = it.getFileName().toString();
        if (!name.startsWith(baseName)) {
            return null;
        }
        String ending = name.substring(baseName.length());
        if (ending.equals(dotExt)) {
            return Pair.of(it, 0);
        }
        ending = ending.substring(0, ending.length() - dotExt.length());
        if (!ending.startsWith(".")) {
            return null;
        }
        ending = ending.substring(1);
        try {
            return Pair.of(it, Integer.parseInt(ending));
        }
        catch (final NumberFormatException e) {
            return null;
        }
    }
}
