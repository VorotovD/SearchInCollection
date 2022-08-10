import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class CarNumberTest {

    final ArrayList<String> carNumbers = getArrayListNumbers();

    private ArrayList<String> getArrayListNumbers() {
        List<String> numbers = List.of("В555УН152", "Р666СР164", "Н666ТТ58", "О666МК04", "Т777ТМ46",
                "А999НХ99", "У000ОН77", "У999НЕ09", "М666СК05", "О448ЕС30",
                "А777ВМ90", "Х222УС06", "А222ХК33", "М444НЕ199", "С888ВК21",
                "Н888ТМ41", "С111ЕХ40", "Т777НО154", "Н777ХМ61", "У888АТ50");
        return new ArrayList<>(numbers);
    }

    final

    @Test
    public void bruteForceSearchTest() {
        Assert.assertTrue(CarNumber.bruteForceSearchInList(carNumbers, "В555УН152"));
        Assert.assertFalse(CarNumber.bruteForceSearchInList(carNumbers, "В555УН02"));
    }

    @Test
    public void binarySearchTest() {
        Assert.assertTrue(CarNumber.binarySearchInList( carNumbers, "В555УН152"));
        Assert.assertFalse(CarNumber.bruteForceSearchInList(carNumbers, "В555УН11"));
    }
    @Test
    public void searchHashTest() {
        Assert.assertTrue(CarNumber.searchInHashSet(carNumbers, "В555УН152"));
        Assert.assertFalse(CarNumber.searchInHashSet(carNumbers, "В555УН11"));
    }
    @Test
    public void searchTreeTest() {
        Assert.assertTrue(CarNumber.searchInTreeSet(carNumbers, "В555УН152"));
        Assert.assertFalse(CarNumber.searchInTreeSet(carNumbers, "В555УН11"));
    }

}
