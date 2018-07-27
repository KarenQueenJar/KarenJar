package com.karenjar.demo.tab.opengl.psblend;

/**
 * <pre>
 *     变亮
 * </pre>
 * Created by Dandy
 * Wechat: flycatdeng
 */
public class LightenAty extends PSBlendAty {
    @Override
    public String getVertexShaderPathFromAssets() {
        return "demo/tab/opengl/psblend/normal.vert";
    }

    @Override
    public String getFragmentShaderPathFromAssets() {
        return "demo/tab/opengl/psblend/lighten.frag";
    }
}