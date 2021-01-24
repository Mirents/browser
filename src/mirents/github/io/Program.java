/*
 * Основной класс для запуска программы
 */
package mirents.github.io;

public class Program {

    public static void main(String[] args) {
        SweetBox sweetBox = new SweetBox();
        sweetBox.showBoxAllInfo();
        sweetBox.add(new Candy("Русалочка", 2.3, 6.4));
        sweetBox.add(new Candy("Весна", 1.9, 3.4, "Без начинки"));
        sweetBox.add(new Candy("Левушка", 3.1, 7.2, "Вареная сгущенка"));
        sweetBox.showBoxAllInfo();
        sweetBox.getBoxPrice();
        sweetBox.getBoxWeight();
        sweetBox.showBoxAllInfo();
        sweetBox.optimizeForWeight(4.0);
        sweetBox.getBoxPrice();
        sweetBox.getBoxWeight();
    }
    
}
