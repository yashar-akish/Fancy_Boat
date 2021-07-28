/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Boat;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author YASHAR
 */
public class Speed implements Subject {
    
    private List<Direction> dirc = new ArrayList<>();
    private int delay;
    
    @Override
    public void subscribe(Direction dir){
        dirc.add(dir);
    }
    @Override
    public void unSubscribe(Direction dir){
        dirc.remove(dir);
    }
    
    @Override
    public void notifySubscribers(){
        for(Direction dc : dirc){
            dc.update(delay);
        }
    }
    
    @Override
    public void upload(int delay){
        this.delay = delay;
    }
}
