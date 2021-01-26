/*
 * Класс яйца с сюрпризом, к уникальному параметру относится "Сюрприз"
 */
package io.github.mirents.sweets;

public class EggSurprise extends Sweetness {
    private String surprise;
    
    public EggSurprise(String name, double weight, double price) {
        super(name, weight, price);
        setSweetFeature("Заводной мотоцикл");
    }
    
    public EggSurprise(String name, double weight, double price, String param) {
        super(name, weight, price);
        setSweetFeature(param);
    }
    
    @Override
    public String getSweetFeature() {
        return surprise;
    }

    @Override
    protected void setSweetFeature(String param) {
        surprise = param;
    }
    
    @Override
    public String toString(){
        return super.toString() + " Сюрприз: " + getSweetFeature();
    }
}
