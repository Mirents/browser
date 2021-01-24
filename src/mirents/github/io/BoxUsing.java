/*
 * Интерфейс для реализации методов, использующихся в коробке с подарками
 */
package mirents.github.io;

public interface BoxUsing {
    // Добавление элемента
    public void add();
    // Удаление элемента по номеру
    public boolean deleteIndex(int num);
    // Удаоение последнего элемента
    public boolean deleteLast();
    // Получить вес коробки
    public double getWeightBox();
    // Получить стоимость коробки
    public double getPriceBox();
    // Отобразить всю информацию о содержимом коробки
    public void getAllAboutBox();
}
