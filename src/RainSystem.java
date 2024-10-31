import com.sun.xml.internal.ws.wsdl.writer.document.Part;
import processing.core.PApplet;
import processing.core.PVector;

public class RainSystem extends ParticleSystem {


    public RainSystem(int numOfParticles, int width, int height){
        super(numOfParticles, width, height);

    }

    public void createSystem(){
        for (int i = 0; i < numOfParticles; i++) {
            PVector velocity = new PVector(0, (float)(Math.random()*6+5));
            PVector acceleration = new PVector(0, 1);
            Particle p = new Particle((float)Math.random()*width + 1, 0, 2, 5)
                    .setVel(velocity)
                    .setAcc(acceleration);
            particleList.add(p);
        }
    }

    public void update(PApplet window){
        for (Particle p : particleList){
            p.update();
            if(p.getPos().y > height){
                p.setPos(new PVector((float)(Math.random()*width + 1), 0));
            }
            p.draw(window);
        }
    }
}
