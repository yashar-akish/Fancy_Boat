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
public interface Observer {

    void subscribeSpeed(Speed sp);
    void update(int delay);
    
}
