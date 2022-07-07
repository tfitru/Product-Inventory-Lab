package models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DVDsTest {
    @Test
    public void setNameTest() {
        // Given
        String expected = "OZWEEGO";

        // When
        DVDs nameTest = new DVDs();
        nameTest.setName(expected);

        // Then
        Assertions.assertEquals(expected, nameTest.getName());
    }


    @Test
    public void setQtyTest() {
        // Given
        Integer qtyExpected = 50;
        DVDs dvDs = new DVDs();
        dvDs.setQty(qtyExpected);


        // When
        Integer qtyActual = dvDs.getQty();

        // Then
        Assertions.assertEquals(qtyExpected, qtyActual);
    }


    @Test
    public void setPriceTest() {
        // Given
        Float priceExpected = 30F;
        DVDs dvDs = new DVDs();
        dvDs.setPrice(priceExpected);

        // When
        Float priceActual = dvDs.getPrice();


        // Then
        Assertions.assertEquals(priceExpected, priceActual, 0.01);




    }

    @Test
    public void constructorTest() {
        // Given

        int expectedId = 6;
        String expectedName = "Stan Smith";
        Integer expectedQty = 10;
        Float expectedPrice = 80.00f;

        // When
        DVDs testDVD = new DVDs(expectedId,expectedName, expectedQty, expectedPrice);


        // Then
        Assertions.assertEquals(expectedId, testDVD.getId());
        Assertions.assertEquals(expectedName, testDVD.getName());
        Assertions.assertEquals(expectedQty, testDVD.getQty());
        Assertions.assertEquals(expectedPrice, testDVD.getPrice());
    }
}
