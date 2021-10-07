package onedimensionalarray;

public class LinearSearchDemo {

  public static void main(String[] args) {
    int[] list = {5, 2, 3, 4, 4, 5, 6, 7, 9};
    int i = linearSearch(list, 4);
    int i1 = linearSearch(list, 0);
    System.out.println(i + " " + i1);
  }

  public static int linearSearch(int[] list, int key) {
    for (int i = 0; i < list.length; i++) {
      if (key == list[i]) {
        return i;
      }
    }
    return -1;
  }
}
