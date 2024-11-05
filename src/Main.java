import processing.core.PApplet;
import processing.core.PVector;

import java.util.ArrayList;

public class Main extends PApplet {
    PVector gravity = new PVector(0, 0.4f);
    ArrayList<Particle> particles = new ArrayList<>();
    public static final int numberOfRainParticles = 100;
    public static final int numberOfFireParticles = 400;

    ParticleSystem RS = new RainSystem(numberOfRainParticles, 600, 600);
    ParticleSystem FS = new FireSystem(numberOfFireParticles, 600, 600);

    public void settings() {
        size(600,600);
    }

    public void setup() {
        FS.createSystem();
    }

    public void draw() {
        background(255);
        FS.update();
        FS.draw(this);
    }

    public static void main(String[] args) {
        PApplet.main("Main");
    }
}