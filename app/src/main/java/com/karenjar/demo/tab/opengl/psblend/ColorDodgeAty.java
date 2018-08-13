package com.karenjar.demo.tab.opengl.psblend;

/**
 * <pre>
 *     颜色减淡(Color Dodge)
 *     使用这种模式时，会加亮图层的颜色值，加上的颜色越暗，效果越细腻。
 *     与颜色加深刚好相反，通过降低对比度，加亮底层颜色来反映混合色彩。与黑色混合没有任何效果。
 *     计算公式：结果色 = 基色 + (混合色 * 基色) / (255 - 混合色)。混合色为黑色，结果色就等于基色，混合色为白色结果色就为白色。基色为黑色结果色就为黑色。
 * </pre>
 * Created by Dandy
 * Wechat: flycatdeng
 */
public class ColorDodgeAty extends PSBlendAty {
    @Override
    public String getVertexShaderPathFromAssets() {
        return "demo/tab/opengl/psblend/normal.vert";
    }

    @Override
    public String getFragmentShaderPathFromAssets() {
        return "demo/tab/opengl/psblend/colordodge.frag";
    }
}