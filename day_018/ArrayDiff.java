public class ArrayDiff {

  public static int[] arrayDiff(int[] a, int[] b) {
    int[] tempArr = new int[a.length];
    int outputIndex = 0;
    
    for (int i = 0; i < a.length; i++) {
      boolean keepElement = true;
      
      for (int j = 0; j < b.length; j++) {
        if (a[i] == b[j]) {
          keepElement = false;
          break; // Match found. Skips the rest of b[j]
        }
      }
      
      if (keepElement) {
        tempArr[outputIndex] = a[i];
        outputIndex++;
      }
    }
    
    int[] output = new int[outputIndex];
    System.arraycopy(tempArr, 0, output, 0, outputIndex);
    
    return output;
  }
}