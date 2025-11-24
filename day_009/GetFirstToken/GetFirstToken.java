package day9.GetFirstToken;

public class GetFirstToken {
    // I want to create a simple program that will get the first token of a literal string, and print it.

    public static void main(String[] args) {
        String str = "Rafael Louise Cortes";
        String firstToken;
        int whiteSpace = str.indexOf(' ');
        if (whiteSpace != -1) {
            firstToken = str.substring(0, whiteSpace);
        } else {
            firstToken = str;
        }
        System.out.println(firstToken);
    }
}
