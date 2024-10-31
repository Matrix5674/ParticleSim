import processing.core.PApplet;
import processing.core.PVector;

import java.util.ArrayList;

public class ParticleSystem {
    protected int numOfParticles;
    protected ArrayList<Particle> particleList;
    protected int width, height;

    public ParticleSystem(int numOfParticles, int width, int height){
        this.numOfParticles = numOfParticles;
        particleList = new ArrayList<>();
        this.width = width;
        this.height = height;
    }

    // update
    public void update(){
        for (Particle p : particleList){
            p.update();
        }
    }

    // draw()
    public void draw(PApplet window){
        for (Particle p : particleList){
            p.draw(window);
        }
    }

    // addParticles()
    public void addParticles(int amount){
        for (int i = 0; i < amount; i++) {
            particleList.add(new Particle(0, 0, 1, 1));
        }
    }

    public int getNumOfParticles() {
        return numOfParticles;
    }

    public ArrayList<Particle> getParticleList() {
        return particleList;
    }


}
