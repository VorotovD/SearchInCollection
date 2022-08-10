import java.util.*;
import java.util.stream.Stream;

public class CarNumber {
    private static final String letters = "[АВЕКМНОРСТУХ]";
    private static final String regex = letters + "[0-9]{3}" + letters + "{2}[0-9]{2,3}";

    public static boolean numberCorrect(String number) {
        return number.matches(regex);
    }


    public static boolean bruteForceSearchInList(List<String> list, String number) {
        if (list.isEmpty() || !numberCorrect(number)) {
            throw new IllegalArgumentException("Неверно введен массив номеров или поисковый номер");
        }
        long start = System.nanoTime();
        System.out.print("Поиск перебором:");
        for (String numbers : list) {
            if (numbers.equals(number)) {
                System.out.println(" номер найден, поиск занял:" + (System.nanoTime() - start));
                return true;
            }
        }
        System.out.println(" номер не найден, поиск занял:" + (System.nanoTime() - start));
        return false;
    }

    public static boolean binarySearchInList(List<String> notSortedList, String number) {
        if (notSortedList.isEmpty() || !numberCorrect(number)) {
            throw new IllegalArgumentException("Неверно введен массив номеров или поисковый номер");
        }
        long startOfSorting = System.nanoTime();
        Stream<String> sortedList = notSortedList.stream().sorted();
        System.out.println("Время сортировки для бинарного поиска: " + (System.nanoTime() - startOfSorting) + "нс");
        long start = System.nanoTime();
        System.out.print("Бинарный поиск,");
        int result = Arrays.binarySearch(sortedList.toArray(), number);
        if (result != -1) {
            System.out.println(" номер найден, поиск занял:" + (System.nanoTime() - start) + "нс");
            return true;
        }
        System.out.println(" номер не найден, поиск занял:" + (System.nanoTime() - start) + "нс");
        return false;
    }

    public static boolean searchInHashSet(List<String> list, String number) {
        if (list.isEmpty() || !numberCorrect(number)) {
            throw new IllegalArgumentException("Неверно введен массив номеров или поисковый номер");
        }
        long start = System.nanoTime();
        System.out.print("Поиск в HashSet,");
        HashSet<String> hashSet = new HashSet<>(list);
        if (hashSet.contains(number)) {
            System.out.println("номер найден, поиск занял: " + (System.nanoTime() - start) + "нс");
            return true;
        }
        System.out.println("номер не найден, поиск занял: " + (System.nanoTime() - start) + "нс");
        return false;
    }

    public static boolean searchInTreeSet(List<String> list, String number) {
        if (list.isEmpty() || !numberCorrect(number)) {
            throw new IllegalArgumentException("Неверно введен массив номеров или поисковый номер");
        }
        long start = System.nanoTime();
        System.out.print("Поиск в TreeSet,");
        TreeSet<String> treeSet = new TreeSet<>(list);
        if (treeSet.contains(number)) {
            System.out.println("номер найден, поиск занял: " + (System.nanoTime() - start) + "нс");
            return true;
        }
        System.out.println("номер не найден, поиск занял: " + (System.nanoTime() - start) + "нс");
        return false;
    }
}
