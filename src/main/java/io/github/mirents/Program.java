/*
 * Основной класс для запуска программы
 */
package io.github.mirents;

public class Program {

    public static void main(String[] args) {
        SweetBox sweetBox = new SweetBox();
        sweetBox.showBoxAllInfo();
        sweetBox.add(new SwCandy("Русалочка", 2.3, 6.4));
        sweetBox.add(new SwCandy("Весна",     1.9, 3.4, "Без начинки"));
        sweetBox.add(new SwCandy("Левушка",   3.1, 7.2, "Вареная сгущенка"));
        sweetBox.add(new SwChocolate("Бабаевский", 95.4, 74.5));
        sweetBox.add(new SwChocolate("Нестле", 64.2, 37.3, "Грецкий орех"));
        sweetBox.add(new SwEggSurprise("Киндер Сюрприз", 78.6, 121.2, "Минивелосипед"));
        sweetBox.add(new SwGlazedCookies("Печенька", 16.3, 13.7, "Патока"));
        sweetBox.showBoxAllInfo();
        sweetBox.getBoxPrice();
        sweetBox.getBoxWeight();
        sweetBox.showBoxAllInfo();
        sweetBox.optimizeForWeight(255.0);
        sweetBox.getBoxPrice();
        sweetBox.getBoxWeight();
    }
    
}
