/*
 * Класс яйца с сюрпризом, к уникальному параметру относится "Сюрприз"
 */
package io.github.mirents;

public class SwEggSurprise extends Sweetness {
    private String surprise;
    
    SwEggSurprise(String name, double weight, double price) {
        super(name, weight, price);
        setSweetFeature("Заводной мотоцикл");
    }
    
    SwEggSurprise(String name, double weight, double price, String param) {
        super(name, weight, price);
        setSweetFeature(param);
    }
    
    @Override
    public String getSweetFeature() {
        return surprise;
    }

    @Override
    public void setSweetFeature(String param) {
        this.surprise = param;
    }
    
    @Override
    public String toString(){
        return super.toString() + " Сюрприз: " + getSweetFeature();
    }
}
