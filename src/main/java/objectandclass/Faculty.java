package objectandclass;

public class Faculty extends Employee {
  Faculty() {
    super("ssds"); //在子类中，如果子类和父类有同名的方法，使用 super 可以显式地调用父类的方法
    System.out.println("(3) Faculty's no-arg constructor is invoked");
  }

  public static void main(String[] args) {
    new Faculty();
  }
}


class Employee extends Person {


  Employee(String s) {
    super("SSCS");
//    this("(2) Invoke Employee’s overloaded constructor");
    System.out.println("(2) Employee's no-arg constructor is invoked");
    System.out.println(s);
  }

//  Employee(String s) {
//    System.out.println(s);
//  }
}


class Person {

  Person(String S) {
    System.out.println("(1) Person's no-arg constructor is invoked");
    System.out.println(S);
  }
}
