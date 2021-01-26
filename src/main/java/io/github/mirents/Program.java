package io.github.mirents;

/*
 * Основной класс для запуска программы
 */


import io.github.mirents.sweets.*;
import io.github.mirents.box.SweetBox;

public class Program {

    public static void main(String[] args) {
        // Создание экземпляра класса коробки со сладостями
        SweetBox sweetBox = new SweetBox();
        // Наполнение коробки со сладостями
        System.out.println("_________________________________________________");
        sweetBox.add(new Candy("Русалочка", 19.0, 29.0));
        sweetBox.add(new Candy("Весна",     18.0, 28.0, "Без начинки"));
        sweetBox.add(new Candy("Левушка",   17.0, 27.0, "Вареная сгущенка"));
        sweetBox.add(new Chocolate("Бабаевский", 16.0, 26.0));
        sweetBox.add(new Chocolate("Нестле", 15.0, 25.0, "Грецкий орех"));
        sweetBox.add(new EggSurprise("Киндер Сюрприз", 14.0, 21.0, "Минивелосипед"));
        sweetBox.add(new GlazedCookies("Печенька", 13.0, 24.0, "Патока"));
        // Вывод всей информации о содержимом подарка
        sweetBox.showBoxAllInfo();
        // Вывод стоимости подарка
        System.out.println("Стоимость подарка " + sweetBox.getBoxPrice() + " р.");
        // Вывод веса подарка
        System.out.println("Вес подарка " + sweetBox.getBoxWeight() + " гр.");
        System.out.println("_________________________________________________\n");
        // Оптиизация по стоимости
        sweetBox.optimizeForPrice(159.0);
        // Вывод стоимости подарка
        System.out.println("Стоимость подарка " + sweetBox.getBoxPrice() + " р.");
        // Вывод веса подарка
        System.out.println("Вес подарка " + sweetBox.getBoxWeight() + " гр.");
        System.out.println("_________________________________________________\n");
        // Оптиизация по весу
        sweetBox.optimizeForWeight(78.0);
        // Вывод стоимости подарка
        System.out.println("Стоимость подарка " + sweetBox.getBoxPrice() + " р.");
        // Вывод веса подарка
        System.out.println("Вес подарка " + sweetBox.getBoxWeight() + " гр.");
    }
    
}
