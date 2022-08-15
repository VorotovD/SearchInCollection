package main;

import java.util.ArrayList;

public class Search {
    public static void main(String[] args) {
        ArrayList<String> carNumbers = NumberCreator.generateCoolNumbers();
        CarNumber.bruteForceSearchInList(carNumbers,"А111ВС197");
        CarNumber.binarySearchInList(carNumbers,"А111ВС197");
        CarNumber.searchInHashSet(carNumbers,"А111ВС197");
        CarNumber.searchInTreeSet(carNumbers,"А111ВС197");

    }
}
