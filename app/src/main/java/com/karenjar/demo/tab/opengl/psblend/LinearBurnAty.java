package com.karenjar.demo.tab.opengl.psblend;

/**
 * <pre>
 *     线性加深
 *     方图层将根据下方图层的灰度与图像融合，此模式对白色无效.算法为每个颜色通道对应相加再减去1.0,所以有可能得到0,要做判断
 * </pre>
 * Created by Dandy
 * Wechat: flycatdeng
 */
public class LinearBurnAty extends PSBlendAty {
    @Override
    public String getVertexShaderPathFromAssets() {
        return "demo/tab/opengl/psblend/normal.vert";
    }

    @Override
    public String getFragmentShaderPathFromAssets() {
        return "demo/tab/opengl/psblend/linearburn.frag";
    }
}