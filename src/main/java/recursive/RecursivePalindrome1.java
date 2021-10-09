package recursive;

import java.util.Scanner;

public class RecursivePalindrome1 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a string: ");
    String s = input.nextLine();
    System.out.println(isPalindrome1(s));
  }

  public static boolean isPalindrome1(String s) {
    if (s.length() <= 1) {
      return true;
    } else if (s.charAt(0) != s.charAt(s.length() - 1)) {
      return false;
    } else {
      return isPalindrome1(s.substring(1, s.length() - 1));
    }
  }
}
