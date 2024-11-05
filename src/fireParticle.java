import processing.core.PApplet;
import processing.core.PVector;

public class fireParticle extends Particle{
    private float x, y, sizeX, sizeY;
    private float r, g, b, LIFESPAN;
    public fireParticle(float x, float y, float sizeX, float sizeY, float LIFESPAN){
        super(x, y, sizeX, sizeY);
        setPos(new PVector(x, y));
        this.sizeX = sizeX;
        this.sizeY = sizeY;
        this.r = 255;
        this.g = 255;
        this.b = 0;
        this.LIFESPAN = (float) Math.random()*3; //time in seconds
    }

    public float getLifespan() {
        return LIFESPAN;
    }

    public void update(){
        vel.add(acc);
        pos.add(vel);
        acc.setMag(0);
        if (g > 115) g -= 140/(30*LIFESPAN); // 155 is the target color value. 140(30*3)
        else LIFESPAN=0;                          // is how I make the color change in "LIFETIME" seconds.
    }


    public void draw(PApplet window){
        window.fill(r, g, b);
        window.ellipse(this.getPos().x, this.getPos().y, sizeX, sizeY);

    }
}
