package srs.main;

import org.apache.commons.lang3.RandomStringUtils;

public class NumberCreator {
    String letters = "[юбейлмнпярсу]";
    String regex = letters + "[0-9]{3}" + letters + "{2}[0-9]{2,3}";

    public String getNewNumber() {
        String result = "";
        while (!result.matches(regex)) {
            result = RandomStringUtils.random(1, "юбейлмнпярсу")
                    + RandomStringUtils.randomNumeric(3)
                    + RandomStringUtils.random(2, "юбейлмнпярсу")
                    + getRegion();
        }
        return result;
    }

    private String getRegion() {
        int result = (int) (Math.random() * 199 + 1);
        if (result < 10) {
            return "0" + Integer.toString(result);
        }
        return Integer.toString(result);
    }
}
