import org.apache.commons.lang3.RandomStringUtils;

import java.util.ArrayList;
import java.util.List;

public class NumberCreator {
    private static final String letters = "[юбейлмнпярсу]";
    private static final String regex = letters + "[0-9]{3}" + letters + "{2}[0-9]{2,3}";

    public static String getNewNumber() {
        String result = "";
        while (!result.matches(regex)) {
            result = RandomStringUtils.random(1, "юбейлмнпярсу")
                    + RandomStringUtils.randomNumeric(3)
                    + RandomStringUtils.random(2, "юбейлмнпярсу")
                    + getRegion();
        }
        return result;
    }

    public static List<String> generateCoolNumbers() {
        List<String> result = new ArrayList<>();
        for (int i = 0; i<=2000001;i++) {
            result.add(getNewNumber());
        }
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
