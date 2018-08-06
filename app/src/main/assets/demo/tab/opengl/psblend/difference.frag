precision mediump float;
uniform sampler2D inputImageTexture;
uniform sampler2D inputImageTexture2;
uniform float uBlendStrength;

varying vec2 textureCoordinate;

vec3 blendDifference(vec3 base, vec3 blend) {
    return abs(base-blend);
}

vec3 blendDifference(vec3 base, vec3 blend, float opacity) {
    return mix(base,blendDifference(base, blend) ,opacity);
}

void main() {
    vec4 backgroundColor = texture2D(inputImageTexture, textureCoordinate);
    vec4 foregroundColor = texture2D(inputImageTexture2, textureCoordinate);

     gl_FragColor = vec4(blendDifference(backgroundColor.rgb,foregroundColor.rgb,uBlendStrength),1.0);
}