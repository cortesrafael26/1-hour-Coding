class Solution {
  public static String camelCase(String input) {
    return input.replaceAll("(?<!^)(\\p{Lu})", " $1");
  }
}