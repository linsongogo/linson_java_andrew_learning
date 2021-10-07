package objectandclass.exercise;

public class Text25_3 {

  public static void main(String[] args) {
    T t = new T();
    swap(t);
    System.out.println("e1=" + t.e1 + ", e2=" + t.e2);

  }

  public static void swap(T x) {
    int temp = x.e1;
    x.e1 = x.e2;
    x.e2 = temp;

  }
}

class T {

  int e1 = 1;
  int e2 = 2;
}

