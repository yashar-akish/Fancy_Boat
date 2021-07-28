
package Boat;

public class Move extends OldObserver{
    
    public Move(KeySubject subject){
        this.subject = subject;
        this.subject.add(this);
    }
    
    @Override
    public void update(){
        Time newTime = new Time();
        newTime.run();
        //System.out.print("  " + Integer.toBinaryString(subject.getState()));
    }
    
}
