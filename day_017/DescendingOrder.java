public class DescendingOrder {
  public static int sortDesc(final int num) {
    String strNum = String.valueOf(num);
    String[] arrNum = strNum.split("");
    String output = "";
    
    int n = arrNum.length;
    String temp;
    
    for (int i = 0; i < n - 1; i++) {
      for (int j = 0; j < n - 1 - i; j++) {
        if (arrNum[j].compareTo(arrNum[j + 1]) < 0) {
          temp = arrNum[j];
          arrNum[j] = arrNum[j + 1];
          arrNum[j + 1] = temp;
        } 
      }
    }
    
    for (int k = 0; k < arrNum.length; k++) {
      output += arrNum[k];
    }
    
    return Integer.parseInt(output);
  }
}