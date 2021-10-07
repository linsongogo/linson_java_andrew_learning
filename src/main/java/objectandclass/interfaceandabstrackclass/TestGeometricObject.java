package objectandclass.interfaceandabstrackclass;

public class TestGeometricObject {

  public static void main(String[] args) {
    //GeometricObject ins = new GeometricObject();
    //抽象类的构造方法不能被new关键字使用来创建实例，唯一作用是被子类的构造方法调用
    MyCircle myCircle = new MyCircle();
  }

}
