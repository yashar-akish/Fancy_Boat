
package Boat;

import java.util.ArrayList;
import java.util.List;

public class KeySubject {
    
    private int state;
    private final List<OldObserver> observers = new ArrayList<>();
    
    public void add(OldObserver o){
        observers.add(o);
    }
    
    public int getState(){
        return state;
    }
    
    public void setState(int value){
        this.state = value;
        execute();
    }
    
    private void execute(){
        for(OldObserver obv : observers){
            obv.update();
        }
    }
}
