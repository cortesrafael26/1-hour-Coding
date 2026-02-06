class Solution {
    // Problem: https://www.codewars.com/kata/5266876b8f4bf2da9b000362
    public static String whoLikesIt(String... names) {
        String output = "";
        
        if (names.length == 0) {
          output = "no one likes this";
        } else if (names.length == 1) {
          output = names[0] + " likes this";
        } else if (names.length == 2) {
          output = names[0] + " and " + names[1] + " like this";
        } else if (names.length == 3) {
          output = names[0] + ", " + names[1] + " and " + names[2] + " like this";
        } else {
          int num = names.length - 2;
          output = names[0] + ", " + names[1] + " and " + num + " others like this";
        }
      
        return output;
    }
}