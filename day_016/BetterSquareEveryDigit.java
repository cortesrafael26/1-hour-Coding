package day_016;

public class BetterSquareEveryDigit {
    // Problem: https://www.codewars.com/kata/546e2562b03326a88e000020
    public int squareDigits(int n) {
        String nStr = String.valueOf(n);
        String output = "";

        for (int i = 0; i < nStr.length(); i++) {
            int digit = Character.getNumericValue(nStr.charAt(i));
            output += digit * digit;
        }

        return Integer.parseInt(output);
    }
}
