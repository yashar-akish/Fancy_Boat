
package Boat;

import static java.lang.Thread.sleep;


public class Time implements Runnable {
    
    
    @Override
    public void run(){
        for(int i = 100; i >= 0 ; i--){
            try {
                sleep(200);
            } catch (InterruptedException ex) {
                    //Logger.getLogger(Field.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
