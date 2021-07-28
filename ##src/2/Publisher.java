
package Boat;

import java.util.ArrayList;

public class Publisher implements Subject{

    private ArrayList<Observer> observers;
    private int delay;
    
    public Publisher(){
        observers = new ArrayList<Observer>();
    }
    
    public void setDelay(int delay){
        this.delay = delay;
        notifyObserver();
    }
    
    @Override
    public void register(Observer o) {
        observers.add(o);
    }

    @Override
    public void notifyObserver() {
        for(Observer obs : observers){
            obs.update(delay);
        }
    }
    
}
