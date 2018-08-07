precision mediump float;
uniform sampler2D inputImageTexture;
uniform sampler2D inputImageTexture2;
uniform float uBlendStrength;

varying vec2 textureCoordinate;

float blendHardLight(float base, float blend) {
	return blend<0.5?(2.0*base*blend):(1.0-2.0*(1.0-base)*(1.0-blend));
}

vec3 blendHardLight(vec3 base, vec3 blend) {
	return vec3(blendHardLight(base.r,blend.r),blendHardLight(base.g,blend.g),blendHardLight(base.b,blend.b));
}

vec3 blendHardLight(vec3 base, vec3 blend, float opacity) {
	return mix(base,blendHardLight(base, blend) ,opacity);
}

void main() {
    vec4 backgroundColor = texture2D(inputImageTexture, textureCoordinate);
    vec4 foregroundColor = texture2D(inputImageTexture2, textureCoordinate);

     gl_FragColor = vec4(blendHardLight(backgroundColor.rgb,foregroundColor.rgb,uBlendStrength),1.0);
}