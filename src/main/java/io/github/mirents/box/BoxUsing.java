/*
 * Интерфейс для реализации методов, использующихся в коробке с подарками
 */
package io.github.mirents.box;

import io.github.mirents.sweets.Sweetness;

public interface BoxUsing {
    // Добавление элемента
    public void add(Sweetness newSweet);
    // Удаление элемента по номеру
    public void deleteIndex(int num);
    // Удаоение последнего элемента
    public void deleteLast();
    // Получить вес коробки
    public double getBoxWeight();
    // Получить стоимость коробки
    public double getBoxPrice();
    // Отобразить всю информацию о содержимом коробки
    public void showBoxAllInfo();
    // Оптимизировать подарок по цене
    public void optimizeForPrice(double num);
    // Оптимизировать подарок по весу
    public void optimizeForWeight(double num);
}
