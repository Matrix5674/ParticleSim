import processing.core.PApplet;
import processing.core.PVector;

import java.util.ArrayList;

public class ParticleSystem {
    private int numOfParticles;
    private ArrayList<Particle> particleList;

    public ParticleSystem(int numOfParticles){
        this.numOfParticles = numOfParticles;
        particleList = new ArrayList<>();
    }

    public int getNumOfParticles() {
        return numOfParticles;
    }

    public ArrayList<Particle> getParticleList() {
        return particleList;
    }

    public void createSystem(int x, int x2, int y, int y2, float velX, float velY, float accX, float accY, boolean random){
        if (random){
            for (int i = 0; i < numOfParticles; i++) {
                Particle p = new Particle((float)Math.random()*x + x2, (float)Math.random()*y + y2)
                        .setVel(new PVector(velX, velY))
                        .setAcc(new PVector(accX, accY));
                particleList.add(p);
            }
        } else {
            for (int i = 0; i < numOfParticles; i++) {
                Particle p = new Particle(x, y)
                        .setVel(new PVector(velX, velY))
                        .setAcc(new PVector(accX, accY));

                particleList.add(p);
            }
        }
    }

    public void act(PApplet window){
        for (Particle p : particleList){
            p.update();
            p.draw(window);
        }
    }



}
