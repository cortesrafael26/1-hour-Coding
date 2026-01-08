package day_014;

public class HighestAndLowest {
    // Problem: https://www.codewars.com/kata/554b4ac871d6813a03000035
    public static String highAndLow(String numbers) {
        String[] strNumbers = numbers.split(" ");
        Integer[] intNumbers = new Integer[strNumbers.length];
        for (int i = 0; i < strNumbers.length; i++) {
            intNumbers[i] = Integer.parseInt(strNumbers[i]);
        }

        int n = intNumbers.length;
        int temp;

        for (int j = 0; j < n - 1; j++) {
            for (int k = 0; k < n - 1 - j; k++) {
                if (intNumbers[k] < intNumbers[k + 1]) {
                    temp = intNumbers[k];
                    intNumbers[k] = intNumbers[k + 1];
                    intNumbers[k + 1] = temp;
                }
            }
        }

        int highest = intNumbers[0];
        int lowest = intNumbers[n - 1];

        return highest + " " + lowest;
    }
}
