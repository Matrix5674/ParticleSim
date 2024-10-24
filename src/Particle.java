import processing.core.PApplet;
import processing.core.PVector;

public class Particle {
    public float getSize() {
        return size;
    }

    // TODO: add attributes
    private PVector pos;
    private PVector vel;
    private PVector acc;
    private float size;

    public Particle(float x, float y) {
        pos = new PVector();
        pos.set(x, y);
        vel = new PVector();
        acc = new PVector();

        size = 40;
    }


    public PVector getVel() {
        return vel;
    }

    public Particle setVel(PVector vel) {
        this.vel = vel;
        return this;
    }

    public PVector getAcc() {
        return acc;
    }

    public Particle setAcc(PVector acc) {
        this.acc = acc;
        return this;
    }

    public PVector getPos() {
        return pos;
    }

    public Particle setPos(PVector pos) {
        this.pos = pos;
        return this;
    }

    public void update() {
        // update velocity and position
        vel.add(acc);
        pos.add(vel);
        acc.setMag(0);
    }

    public void applyForce(PVector f) {
        // a force affects the acceleration
        acc.add(f);

    }

    public void draw(PApplet window) {
        window.fill(0);
        window.ellipse(pos.x, pos.y, size, size);
    }
}
