package models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RunningShoesTest {
    @Test
    public void setNameTest() {
        // Given
        String expected = "OZWEEGO";

        // When
        RunningShoes nameTest = new RunningShoes();
        nameTest.setName(expected);

        // Then
        Assertions.assertEquals(expected, nameTest.getName());
    }

<<<<<<< HEAD
=======
    @Test
    public void setBrand() {
        // Given
        String brandExpected = "Nike";
        RunningShoes shoes = new RunningShoes();
        shoes.setBrand(brandExpected);


        // When
        String brandActual = shoes.getBrand();

        // Then
        Assertions.assertEquals(brandExpected, brandActual);
    }

    @Test
    public void setSize() {
        // Given
        Double sizeExpected = 9.5;
        RunningShoes shoes = new RunningShoes();
        shoes.setSize(sizeExpected);

        // When
        Double sizeActual = shoes.getSize();


        // Then
        Assertions.assertEquals(sizeExpected, sizeActual, 0.01);
    }




    @Test
    public void setQtyTest() {
        // Given
        Integer qtyExpected = 50;
        RunningShoes shoes = new RunningShoes();
        shoes.setQty(qtyExpected);


        // When
        Integer qtyActual = shoes.getQty();

        // Then
        Assertions.assertEquals(qtyExpected, qtyActual);
    }


    @Test
    public void setPriceTest() {
        // Given
        Float priceExpected = 15F;
        RunningShoes shoes = new RunningShoes();
        shoes.setPrice(priceExpected);

        // When
        Float priceActual = shoes.getPrice();


        // Then
        Assertions.assertEquals(priceExpected, priceActual, 0.01);




    }
    
>>>>>>> features-sneaker-properties
}
