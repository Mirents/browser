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
    
    // Добавление элемента
    @Override
    public void add(Sweetness newSweet) {
        giftList.add(newSweet);
        System.out.println("Добавлено: " + newSweet.toString());
    }

    // Удаление элемента по номеру
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
            System.out.println("Коробка с подарками пустая");
        }
    }

    // Удаление последнего элемента
    @Override
    public void deleteLast() {
        deleteIndex(giftList.size()-1);
    }

    // Узнать вес подарка
    @Override
    public void getBoxWeight() {
        if(!giftList.isEmpty()) {
            double weight = 0.0f;
            for(Sweetness sw : giftList)
                weight += sw.getWeight();
            System.out.println("Общий вес коробки с подарками: " + weight);
        } else {
            System.out.println("Коробка с подарками пустая");
        }
    }

    // Узнать стоимость подарка
    @Override
    public void getBoxPrice() {
         if(!giftList.isEmpty()) {
            double price = 0.0f;
            for(Sweetness sw : giftList)
                price += sw.getPrice();
            System.out.println("Общая стоимость коробки с подарками: " + price);
        } else {
            System.out.println("Коробка с подарками пустая");
        }
    }

    // Показать всю информацию о содержимом подарка
    @Override
    public void showBoxAllInfo() {
        if(!giftList.isEmpty()) {
            System.out.println("Список содержимого коробки:");
            for(Sweetness sw : giftList) {
                System.out.println(sw.toString());
            }
        } else {
            System.out.println("Коробка с подарками пустая");
        }
    }

    // Оптимизация по стоимости
    // Не придумал ничего лучше рекурсии, хотя можно было реализовать через цикл,
    // но я посчитал это целесообразным только в том случае, если нужно возвращать
    // новый оптимизированный список подарков
    @Override
    public void optimizeForPrice(double minimum) {
        double param = 0.0f;
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
                this.deleteIndex(numMin);
                optimizeForPrice(minimum);
            } else {
                System.out.println("Коробка оптимизирована по цене - " 
                        + minimum + " р.");
                showBoxAllInfo();
            }
        } else {
            System.out.println("Коробка с подарками пустая");
        }
    }

    // Оптимизация по весу
    // Не самое изящное решение продублировать предыдущий метод, но пришлось
    // к нему прибегнуть
    @Override
    public void optimizeForWeight(double minimum) {
        double param = 0.0f;
        if(!giftList.isEmpty()) {
            for(Sweetness sw: giftList)
                    param += sw.getWeight();
            
            if(param > minimum) 
            {
                double minWeight = giftList.get(0).getWeight();
                int numMin = 0;
                
                for(int i = 0; i < giftList.size(); i++) {
                    if(giftList.get(i).getPrice() < minWeight) {
                       minWeight =  giftList.get(i).getWeight();
                       numMin = i;
                    }
                }
                this.deleteIndex(numMin);
                optimizeForWeight(minimum);
            } else {
                System.out.println("Коробка оптимизирована по весу - " 
                        + minimum + " гр.");
                showBoxAllInfo();
            }
        } else {
            System.out.println("Коробка с подарками пустая");
        }
    }
    
    // По условию задачи к содержимому подарка нет доступа, но этот метод
    // добавлен для юнит теста - проверки количества элементов в подарке
    public int getSize() {
        return giftList.size();
    }
}
