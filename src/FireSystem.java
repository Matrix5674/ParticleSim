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


    public void addParticles(int amount){
        for (int i = 0; i < amount; i++) {
            PVector pos = new PVector((float)(Math.random() * (width / 2 + 30 - (width / 2 - 30)) + (width / 2 - 30)), height);
            PVector velocity = new PVector((float)(Math.random()*5 -2.5), -1);
            PVector acceleration;
            if (velocity.x > 0) {
                acceleration = new PVector(-2f, 0);
            } else {
                acceleration = new PVector(2f, 0);
            }



            fireParticle p = (fireParticle) new fireParticle(pos.x, pos.y, 5, 5, 10).setVel(velocity).setAcc(acceleration);

            particleList.add(p);
        }

    }

    public void update(){
        for (int i = 0; i < particleList.size(); i++) {
            fireParticle p = (fireParticle) particleList.get(i);
            p.update();
            if (p.getLifespan() == 0) {
                particleList.remove(p);
                addParticles(1);
            }
        }

    }





}
