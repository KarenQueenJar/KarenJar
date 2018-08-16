package com.karenjar.demo.tab.opengl.psblend;

/**
 * <pre>
 *     柔光模式（Soft Light模式）
 *     作用效果如同是打上一层色调柔和的光，因而被我们称之为柔光。作用时将上层图像以柔光的方式施加到下层。
 *     当底层图层的灰阶趋于高或低，则会调整图层合成结果的阶调趋于中间的灰阶调，而获得色彩较为柔和的合成效果。
 *     形成的结果是：图像的中亮色调区域变得更亮，暗色区域变得更暗，图像反差增大类似于柔光灯的照射图像的效果。
 *     变暗还是提亮画面颜色，取决于上层颜色信息。产生的效果类似于为图像打上一盏散射的聚光灯。
 *     如果上层颜色（光源）亮度高于50%灰，底层会被照亮（变淡）。
 *     如果上层颜色（光源）亮度低于50%灰，底层会变暗，就好像被烧焦了似的。
 *     如果直接使用黑色或白色去进行混合的话，能产生明显的变暗或者提亮效应，但是不会让覆盖区域产生纯黑或者纯白
 * </pre>
 * Created by Dandy
 * Wechat: flycatdeng
 */
public class SoftLightAty extends PSBlendAty {
    @Override
    public String getVertexShaderPathFromAssets() {
        return "demo/tab/opengl/psblend/normal.vert";
    }

    @Override
    public String getFragmentShaderPathFromAssets() {
        return "demo/tab/opengl/psblend/softlight.frag";
    }
}