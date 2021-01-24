/*
 * Класс шоколада, к уникальному параметру относится "Наполнитель"
 */
package io.github.mirents;

public class SwChocolate extends Sweetness {
    private String filler;
    
    SwChocolate(String name, double weight, double price) {
        super(name, weight, price);
        setSweetFeature("Крекер с темным шоколадом");
    }
    
    SwChocolate(String name, double weight, double price, String param) {
        super(name, weight, price);
        setSweetFeature(param);
    }

    @Override
    public String getSweetFeature() {
        return filler;
    }

    @Override
    public void setSweetFeature(String param) {
        this.filler = param;
    }
    
    @Override
    public String toString(){
        return super.toString() + " Наполнитель: " + getSweetFeature();
    }
}
