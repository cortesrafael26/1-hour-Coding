public class BitCounting {

    public static int countBits(int n) {
        String binary = Integer.toBinaryString(n);
        String search = "1";
        int count = 0;
    
        for (int i = 0; i < binary.length(); i++) {
          char c = binary.charAt(i);
          String str = String.valueOf(c);
      
          if (search.equals(str)) {
            count++;
          }
        }
    
        return count;
    }
}