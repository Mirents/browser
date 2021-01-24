/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.mirents;

/**
 *
 * @author vadim
 */
public class Candy extends Sweetness {
    private String filling;

    public Candy(String name, double weight, double price) {
        super(name, weight, price);
        setFilling("Молочный мусс с фундуком");
    }

    public Candy(String name, double weight, double price, String filling) {
        super(name, weight, price);
        setFilling(filling);
    }

    public String getFilling() {
        return filling;
    }

    public void setFilling(String filling) {
        this.filling = filling;
    }
    
    @Override
    public String toString(){
        return super.toString() + " Начинка: " + getFilling();
    }
}
