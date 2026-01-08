package day_013;

public class DisemvowelTrolls {
    // Problem: https://www.codewars.com/kata/52fba66badcd10859f00097e
    public static String disemvowel(String str) {
        String[] vowels = {"a", "A", "e", "E", "i", "I", "o", "O", "u", "U"};
        for (int i = 0; i < vowels.length; i++) {
            str = str.replaceAll(vowels[i], "");
        }
        return str;
    }
}
