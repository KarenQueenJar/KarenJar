package com.karenjar.demo.tab.opengl.psblend;

/**
 * <pre>
 *     颜色加深(Color Burn)
 *     使用这种模式时，会加暗图层的颜色值，加上的颜色越亮，效果越细腻。
 *     让底层的颜色变暗，有点类似于正片叠底，但不同的是，它会根据叠加的像素颜色相应增加对比度。和白色混合没有效果。
 *     计算公式：结果色 = (基色 + 混合色 - 255) * 255 / 混合色，其中如果(基色+混合色-255)出现负数则直接归零
 * </pre>
 * Created by Dandy
 * Wechat: flycatdeng
 */
public class ColorBurnAty extends PSBlendAty {
    @Override
    public String getVertexShaderPathFromAssets() {
        return "demo/tab/opengl/psblend/normal.vert";
    }

    @Override
    public String getFragmentShaderPathFromAssets() {
        return "demo/tab/opengl/psblend/colorburn.frag";
    }
}