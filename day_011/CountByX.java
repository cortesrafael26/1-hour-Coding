package day_011;

public class CountByX {
    // Problem: https://www.codewars.com/kata/5513795bd3fafb56c200049e
    public static int[] countBy(int x, int n){
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = x * (i + 1);
        }

        return arr;
    }
}
