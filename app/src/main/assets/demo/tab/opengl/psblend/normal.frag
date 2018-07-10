precision mediump float;
uniform sampler2D uBackgroundTexture;
uniform sampler2D uForegroundTexture;
uniform float uBlendStrength;

varying vec2 vTextureCoord;

        /*
        * 正常混合
        */
        vec4 NormalBlend(vec4 bgColor, vec4 fgColor, float opacity)//正常混合
        {
            if(fgColor.a > 0.0){
                mediump vec4 result;
                result.rgb = fgColor.rgb+ bgColor.rgb * (1.0 - fgColor.a);
                result.rgb = clamp(result.rgb, 0.0, 1.0);
                result.a = max(fgColor.a, bgColor.a);
                return mix(bgColor, result, opacity);
            }
            return bgColor;
        }

void main() {
    vec4 backgroundColor = texture2D(uBackgroundTexture, vTextureCoord);
    vec4 foregroundColor = texture2D(uForegroundTexture, vTextureCoord);

     gl_FragColor = NormalBlend(backgroundColor,foregroundColor,uBlendStrength);
}