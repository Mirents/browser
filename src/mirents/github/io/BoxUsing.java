/*
 * Интерфейс для реализации методов, использующихся в коробке с подарками
 */
package mirents.github.io;

public interface BoxUsing {
    // Добавление элемента
    public void add(Sweetness newSweet);
    // Удаление элемента по номеру
    public boolean deleteIndex(int num);
    // Удаоение последнего элемента
    public boolean deleteLast();
    // Получить вес коробки
    public double getBoxWeight();
    // Получить стоимость коробки
    public double getBoxPrice();
    // Отобразить всю информацию о содержимом коробки
    public void showBoxAllInfo();
}
