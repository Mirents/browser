/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mirents.github.io;

public class Сandy extends Sweetness {
    private String filling;
    
    Сandy(String name, double weight, double price, String filling) {
        super(name, weight, price);
        this.filling = filling;
    }
}
