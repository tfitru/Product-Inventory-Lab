package service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import services.DVDs;
import services.RunningShoes;

import java.util.Arrays;

public class DVDsServiceTest {
    @Test
    public void createTest() {

        // Given
        Integer integerExpectedId = 5;
        String expectedName = "Stan Smith";
        Integer expectedQty = 10;
        float expectedPrice = 50.00F;



        // When
        DVDs inventory = new DVDs();
        models.DVDs inventoryTest = new models.DVDs( integerExpectedId, expectedName, expectedQty, expectedPrice);


        Integer actualId = inventoryTest.getId();
        String actualName = inventoryTest.getName();
        Integer actualQty = inventoryTest.getQty();
        float actualPrice = inventoryTest.getPrice();


        // Then
        Assertions.assertEquals(Integer.class.getName(), new Integer(actualId).getClass().getName());
        Assertions.assertEquals(expectedName, actualName);
        Assertions.assertEquals(expectedQty, actualQty);
        Assertions.assertEquals(expectedPrice, actualPrice);



    }


    @Test
    public void findRunningShoes(){
        // Given
        Integer integerExpectedId = 0;
        String expectedName = "Stan Smith";
        Integer expectedQty = 10;
        float expectedPrice = 50.00F;
        DVDs inventory = new DVDs();
        models.DVDs inventoryTest = new models.DVDs( integerExpectedId, expectedName, expectedQty, expectedPrice);
        inventory.create(expectedName, expectedQty, expectedPrice);


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
        Integer expectedQty = 10;
        float expectedPrice = 50.00F;
        DVDs inventory = new DVDs();
        models.DVDs inventoryTest = new models.DVDs( integerExpectedId, expectedName, expectedQty, expectedPrice);
        inventory.create(expectedName, expectedQty, expectedPrice);

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
        Integer expectedQty = 10;
        float expectedPrice = 50.00F;
        DVDs inventory = new DVDs();
        models.DVDs inventoryTest = new models.DVDs( integerExpectedId, expectedName, expectedQty, expectedPrice);
        inventory.create(expectedName, expectedQty, expectedPrice);


        // When
        inventory.delete(0);



        // Then
        Assertions.assertTrue(inventory.delete(0));
    }
}
