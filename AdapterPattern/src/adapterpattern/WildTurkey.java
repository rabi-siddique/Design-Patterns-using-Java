/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapterpattern;

/**
 *
 * @author Rabi Siddique
 */
public class WildTurkey implements Turkey {
    
    public void gobble(){
    
        System.out.println("Gobble!");
    }
    
    public void fly(){
    
        System.out.println("I am flying a short distance");
    }
    
}
