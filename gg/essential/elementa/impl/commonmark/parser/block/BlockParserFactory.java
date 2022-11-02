package gg.essential.elementa.impl.commonmark.parser.block;

public interface BlockParserFactory
{
    BlockStart tryStart(final ParserState p0, final MatchedBlockParser p1);
}
