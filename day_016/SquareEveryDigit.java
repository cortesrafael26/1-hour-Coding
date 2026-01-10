package day_016;

public class SquareEveryDigit {
    // Problem: https://www.codewars.com/kata/546e2562b03326a88e000020
    public int squareDigits(int n) {
        String nStr = String.valueOf(n);
        String[] strArr = new String[nStr.length()];
        int[] intArr = new int[nStr.length()];

        String strOutput = "";
        int intOutput;

        for (int i = 0; i < nStr.length(); i++) {
            char ch = nStr.charAt(i);
            strArr[i] = String.valueOf(ch);
        }

        for (int j = 0; j < intArr.length; j++) {
            intArr[j] = Integer.parseInt(strArr[j]);
            intArr[j] *= intArr[j];
        }

        for (int k = 0; k < intArr.length; k++) {
            strArr[k] = String.valueOf(intArr[k]);
            strOutput += strArr[k];
        }

        intOutput = Integer.parseInt(strOutput);
        return intOutput;
    }
}