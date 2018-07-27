package com.karenjar.demo.tab.opengl.psblend;

/**
 * <pre>
 *     变暗
 * </pre>
 * Created by Dandy
 * Wechat: flycatdeng
 */
public class DarkenAty extends PSBlendAty {
    @Override
    public String getVertexShaderPathFromAssets() {
        return "demo/tab/opengl/psblend/normal.vert";
    }

    @Override
    public String getFragmentShaderPathFromAssets() {
        return "demo/tab/opengl/psblend/darken.frag";
    }
}