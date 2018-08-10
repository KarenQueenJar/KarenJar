precision mediump float;
uniform sampler2D inputImageTexture;
uniform sampler2D inputImageTexture2;
uniform float uBlendStrength;

varying vec2 textureCoordinate;

vec3 blendDissolve(vec3 base, vec3 blend) {
    float random =(gl_FragCoord.x+gl_FragCoord.y)%2.0;
	return mix(base,blend,random);
}

vec3 blendDissolve(vec3 base, vec3 blend, float opacity) {
	return mix(base,blendDissolve(base, blend) ,opacity);
}

void main() {
    vec4 backgroundColor = texture2D(inputImageTexture, textureCoordinate);
    vec4 foregroundColor = texture2D(inputImageTexture2, textureCoordinate);

     gl_FragColor = vec4(blendDissolve(backgroundColor.rgb,foregroundColor.rgb,uBlendStrength),1.0);
}