precision mediump float;
uniform sampler2D inputImageTexture;
uniform sampler2D inputImageTexture2;
uniform float uBlendStrength;

varying vec2 textureCoordinate;

float blendSubtract(float base, float blend) {
    return max(base-blend,0.0);
}

vec3 blendSubtract(vec3 base, vec3 blend) {
    return max(base-blend,vec3(0.0));
}

vec3 blendSubtract(vec3 base, vec3 blend, float opacity) {
    return mix(base,blendSubtract(base, blend) ,opacity);
}

void main() {
    vec4 backgroundColor = texture2D(inputImageTexture, textureCoordinate);
    vec4 foregroundColor = texture2D(inputImageTexture2, textureCoordinate);

     gl_FragColor = vec4(blendSubtract(backgroundColor.rgb,foregroundColor.rgb,uBlendStrength),1.0);
}