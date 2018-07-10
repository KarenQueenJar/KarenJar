attribute vec4 aPosition;//vertex
attribute vec4 aTextureCoord;//texture coordinate

varying vec2 vTextureCoord;

void main() {
    gl_Position = aPosition;
    vTextureCoord = aTextureCoord.xy;
}