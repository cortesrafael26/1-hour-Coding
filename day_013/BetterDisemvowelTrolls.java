package day_013;

public class BetterDisemvowelTrolls {
    // Problem: https://www.codewars.com/kata/52fba66badcd10859f00097e
    public static String disemvowel(String str) {
        return str.replaceAll("(?i)[aeiou]", "");
    }
}
