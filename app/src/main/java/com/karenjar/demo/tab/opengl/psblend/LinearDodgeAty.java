package com.karenjar.demo.tab.opengl.psblend;

/**
 * <pre>
 *     线性减淡（也叫“相加”，“添加”）
 *     根据每一个颜色通道的信息，加亮所有通道的基色，并通过降低其他颜色的亮度来反映混合颜色。此模式对黑色无效
 * </pre>
 * Created by Dandy
 * Wechat: flycatdeng
 */
public class LinearDodgeAty extends PSBlendAty {
    @Override
    public String getVertexShaderPathFromAssets() {
        return "demo/tab/opengl/psblend/normal.vert";
    }

    @Override
    public String getFragmentShaderPathFromAssets() {
        return "demo/tab/opengl/psblend/lineardodge.frag";
    }
}