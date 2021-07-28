
package Boat;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Stop extends OldObserver{
    
    public Stop(KeySubject subject){
        this.subject = subject;
        this.subject.add(this);
    }
    
    @Override
    public void update(){
        try {
            wait();
        } catch (InterruptedException ex) {
            Logger.getLogger(Stop.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}