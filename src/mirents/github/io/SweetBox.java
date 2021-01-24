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
        List<Sweetness> giftList = new ArrayList<>();
    }
    
    @Override
    public void add(Sweetness newSweet) {
        giftList.add(newSweet);
    }

    @Override
    public boolean deleteIndex(int num) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deleteLast() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getWeightBox() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getPriceBox() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void getAllAboutBox() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
