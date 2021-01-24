/*
 * Класс конфеты, к уникальному параметру относится "Начинка"
 */
package io.github.mirents;

public class SwCandy extends Sweetness {
    private String filling;

    SwCandy(String name, double weight, double price) {
        super(name, weight, price);
        setSweetFeature("Молочный мусс с фундуком");
    }

    SwCandy(String name, double weight, double price, String param) {
        super(name, weight, price);
        setSweetFeature(param);
    }
    
    @Override
    public String getSweetFeature() {
        return filling;
    }

    @Override
    public void setSweetFeature(String param) {
        this.filling = param;
    }
    
    @Override
    public String toString(){
        return super.toString() + " Начинка: " + getSweetFeature();
    }
}
