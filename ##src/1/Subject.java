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
public interface Subject {

    void notifySubscribers();

    void subscribe(Direction dir);

    void unSubscribe(Direction dir);

    void upload(int delay);
    
}
