package io.github.mirents;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JUnitTest {
    // Объект класса подарок для проверки
    SweetBox sweetBox;

    @Test
    public void TestOne() {
        System.out.println("====Старт Тест 1");
        System.out.println("    Шаг 1 - Проверка пустой коробки с подарками");
        sweetBox.showBoxAllInfo();
        Assert.assertEquals(0, sweetBox.getSize());
        // Ожидаемый / Фактический
        System.out.println("    Шаг 2 - Наполнение коробки");
        sweetBox.add(new SwCandy("Русалочка", 2.3, 6.4));
        sweetBox.add(new SwCandy("Весна", 1.9, 3.4, "Без начинки"));
        sweetBox.add(new SwCandy("Левушка", 3.1, 7.2, "Вареная сгущенка"));
        System.out.println("    Шаг 3 - Просмотр наполенной коробки");
        sweetBox.showBoxAllInfo();
        System.out.println("    Шаг 4 - Сравнение результата теста");
        Assert.assertEquals(3, sweetBox.getSize());
    }
    
    @Test
    public void TestTwo() {
        
        System.out.println("====Старт Тест 2");
        Sweetness candy = new SwCandy("Пират", 1.3, 0.98, "Карамельная карамель");
        Assert.assertEquals("Пират", candy.getName());
        Assert.assertEquals(Double.doubleToLongBits(1.3),
                Double.doubleToLongBits(candy.getWeight()));
        Assert.assertEquals(Double.doubleToLongBits(0.98),
                Double.doubleToLongBits(candy.getPrice()));
        Assert.assertEquals("Карамельная карамель", candy.getSweetFeature());
    }
    
    @Before
    public void setUp() throws Exception {
        sweetBox = new SweetBox();
    }
}
