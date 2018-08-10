package com.karenjar.demo.tab.opengl.psblend;

/**
 * <pre>
 *      浅色(和PS的效果有点不一样呢)
 *     变浅是基色和混合色的RGB三个通道分别比较，然后取最大值，而浅色混合则是基色和混合色整体值比较取最大值
 *     所以像素结果色是两者之中的某一个（值大的）
 * </pre>
 * Created by Dandy
 * Wechat: flycatdeng
 */
public class LighterColorAty extends PSBlendAty {
    @Override
    public String getVertexShaderPathFromAssets() {
        return "demo/tab/opengl/psblend/normal.vert";
    }

    @Override
    public String getFragmentShaderPathFromAssets() {
        return "demo/tab/opengl/psblend/lightercolor.frag";
    }
}