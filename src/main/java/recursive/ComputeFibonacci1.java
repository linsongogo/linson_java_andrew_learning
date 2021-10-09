package recursive;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ComputeFibonacci1 {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.print("Enter an index for a Fibonacci number: ");
    int index = input.nextInt();

    System.out.println("The Fibonacci number at index " + index + " is " + fibonacci(index));
  }

  private static final Map<Long, Long> map = new HashMap<>();

/*
  private static long fibonacci(long index) {
    if (index == 0) {
      return 0;
    } else if (index == 1) {
      return 1;
    } else {
      return fibonacci(index - 1) + fibonacci(index - 2);
    }

 */

  private static long fibonacci(long index) {

    if (map.containsKey(index)) {
      return map.get(index);
    }

    if (index == 0) {
      return 0;
    } else if (index == 1) {
      return 1;
    } else {
      long result = fibonacci(index - 1) + fibonacci(index - 2);
      map.put(index, result);
      return map.get(index);
    }


  }

}
