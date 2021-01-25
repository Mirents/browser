/*
 * Основной класс для запуска программы
 */
package io.github.mirents;

public class Program {

    public static void main(String[] args) {
        // Создание экземпляра класса коробки со сладостями
        SweetBox sweetBox = new SweetBox();
        // Наполнение коробки со сладостями
        System.out.println("_________________________________________________");
        sweetBox.add(new SwCandy("Русалочка", 19.0, 29.0));
        sweetBox.add(new SwCandy("Весна",     18.0, 28.0, "Без начинки"));
        sweetBox.add(new SwCandy("Левушка",   17.0, 27.0, "Вареная сгущенка"));
        sweetBox.add(new SwChocolate("Бабаевский", 16.0, 26.0));
        sweetBox.add(new SwChocolate("Нестле", 15.0, 25.0, "Грецкий орех"));
        sweetBox.add(new SwEggSurprise("Киндер Сюрприз", 14.0, 21.0, "Минивелосипед"));
        sweetBox.add(new SwGlazedCookies("Печенька", 13.0, 24.0, "Патока"));
        // Вывод всей информации о содержимом подарка
        sweetBox.showBoxAllInfo();
        // Вывод стоимости подарка
        sweetBox.getBoxPrice();
        // Вывод веса подарка
        sweetBox.getBoxWeight();
        System.out.println("_________________________________________________\n");
        // Оптиизация по стоимости
        sweetBox.optimizeForPrice(159.0);
        // Вывод стоимости подарка
        sweetBox.getBoxPrice();
        // Вывод веса подарка
        sweetBox.getBoxWeight();
        System.out.println("_________________________________________________\n");
        // Оптиизация по весу
        sweetBox.optimizeForWeight(78.0);
        // Вывод стоимости подарка
        sweetBox.getBoxPrice();
        // Вывод веса подарка
        sweetBox.getBoxWeight();
    }
    
}
