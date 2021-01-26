/*
 * Класс глазированного печенья, к уникальному параметру относится
 * "Состав глазури"
 */
package io.github.mirents.sweets;

public class GlazedCookies extends Sweetness {
    private String glazeComposition;

    public GlazedCookies(String name, double weight, double price) {
        super(name, weight, price);
        setSweetFeature("Малиновый сироп");
    }
    
    public GlazedCookies(String name, double weight, double price, String param) {
        super(name, weight, price);
        setSweetFeature(param);
    }

    @Override
    public String getSweetFeature() {
        return glazeComposition;
    }

    @Override
    protected void setSweetFeature(String param) {
        glazeComposition = param;
    }
    
    @Override
    public String toString(){
        return super.toString() + " Состав глазури: " + getSweetFeature();
    }
}
