package gg.essential.universal.shader;

import kotlin.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000\u0016
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0000
                                                   \u0002\u0010\u0007
                                                   \u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00f8\u0001\u0000\u0082\u0002\u0006
                                                   \u0004\b!0\u0001?\u0006\u0006\u00c0\u0006\u0001""" }, d2 = { "Lgg/essential/universal/shader/FloatUniform;", "Lgg/essential/universal/shader/ShaderUniform;", "setValue", "", "value", "", "universalcraft" })
public interface FloatUniform extends ShaderUniform
{
    void setValue(final float p0);
}
