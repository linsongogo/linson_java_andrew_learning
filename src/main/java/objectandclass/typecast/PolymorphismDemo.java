package objectandclass.typecast;

import objectandclass.Course;

public class PolymorphismDemo {

  public static void main(String[] args) {
    m(new GraduateStudent());
    m(new Student());
    m(new Person());
    m(new Object());

    //Object o1 = new Course("wrong");
    Object o = new Student(); //隐式转换 向上转换 upcasting
    m(o);

    //断点、debug、选中、右键、evaluate
    if (o instanceof Student) {       //检测o是否指向student实例
      Student b = (Student) o;//显示转换 向下转换  downcasting
    }

  }


  public static void m(Object x) {
    System.out.println(x.toString());
  }
}


class GraduateStudent extends Student {

}


class Student extends Person {

  public String toString() {
    return "Student";
  }
}


class Person extends Object {

  public String toString() {
    return "Person";
  }
}
