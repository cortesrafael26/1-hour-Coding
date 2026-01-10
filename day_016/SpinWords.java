package day_016;

public class SpinWords {
    // Problem: https://www.codewars.com/kata/5264d2b162488dc400000001
    public String spinWords(String sentence) {
        String[] words = sentence.split(" ");
        for (int i = 0; i < words.length; i++) {
            String reversed = "";
            if (words[i].length() >= 5) {
                for (int j = words[i].length() - 1; j >= 0; j--) {
                    reversed += words[i].charAt(j);
                }
                words[i] = reversed;
            }
        }
        String output = String.join(" ", words);
        return output;
    }
}