package com.karenjar.demo.tab.opengl.psblend;

/**
 * <pre>
 *     溶解
 *     某一点的颜色值由基色和混合色随机给
 * </pre>
 * Created by Dandy
 * Wechat: flycatdeng
 */
public class DissolveAty extends PSBlendAty {
    @Override
    public String getVertexShaderPathFromAssets() {
        return "demo/tab/opengl/psblend/normal.vert";
    }

    @Override
    public String getFragmentShaderPathFromAssets() {
        return "demo/tab/opengl/psblend/dissolve.frag";
    }
}