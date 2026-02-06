public class OddInt {
    // Problem: https://www.codewars.com/kata/54da5a58ea159efa38000836
    public static int findIt(int[] a) {
        int output = 0;
      
        for (int i = 0; i < a.length; i++) {
          int count = 0;
          
          for (int j = 0; j < a.length; j++) {
            if (a[i] == a[j]) {
              count++;
            }
          }
          
          if (count % 2 != 0) {
            output = a[i];
          }
        }
      
        return output;
    }
}