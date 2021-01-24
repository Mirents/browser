/*
 * Класс коробки со всеми сладостями
 */
package io.github.mirents;

import java.util.ArrayList;
import java.util.List;


public class SweetBox implements BoxUsing {
    // Массив сладостей
    private List<Sweetness> giftList;

    // Конструктор класса
    SweetBox() {
        // Создание массива для хранения сладостей
        this.giftList = new ArrayList<>();
    }
    
    @Override
    public void add(Sweetness newSweet) {
        giftList.add(newSweet);
        System.out.println("Добавлено: " + newSweet.toString());
    }

    @Override
    public void deleteIndex(int num) {
        if(!giftList.isEmpty()) {
            if(num >= 0 && num < giftList.size()) {
                System.out.println("Удален элемент: " + giftList.get(num));
                giftList.remove(num);
            } else {
                System.out.println("Данного номера подарка нет в коробке");
            }
        } else {
            System.out.println("1-Коробка с подарками пустая");
        }
    }

    @Override
    public void deleteLast() {
        deleteIndex(giftList.size()-1);
    }

    @Override
    public void getBoxWeight() {
        if(!giftList.isEmpty()) {
            double weight = 0.0;
            for(Sweetness sw : giftList)
                weight += sw.getWeight();
            System.out.println("Общий вес коробки с подарками: " + weight);
        } else {
            System.out.println("2-Коробка с подарками пустая");
        }
    }

    @Override
    public void getBoxPrice() {
         if(!giftList.isEmpty()) {
            double price = 0.0;
            for(Sweetness sw : giftList)
                price += sw.getPrice();
            System.out.println("Общая стоимость коробки с подарками: " + price);
        } else {
            System.out.println("3-Коробка с подарками пустая");
        }
    }

    @Override
    public void showBoxAllInfo() {
        if(!giftList.isEmpty()) {
            System.out.println("__________________________");
            System.out.println("Список содержимого коробки:");
            for(Sweetness sw : giftList) {
                System.out.println(sw.toString());
            }
            System.out.println("__________________________");
        } else {
            System.out.println("4-Коробка с подарками пустая");
        }
    }

    @Override
    public void optimizeForPrice(double minimum) {
        double param = 0.0;
        if(!giftList.isEmpty()) {
            for(Sweetness sw: giftList)
                    param += sw.getPrice();
            
            if(param > minimum) 
            {
                double minPrice = giftList.get(0).getPrice();
                int numMin = 0;
                
                for(int i = 0; i < giftList.size(); i++) {
                    if(giftList.get(i).getPrice() < minPrice) {
                       minPrice =  giftList.get(i).getPrice();
                       numMin = i;
                    }
                }
                giftList.remove(numMin);
                optimizeForPrice(minimum);
            } else
                showBoxAllInfo();
        } else {
            System.out.println("5-Коробка с подарками пустая");
        }
    }

    @Override
    public void optimizeForWeight(double minimum) {
        double param = 0.0;
        if(!giftList.isEmpty()) {
            for(Sweetness sw: giftList)
                    param += sw.getWeight();
            
            if(param > minimum) 
            {
                double minWeight = giftList.get(0).getPrice();
                int numMin = 0;
                
                for(int i = 0; i < giftList.size(); i++) {
                    if(giftList.get(i).getPrice() < minWeight) {
                       minWeight =  giftList.get(i).getWeight();
                       numMin = i;
                    }
                }
                System.out.println("Удаление элемента " + giftList.get(numMin));
                giftList.remove(numMin);
                optimizeForWeight(minimum);
            } else
                showBoxAllInfo();
        } else {
            System.out.println("6-Коробка с подарками пустая");
        }
    }
    
}
