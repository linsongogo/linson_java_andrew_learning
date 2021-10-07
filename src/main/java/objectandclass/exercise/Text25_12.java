package objectandclass.exercise;

public class Text25_12 {

  public static void main(String[] args) {
    int[] a = {1, 2};

    swap1(a[0], a[1]);
    System.out.println("a[0] is " + a[0] + ", a[1] is " + a[1]);

    swap2(a);
    System.out.println("a[0] is " + a[0] + ", a[1] is " + a[1]);
  }

  public static void swap1(int n1, int n2) {
    int temp = n1;
    n1 = n2;
    n2 = temp;
  }

  public static void swap2(int[] x) {
    int temp = x[0];
    x[0] = x[1];
    x[1] = temp;
  }

}
