/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategydesignpattern2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rabi Siddique
 */
public class ShoppingCart {
    
    List<Item> items;

    public ShoppingCart() {
        this.items = new ArrayList<Item>();
    }
    
    public void addItem(Item item){
        this.items.add(item);
    }
    
    public void removeItem(Item item){
        this.items.remove(item);
    }
    
    public int calculateTotal(){
        int sum = 0;
        for(Item item: items){
            sum += item.getPrice();
        }
        
        return sum;
    }
    
    public void pay(PaymentStrategy paymentMethod){
        int amount = calculateTotal();
        paymentMethod.pay(amount);
    }
}
