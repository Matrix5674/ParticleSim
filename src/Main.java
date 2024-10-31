import processing.core.PApplet;
import processing.core.PVector;

import java.util.ArrayList;

public class Main extends PApplet {
    PVector gravity = new PVector(0, 0.4f);
    ArrayList<Particle> particles = new ArrayList<>();
    public static final int numberOfParticles = 100;
    RainSystem RS = new RainSystem(500, 600, 600);
    FireSystem FS = new FireSystem(100, 600, 600);

    public void settings() {
        size(600,600);
    }

    public void setup() {
        FS.createSystem();
    }

    public void draw() {
        background(255);
        FS.update (this);
    }

    public static void main(String[] args) {
        PApplet.main("Main");
    }
}