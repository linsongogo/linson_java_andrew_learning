package objectandclass.equalsdemo;

public class TestStudent {

  public static void main(String[] args) {
    Student student1 = new Student("Andrew", "Programming");
    Student student2 = new Student("Andrew", "Coding");
//    Student student2 = new Student("Andrew", "Programming");

    System.out.println(student1.equals(student2));// equals方法默认指向Objetc类的equals方法，Object类的equal是判断这个变量的地址，而不是那个值本身。
  }

}
