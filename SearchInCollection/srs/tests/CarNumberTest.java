package srs.tests;

import org.junit.Assert;
import org.junit.Test;
import srs.main.CarNumber;

import java.util.List;

public class CarNumberTest {
    final List<String> carNumbers = List.of("�555��152", "�666��164", "�666��58", "�666��04", "�777��46",
            "�999��99", "�000��77", "�999��09", "�666��05", "�448��30",
            "�777��90", "�222��06", "�222��33", "�444��199", "�888��21",
            "�888��41", "�111��40", "�777��154", "�777��61", "�888��50");

    @Test(expected = IllegalArgumentException.class)
    public void bruteForceSearchTest() {
        Assert.assertTrue(CarNumber.bruteForceSearchInList(carNumbers, "�555��152"));
        Assert.assertFalse(CarNumber.bruteForceSearchInList(carNumbers, "�555��01"));
        Assert.assertFalse(CarNumber.bruteForceSearchInList(carNumbers, "�000��01"));
        CarNumber.bruteForceSearchInList(carNumbers, "�000��1");
    }

    @Test(expected = IllegalArgumentException.class)
    public void binarySearchTest() {
        Assert.assertTrue(CarNumber.binarySearchInList(carNumbers, "�555��152"));
        Assert.assertFalse(CarNumber.bruteForceSearchInList(carNumbers, "�555��11"));
        Assert.assertFalse(CarNumber.binarySearchInList(carNumbers, "�000��01"));
        CarNumber.bruteForceSearchInList(carNumbers, "�000��0011");
    }


}
