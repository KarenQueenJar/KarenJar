precision mediump float;
uniform sampler2D inputImageTexture;
uniform sampler2D inputImageTexture2;
uniform float uBlendStrength;

varying vec2 textureCoordinate;

float blendDarken(float base, float blend) {
    return min(blend,base);
}

vec3 blendDarken(vec3 base, vec3 blend) {
    return vec3(blendDarken(base.r,blend.r),blendDarken(base.g,blend.g),blendDarken(base.b,blend.b));
}

vec3 blendDarken(vec3 base, vec3 blend, float opacity) {
    return (blendDarken(base, blend) * opacity + base * (1.0 - opacity));
}

void main() {
    vec4 backgroundColor = texture2D(inputImageTexture, textureCoordinate);
    vec4 foregroundColor = texture2D(inputImageTexture2, textureCoordinate);

     gl_FragColor = vec4(blendDarken(backgroundColor.rgb,foregroundColor.rgb,uBlendStrength),1.0);
}