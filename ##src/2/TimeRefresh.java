
package Boat;

public class TimeRefresh implements Runnable{
    
    
    private int delay;
    private Subject sub;
    
    public TimeRefresh(Subject sub, int newDelay){
        this.sub = sub;
        delay = newDelay;
    }

    @Override
    public void run() {
        try{
                Thread.sleep(20);
            }catch(InterruptedException e){}
        ((Publisher)sub).setDelay(delay);
    }
}
