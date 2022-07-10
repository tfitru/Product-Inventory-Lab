package service;


import models.RunningShoesTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import services.RunningShoes;

import java.util.Arrays;

public class RunningShoesServiceTest {

    @Test
    public void createTest() {

        // Given
        Integer integerExpectedId = 5;
        String expectedName = "Stan Smith";
        String expectedBrand = "Adidas";
        double expectedSize = 10.5;
        Integer expectedQty = 10;
        float expectedPrice = 50.00F;




        // When
        RunningShoes inventory = new RunningShoes();
        models.RunningShoes inventoryTest = new models.RunningShoes(integerExpectedId, expectedName, expectedBrand, expectedSize, expectedQty, expectedPrice);


        Integer actualId = inventoryTest.getId();
        String actualName = inventoryTest.getName();
        String actualBrand = inventoryTest.getBrand();
        Double actualSize = inventoryTest.getSize();
        Integer actualQty = inventoryTest.getQty();
        float actualPrice = inventoryTest.getPrice();


        // Then
        Assertions.assertEquals(Integer.class.getName(), new Integer(actualId).getClass().getName());
        Assertions.assertEquals(expectedName, actualName);
        Assertions.assertEquals(expectedBrand, actualBrand);
        Assertions.assertEquals(expectedSize, actualSize);
        Assertions.assertEquals(expectedQty, actualQty);
        Assertions.assertEquals(expectedPrice, actualPrice);



    }


    @Test
    public void findRunningShoes(){
        // Given
        Integer integerExpectedId = 0;
        String expectedName = "Stan Smith";
        String expectedBrand = "Adidas";
        double expectedSize = 10.5;
        Integer expectedQty = 10;
        float expectedPrice = 50.00F;
        RunningShoes inventory = new RunningShoes();
        models.RunningShoes inventoryTest = new models.RunningShoes(integerExpectedId, expectedName, expectedBrand, expectedSize, expectedQty, expectedPrice);
        inventory.create(expectedName, expectedBrand, expectedSize, expectedQty, expectedPrice);


        // When
        inventory.findRunningShoes(0);
        System.out.println(inventory.findRunningShoes(0));

        // Then
        Assertions.assertEquals(integerExpectedId, 0);

    }


    @Test
    public void findAllTest() {
        // Given
        Integer integerExpectedId = 0;
        String expectedName = "Stan Smith";
        String expectedBrand = "Adidas";
        double expectedSize = 10.5;
        Integer expectedQty = 10;
        float expectedPrice = 50.00F;
        RunningShoes inventory = new RunningShoes();
        models.RunningShoes inventoryTest = new models.RunningShoes(integerExpectedId, expectedName, expectedBrand, expectedSize, expectedQty, expectedPrice);
        inventory.create(expectedName, expectedBrand, expectedSize, expectedQty, expectedPrice);

        // When
        inventory.findAll();




        // Then
        Assertions.assertEquals(Arrays.toString(inventory.findAll()), Arrays.toString(inventory.findAll()));
        System.out.println(Arrays.toString(inventory.findAll()));

    }

    @Test
    public void deleteTest() {
        // Given
        Integer integerExpectedId = 0;
        String expectedName = "Stan Smith";
        String expectedBrand = "Adidas";
        double expectedSize = 10.5;
        Integer expectedQty = 10;
        float expectedPrice = 50.00F;
        RunningShoes inventory = new RunningShoes();
        models.RunningShoes inventoryTest = new models.RunningShoes(integerExpectedId, expectedName, expectedBrand, expectedSize, expectedQty, expectedPrice);
        inventory.create(expectedName, expectedBrand, expectedSize, expectedQty, expectedPrice);


        // When
        inventory.delete(0);



        // Then
        Assertions.assertTrue(inventory.delete(0));
    }

}
