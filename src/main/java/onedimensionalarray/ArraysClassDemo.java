package onedimensionalarray;

import java.util.Arrays;

public class ArraysClassDemo {

  public static void main(String[] args) {
    double[] numbers = {6.0, 4.4, 1.9, 2.9, 3.4, 3.5};
    Arrays.sort(numbers);

    System.out.println(Arrays.toString(numbers));

    for (double e : numbers) {
      System.out.print(e + " ");
    }

    System.out.println();

    char[] chars = {'a', 'A', '4', 'F', 'D','s', 'P'};
    Arrays.sort(chars);
    System.out.println(chars);//字典顺序

    Arrays.parallelSort(chars);
    System.out.println(chars);

    int[] list = {12, 31, 4, 1, 6, 8, 1};
    int[] list1 = {31, 12, 4, 1, 6, 8, 1};

    int index = Arrays.binarySearch(list, -1);
    System.out.println("index = " + index);

    boolean flag = Arrays.equals(list, list1);

    System.out.println("flag = " + flag);

    Arrays.fill(list, 10);
    for (double e : list) {
      System.out.print(e + " ");
    }

    System.out.println();
    Arrays.fill(list, 1, 5, 15);
    for (double e : list) {
      System.out.print(e + " ");
    }

    System.out.println();

    System.out.println(Arrays.toString(list));


  }

}
