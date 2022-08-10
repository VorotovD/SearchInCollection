import org.apache.commons.lang3.RandomStringUtils;

import java.util.ArrayList;
import java.util.List;

public class NumberCreator {
    private static final String letters = "[АВЕКМНОРСТУХ]";
    private static final String regex = letters + "[0-9]{3}" + letters + "{2}[0-9]{2,3}";

    public static String getNewNumber() {
        String result = "";
        while (!result.matches(regex)) {
            result = RandomStringUtils.random(1, "АВЕКМНОРСТУХ")
                    + RandomStringUtils.randomNumeric(3)
                    + RandomStringUtils.random(2, "АВЕКМНОРСТУХ")
                    + getRegion();
        }
        return result;
    }

    public static List<String> generateCoolNumbers() {
        long start = System.nanoTime();
        List<String> result = new ArrayList<>();
        for (int i = 0; i<=2000001;i++) {
            result.add(getNewNumber());
        }
        System.out.println("Время заполнения массива номеров: " + (System.nanoTime() - start)  + "нс");
        return result;
    }


    private static String getRegion() {
        int result = (int) (Math.random() * 199 + 1);
        if (result < 10) {
            return "0" + result;
        }
        return Integer.toString(result);
    }
}
