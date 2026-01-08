package day_012;

public class VowelCount {
    // Problem: https://www.codewars.com/kata/54ff3102c1bad923760001f3
    public static int getCount(String str) {
        int numOfVowels = 0;

        if (str.length() == 0) {
            numOfVowels = 0;
        } else {
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);

                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    numOfVowels++;
                }
            }
        }
        return numOfVowels;
    }
}
