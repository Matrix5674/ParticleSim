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

    public int getNumOfParticles() {
        return numOfParticles;
    }

    public ArrayList<Particle> getParticleList() {
        return particleList;
    }


}
