package com.karenjar.demo.tab.opengl.psblend;

/**
 * <pre>
 *     简单的展示
 * </pre>
 * Created by Dandy
 * Wechat: flycatdeng
 */
public class NormalAty extends PSBlendAty {
    @Override
    public String getVertexShaderPathFromAssets() {
        return "demo/tab/opengl/psblend/normal.vert";
    }

    @Override
    public String getFragmentShaderPathFromAssets() {
        return "demo/tab/opengl/psblend/normal.frag";
    }
}
