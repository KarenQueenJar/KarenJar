package com.karenjar.demo.tab.opengl.psblend;

/**
 * <pre>
 *     强光混合（和叠加混合很像，只不过判断的对象是上层图像blend图）
 *     先计算blend图（上层图像）的亮度值，如果亮度值小于0.5则base乘以blend（相当于正片叠底，但是又有乘以2,所以是变暗后又变亮了，但总体还是暗了的）
 *     如果亮度值大于0.5则做滤色处理（反色相乘后也乘以亮2）。
 *     一般是会分别计算rgb通道与0.5的大小比较来替代点乘luma因子。
 *     所以最终效果使得结果图随blend图亮处更亮，暗处更暗
 * </pre>
 * Created by Dandy
 * Wechat: flycatdeng
 */
public class HardLightAty extends PSBlendAty {
    @Override
    public String getVertexShaderPathFromAssets() {
        return "demo/tab/opengl/psblend/normal.vert";
    }

    @Override
    public String getFragmentShaderPathFromAssets() {
        return "demo/tab/opengl/psblend/hardlight.frag";
    }
}