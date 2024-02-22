package objectandclass;

public class PolymorphismDemo1 {
        public static void main(String[] args) {
            m(new GraduateStudent1());
            m(new Student1());
            m(new Person1());
            m(new Object());

        }










    //动态绑定
public static void m(Object x) {
        System.out.println(x.toString());
        }
        }

class GraduateStudent1 extends Student1 {
}

class Student1 extends Person1 {
    public String toString() {
        return "Student";
    }
}

class Person1 {
    public String toString() {
        return "Person";
    }
}

