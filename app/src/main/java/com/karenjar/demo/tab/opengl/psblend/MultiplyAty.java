package com.karenjar.demo.tab.opengl.psblend;

/**
 * <pre>
 *     正片叠底
 *     整体效果显示由上方图层和下方图层的像素值中较暗的像素合成的图像效果，任意颜色与黑色重叠时将产生黑色，任意颜色和白色重叠时颜色则保持不变
 * </pre>
 * Created by Dandy
 * Wechat: flycatdeng
 */
public class MultiplyAty extends PSBlendAty {
    @Override
    public String getVertexShaderPathFromAssets() {
        return "demo/tab/opengl/psblend/normal.vert";
    }

    @Override
    public String getFragmentShaderPathFromAssets() {
        return "demo/tab/opengl/psblend/multiply.frag";
    }
}