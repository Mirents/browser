/*
 * Класс шоколада, к уникальному параметру относится "Наполнитель"
 */
package io.github.mirents.sweets;

public class Chocolate extends Sweetness {
    private String filler;
    
    public Chocolate(String name, double weight, double price) {
        super(name, weight, price);
        setSweetFeature("Крекер с темным шоколадом");
    }
    
    public Chocolate(String name, double weight, double price, String param) {
        super(name, weight, price);
        setSweetFeature(param);
    }

    @Override
    public String getSweetFeature() {
        return filler;
    }

    @Override
    protected void setSweetFeature(String param) {
        filler = param;
    }
    
    @Override
    public String toString(){
        return super.toString() + " Наполнитель: " + getSweetFeature();
    }
}
