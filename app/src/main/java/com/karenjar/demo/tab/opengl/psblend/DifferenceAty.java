package com.karenjar.demo.tab.opengl.psblend;

/**
 * <pre>
 *     差值混合
 *     base图像减去blend图像的绝对值，正反顺序可以颠倒。
 *     如果结果为黑色，说明两幅图完全相同，如果结果为白色说明他们颜色刚好相反。
 *     原图与黑色混合，不会有任何变化;
 *     原图与白色混合，可以得到反转的颜色的图像;
 * </pre>
 * Created by Dandy
 * Wechat: flycatdeng
 */
public class DifferenceAty extends PSBlendAty {
    @Override
    public String getVertexShaderPathFromAssets() {
        return "demo/tab/opengl/psblend/normal.vert";
    }

    @Override
    public String getFragmentShaderPathFromAssets() {
        return "demo/tab/opengl/psblend/difference.frag";
    }
}