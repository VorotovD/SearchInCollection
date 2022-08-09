import java.util.List;

public class Search {
    public static void main(String[] args) {
        List<String> carNumbers = NumberCreator.generateCoolNumbers();
        CarNumber.bruteForceSearchInList(carNumbers,"A111BC197");
        // Перед выполнением бинарного поиска carNumbers нужно отсортировать
        CarNumber.binarySearchInList(carNumbers,"A111BC197");
    }
}
