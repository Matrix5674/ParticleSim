import processing.core.PApplet;
import processing.core.PVector;

public class FireSystem extends ParticleSystem{
    public FireSystem (int numOfParticles, int width, int height){
        super(numOfParticles, width, height);
    }

    public void createSystem(){
        for (int i = 0; i < numOfParticles; i++) {
            addParticles(1);
        }
    }

    @Override
    public void addParticles(int amount){
        for (int i = 0; i < amount; i++) {
            PVector pos = new PVector((float)width/2, height);
            PVector velocity = new PVector((float)(Math.random()*(-20) + 10), (float)(Math.random()*(-2)  - 3));
            PVector acceleration = new PVector(0, -1);
            Particle p = new Particle(pos.x, pos.y, 5, 5)
                    .setVel(velocity)
                    .setAcc(acceleration);
            particleList.add(p);
        }

    }

    public void draw(PApplet window){
        for(Particle p : particleList){

            p.draw(window);
        }
    }

    public void update(PApplet window){
        for(Particle p : particleList){
            p.update();
        }


    }
}
