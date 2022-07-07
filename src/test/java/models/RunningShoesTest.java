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

    @Test
    public void constructorTest() {
        // Given

        int expectedId = 6;
        String expectedName = "Stan Smith";
        String expectedBrand = "Adidas";
        Double expectedSize = 9.5;
        Integer expectedQty = 10;
        Float expectedPrice = 80.00f;

        // When
        RunningShoes testShoes = new RunningShoes(expectedId,expectedName, expectedBrand, expectedSize, expectedQty,expectedPrice);


        // Then
        Assertions.assertEquals(expectedId, testShoes.getId());
        Assertions.assertEquals(expectedName, testShoes.getName());
        Assertions.assertEquals(expectedBrand, testShoes.getBrand());
        Assertions.assertEquals(expectedSize, testShoes.getSize());
        Assertions.assertEquals(expectedQty, testShoes.getQty());
        Assertions.assertEquals(expectedPrice, testShoes.getPrice());
    }
    

}
