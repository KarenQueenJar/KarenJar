precision mediump float;
uniform sampler2D inputImageTexture;
uniform sampler2D inputImageTexture2;
uniform float uBlendStrength;

varying vec2 textureCoordinate;

float blendLinearDodge(float base, float blend) {
    return min(base+blend,1.0);
}

vec3 blendLinearDodge(vec3 base, vec3 blend) {
    return min(base+blend,vec3(1.0));
}

vec3 blendLinearDodge(vec3 base, vec3 blend, float opacity) {
    return mix(base,blendLinearDodge(base, blend) ,opacity);
}

void main() {
    vec4 backgroundColor = texture2D(inputImageTexture, textureCoordinate);
    vec4 foregroundColor = texture2D(inputImageTexture2, textureCoordinate);

     gl_FragColor = vec4(blendLinearDodge(backgroundColor.rgb,foregroundColor.rgb,uBlendStrength),1.0);
}