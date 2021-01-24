/*
 * Класс коробки со всеми сладостями
 */
package mirents.github.io;

import java.util.ArrayList;
import java.util.List;


public class SweetBox implements BoxUsing {
    // Массив сладостей
    List<Sweetness> giftList;

    // Конструктор класса
    SweetBox() {
        // Создание массива для хранения сладостей
        this.giftList = new ArrayList<>();
    }
    
    @Override
    public void add(Sweetness newSweet) {
        giftList.add(newSweet);
    }

    @Override
    public boolean deleteIndex(int num) {
        if(!giftList.isEmpty()) {
            if(num > 0 && num < giftList.size()) {
                giftList.remove(num--);
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @Override
    public boolean deleteLast() {
        return deleteIndex(giftList.size());
    }

    @Override
    public double getBoxWeight() {
        if(!giftList.isEmpty()) {
            double weight = 0.0;
            for(Sweetness sw : giftList)
                weight += sw.getWeight();
            return weight;
        } else {
            return 0.0;
        }
    }

    @Override
    public double getBoxPrice() {
         if(!giftList.isEmpty()) {
            double price = 0.0;
            for(Sweetness sw : giftList)
                price += sw.getPrice();
            return price;
        } else {
            return 0.0;
        }
    }

    @Override
    public void showBoxAllInfo() {
        if(!giftList.isEmpty()) {
            for(Sweetness sw : giftList)
                System.out.println(sw.toString());
        } else {
            System.out.println("Коробка с подарками пустая");
        }
        
    }
    
}
