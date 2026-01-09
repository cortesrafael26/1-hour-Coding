package day_015;

public class ReversedString {
    // Create a method that will reverse a string.
    static String reverse(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }

    public static void main(String[] args) {
        String word = reverse("Rafael");
        System.out.println(word);
    }
}
