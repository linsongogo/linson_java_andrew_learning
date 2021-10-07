package onedimensionalarray;

import java.util.Arrays;

public class BinarySearchDemo {

  public static void main(String[] args) {
    int[] list = {2, 4, 6, 7, 8, 9, 11, 16, 17, 18};
    int i= binarySearch(list,4);
    int i1=binarySearch(list,5);
    int i2=binarySearch(list,0);
    System.out.println(i+" "+i1+" "+i2);

  }

  public static int binarySearch(int[] list, int key) {
    int low = 0;
    int high = list.length - 1;
    while (low <= high) {
      int mid = (low + high) / 2;
      if (key < list[mid]) {
        high = mid - 1;
      } else if (key == list[mid]) {
        return mid;
      } else {
        low = mid + 1;
      }
    }
    return -low - 1;
  }

}
