package com.karenjar.demo.tab.opengl.psblend;

/**
 * <pre>
 *     线性光(Linear Light)
 *     线性光通过减少或增加亮度，来使颜色加深或减淡。具体取决于混合色的数值。
 *     如果混合层颜色(光源)亮度高于中性灰(50%灰)，则用增加亮度的方法来使得画面变亮，反之用降低亮度的方法来使画面变暗。
 * </pre>
 * Created by Dandy
 * Wechat: flycatdeng
 */
public class LinearLightAty extends PSBlendAty {
    @Override
    public String getVertexShaderPathFromAssets() {
        return "demo/tab/opengl/psblend/normal.vert";
    }

    @Override
    public String getFragmentShaderPathFromAssets() {
        return "demo/tab/opengl/psblend/linearlight.frag";
    }
}