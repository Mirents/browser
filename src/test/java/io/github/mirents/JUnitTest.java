package io.github.mirents;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JUnitTest {
    SweetBox sweetBox;
    
    public JUnitTest() {
        sweetBox = new SweetBox();
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Test
    public void TestEmpty() {
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
        System.out.println("Test 2");
        Assert.assertEquals("Se", "Se");
    }
    
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
}
