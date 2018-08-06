package com.karenjar.demo.tab.opengl.psblend;

/**
 * <pre>
 *     减去混合
 *     base图像减去blend图像，值可能小于0,所以shader中要做判断
 * </pre>
 * Created by Dandy
 * Wechat: flycatdeng
 */
public class SubtractAty extends PSBlendAty {
    @Override
    public String getVertexShaderPathFromAssets() {
        return "demo/tab/opengl/psblend/normal.vert";
    }

    @Override
    public String getFragmentShaderPathFromAssets() {
        return "demo/tab/opengl/psblend/subtract.frag";
    }
}