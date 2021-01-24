/*
 * Базовый абстрактный класс для сущности сладость, от которой будут
 * унаследованы все сладости
 */
package io.github.mirents;

public abstract class Sweetness {
    private String name;
    private double weight;
    private double price;
    
    Sweetness (String name, double weight, double price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    @Override
    public String toString(){
        return "Название: " + getName() + " Вес: " + getWeight() +
                " гр., Стоимость: " + getPrice() + " р.";
    }
    
    public abstract String getSweetFeature();
    public abstract void setSweetFeature(String param);
}
