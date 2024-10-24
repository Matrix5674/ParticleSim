import processing.core.PApplet;
import processing.core.PVector;

import java.util.ArrayList;

public class Main extends PApplet {
    PVector gravity = new PVector(0, 0.4f);
    ArrayList<Particle> particles = new ArrayList<>();
    public static final int numberOfParticles = 100;
    ParticleSystem PS = new ParticleSystem(500);

    public void settings() {
        size(600,600);
    }

    public void setup() {
        PS.createSystem(width/2, 0, 0, 0, (float)Math.random()*20 - 10, (float)Math.random()*20 - 10, (float)Math.random()*20 - 10, (float)Math.random()*20 - 10, false);
    }

    public void draw() {
        background(255);
        PS.act(this);
    }

    public static void main(String[] args) {
        PApplet.main("Main");
    }
}