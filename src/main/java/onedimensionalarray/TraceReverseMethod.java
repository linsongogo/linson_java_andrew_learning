package onedimensionalarray;

import java.util.Arrays;

public class TraceReverseMethod {

  public static void main(String[] args) {

    int[] list1 = {1, 2, 3, 4, 5, 6};
    int[] list2 = reverse(list1);
    System.out.println(Arrays.toString(list2));
  }

  public static int[] reverse(int[] list1) {
    int[] result = new int[list1.length];
    for (int i = 0, j = result.length - 1; i < list1.length; i++, j--) {
      result[j] = list1[i];
    }
    return result;

  }


}
