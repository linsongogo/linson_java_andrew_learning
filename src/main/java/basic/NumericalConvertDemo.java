package basic;

public class NumericalConvertDemo {

  public static void main(String[] args) {
    System.out.println(3 * 4.0);//既有整型又有浮点型，会自动转换成浮点型

    float f1 = 1000L;//float型比long型范围宽 //拓宽类型
    long f2 = (long) 1000f;  //缩窄类型 显示转换
    System.out.println(f1 + f2);

    System.out.println((int) 1.7);
    System.out.println((double) 1 / 2);

    double d = 4.5;
    int i = (int) d;
    System.out.println("d=" + d);
    System.out.println("i=" + i);

    int i1 = 1;
    byte b = (byte) i1;

    byte b1 = 12;

    int i2= (int) (5/2.0);
    /*
    当执行包含两个不同类型操作数的二进制操作时，Java会根据以下规则自动转换操作数:
      1.如果其中一个操作数为double，则另一个操作数转换为double。
      2.否则，如果其中一个操作数为float，则另一个操作数转换为float。
      3.否则，如果其中一个操作数是长操作数，则另一个操作数转换为长操作数。
      4.否则，两个操作数都转换为int。
   */

  }
}
