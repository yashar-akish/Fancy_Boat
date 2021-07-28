/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Boat;

/**
 *
 * @author YASHAR
 */
public class Direction implements Observer {
    
    private String name;
    private Speed speed = new Speed();
    private int delay;
    //private Group group = new Group();
    
    public Direction(String name){
        super();
        this.name = name;
    }
    
    
    @Override
    public void update(int delay){
        this.delay = delay;
    }
    
    
    @Override
    public void subscribeSpeed(Speed sp){
        speed = sp;
    }
}
