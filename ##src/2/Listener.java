
package Boat;

public class Listener implements Observer{

    private int delay;
    private Subject publisher;
    
    public Listener(Subject publisher){
        this.publisher = publisher;
        publisher.register(this);
    }
    @Override
    public void update(int delay) {
        this.delay = delay;
    }
    
}
