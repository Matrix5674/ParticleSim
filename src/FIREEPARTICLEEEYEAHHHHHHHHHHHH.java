import processing.core.PApplet;

public class FIREEPARTICLEEEYEAHHHHHHHHHHHH extends Particle{
    float x, y, sizeX, sizeY;
    public FIREEPARTICLEEEYEAHHHHHHHHHHHH(float x, float y, float sizeX, float sizeY){
        super(x, y, sizeX, sizeY);
        this.x = x;
        this.y = y;
        this.sizeX = sizeX;
        this.sizeY = sizeY;
    }

    public void draw(PApplet window, int r, int g, int b){
        window.fill(r, g, b);
        window.ellipse(x, y, sizeX, sizeY);

    }
}
