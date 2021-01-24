/*
 * Класс глазированного печенья, к уникальному параметру относится
 * "Состав глазури"
 */
package io.github.mirents;

public class SwGlazedCookies extends Sweetness {
    private String glazeComposition;

    public SwGlazedCookies(String name, double weight, double price) {
        super(name, weight, price);
        setSweetFeature("Малиновый сироп");
    }
    
    public SwGlazedCookies(String name, double weight, double price, String param) {
        super(name, weight, price);
        setSweetFeature(param);
    }

    @Override
    public String getSweetFeature() {
        return glazeComposition;
    }

    @Override
    public void setSweetFeature(String param) {
        glazeComposition = param;
    }
    
    @Override
    public String toString(){
        return super.toString() + " Состав глазури: " + getSweetFeature();
    }
}
