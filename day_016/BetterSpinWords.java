package day_016;

public class BetterSpinWords {
    // Problem: https://www.codewars.com/kata/5264d2b162488dc400000001
    public String spinWords(String sentence) {
        String[] words = sentence.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() >= 5) {
                words[i] = new StringBuilder(words[i]).reverse().toString();
            }
        }
        return String.join(" ", words);
    }
}