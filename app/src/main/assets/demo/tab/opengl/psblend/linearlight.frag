precision mediump float;
uniform sampler2D inputImageTexture;
uniform sampler2D inputImageTexture2;
uniform float uBlendStrength;

varying vec2 textureCoordinate;

float blendLinearLight(in float base, in float blend) {
    return blend<0.5?max(base+(2.0*blend)-1.0, 0.0):min(base+(2.0*(blend-0.5)), 1.0);
}

vec3 blendLinearLight(in vec3 base, in vec3 blend) {
    return vec3(blendLinearLight(base.r,blend.r),blendLinearLight(base.g,blend.g),blendLinearLight(base.b,blend.b));
}

vec3 blendLinearLight(vec3 base, vec3 blend, float opacity) {
	return mix(base, blendLinearLight(base, blend), opacity);
}

void main() {
    vec4 backgroundColor = texture2D(inputImageTexture, textureCoordinate);
    vec4 foregroundColor = texture2D(inputImageTexture2, textureCoordinate);

     gl_FragColor = vec4(blendLinearLight(backgroundColor.rgb,foregroundColor.rgb,uBlendStrength),1.0);
}