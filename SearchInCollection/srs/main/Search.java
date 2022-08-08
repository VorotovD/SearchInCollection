package srs.main;

import java.util.List;

public class Search {
    public static void main(String[] args) {
        List<String> carNumbers = CarNumber.generateCoolNumbers();
        CarNumber.bruteForceSearchInList(carNumbers,"A111BC197");
        CarNumber.binarySearchInList(carNumbers,"A111BC197");
    }
}
