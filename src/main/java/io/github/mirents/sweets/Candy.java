/*
 * Класс конфеты, к уникальному параметру относится "Начинка"
 */
package io.github.mirents.sweets;

public class Candy extends Sweetness {
    private String filling;

    public Candy(String name, double weight, double price) {
        super(name, weight, price);
        setSweetFeature("Молочный мусс с фундуком");
    }

    public Candy(String name, double weight, double price, String param) {
        super(name, weight, price);
        setSweetFeature(param);
    }
    
    @Override
    public String getSweetFeature() {
        return filling;
    }

    @Override
    protected void setSweetFeature(String param) {
        filling = param;
    }
    
    @Override
    public String toString(){
        return super.toString() + " Начинка: " + getSweetFeature();
    }
}
