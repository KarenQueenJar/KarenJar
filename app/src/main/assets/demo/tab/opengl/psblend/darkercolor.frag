precision mediump float;
uniform sampler2D inputImageTexture;
uniform sampler2D inputImageTexture2;
uniform float uBlendStrength;

varying vec2 textureCoordinate;

vec3 blendDarker(vec3 base, vec3 blend) {
    if(base.r+base.g+base.b>blend.r+blend.g+blend.b){
        return blend;
    }
    return base;
}

vec3 blendDarker(vec3 base, vec3 blend, float opacity) {
    return (blendDarker(base, blend) * opacity + base * (1.0 - opacity));
}

void main() {
    vec4 backgroundColor = texture2D(inputImageTexture, textureCoordinate);
    vec4 foregroundColor = texture2D(inputImageTexture2, textureCoordinate);

     gl_FragColor = vec4(blendDarker(backgroundColor.rgb,foregroundColor.rgb,uBlendStrength),1.0);
}