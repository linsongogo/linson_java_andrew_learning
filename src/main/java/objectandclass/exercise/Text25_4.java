package objectandclass.exercise;

public class Text25_4 {

  public static void main(String[] args) {
    TT t1 = new TT();
    TT t2 = new TT();
    System.out.println("t1's i = " + t1.i + ", t1's j = " + t1.j);
    System.out.println("t2's i = " + t2.i + ", t2's j = " + t2.j);
  }
}

class TT {

  static int i = 0;
  int j = 0;

  TT() {
    i++;
    j = 1;
  }
}