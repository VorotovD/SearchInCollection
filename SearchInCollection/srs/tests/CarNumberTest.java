package srs.tests;

import org.junit.Assert;
import org.junit.Test;
import srs.main.CarNumber;

import java.util.List;

public class CarNumberTest {
    final List<String> carNumbers = List.of("б555см152", "п666яп164", "м666рр58", "н666лй04", "р777рл46",
            "ю999му99", "с000нм77", "с999ме09", "л666яй05", "н448ея30",
            "ю777бл90", "у222ся06", "ю222уй33", "л444ме199", "я888бй21",
            "м888рл41", "я111еу40", "р777мн154", "м777ул61", "с888юр50");

    @Test(expected = IllegalArgumentException.class)
    public void bruteForceSearchTest() {
        Assert.assertTrue(CarNumber.bruteForceSearchInList(carNumbers, "б555см152"));
        Assert.assertFalse(CarNumber.bruteForceSearchInList(carNumbers, "б555см01"));
        Assert.assertFalse(CarNumber.bruteForceSearchInList(carNumbers, "ю000юю01"));
        CarNumber.bruteForceSearchInList(carNumbers, "ю000юю1");
    }

    @Test(expected = IllegalArgumentException.class)
    public void binarySearchTest() {
        Assert.assertTrue(CarNumber.binarySearchInList(carNumbers, "б555см152"));
        Assert.assertFalse(CarNumber.bruteForceSearchInList(carNumbers, "б555см11"));
        Assert.assertFalse(CarNumber.binarySearchInList(carNumbers, "ю000юю01"));
        CarNumber.bruteForceSearchInList(carNumbers, "ю000юю0011");
    }


}
