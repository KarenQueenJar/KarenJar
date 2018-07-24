attribute vec4 position;//vertex
attribute vec4 inputTextureCoordinate;//texture coordinate

varying vec2 textureCoordinate;

void main() {
    gl_Position = position;
    textureCoordinate = inputTextureCoordinate.xy;
}