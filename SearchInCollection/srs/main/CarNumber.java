package srs.main;

import java.util.*;

public class CarNumber {
    private static final String letters = "[АВЕКМНОРСТУХ]";
    public static final String regex = letters + "[0-9]{3}" + letters + "{2}[0-9]{2,3}";

    public static boolean numberCorrect(String number) {
        return number.matches(regex);
    }

    public static List<String> generateCoolNumbers() {
        List<String> result = new ArrayList<>();
        for (int i = 0; i<=2000001;i++) {
            NumberCreator newCoolNumber = new NumberCreator();
            result.add(newCoolNumber.getNewNumber());
        }
        return result;
    }

    public static boolean bruteForceSearchInList(List<String> list, String number) {
        if (list.isEmpty() || !numberCorrect(number)) {
            throw new IllegalArgumentException("Неверно введен массив номеров или поисковый номер");
        }
        long start = System.nanoTime();
        System.out.print("Поиск перебором:");
        for (String numbers: list) {
            if (numbers.equals(number)) {
                System.out.println(" номер найден, поиск занял:" + (System.nanoTime()-start));
                return true;
            }
        }
        System.out.println(" номер не найден, поиск занял:" + (System.nanoTime()-start));
        return false;
    }

    public static boolean binarySearchInList(List<String> sortedList, String number) {
        if (sortedList.isEmpty() || !numberCorrect(number)) {
            throw new IllegalArgumentException("Неверно введен массив номеров или поисковый номер");
        }
        long start = System.nanoTime();
        System.out.print("Бинарный поиск,");
        int result = Arrays.binarySearch(sortedList.toArray(), number);
        if (result != -1) {
            System.out.println(" номер найден, поиск занял:" + (System.nanoTime()-start)+ "нс");
            return true;
        }
        System.out.println(" номер не найден, поиск занял:" + (System.nanoTime()-start)+ "нс");
        return false;
    }
}
