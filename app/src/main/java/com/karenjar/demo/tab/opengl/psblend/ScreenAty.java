package com.karenjar.demo.tab.opengl.psblend;

/**
 * <pre>
 *     滤色混合
 *     可以将滤色看作是正片叠底的相反，因为算法是将两个输入值的相反相乘，再将结果反转。
 *     由算法可知，与黑色混合时没有效果
 * </pre>
 * Created by Dandy
 * Wechat: flycatdeng
 */
public class ScreenAty extends PSBlendAty {
    @Override
    public String getVertexShaderPathFromAssets() {
        return "demo/tab/opengl/psblend/normal.vert";
    }

    @Override
    public String getFragmentShaderPathFromAssets() {
        return "demo/tab/opengl/psblend/screen.frag";
    }
}