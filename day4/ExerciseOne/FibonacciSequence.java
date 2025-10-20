package day4.ExerciseOne;

public class FibonacciSequence {
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 1;
        System.out.println(num1);

        int i = 0;
        do {
            System.out.println(num2);
            num2 += num1;
            num1 = num2 - num1;
            i++;
        } while (i < 10);
    }
}