package service;


import models.RunningShoesTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import services.RunningShoes;

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



}
