package objectandclass;

class Book {

  String name;
  String author;

  public void setName(String name) {
    this.name = name;
  } // this关键字用于调用隐藏的变量,当实例变量和类变量重名时，类变量会被隐藏。

  public void setAuthor(String author) {
    this.author = author;
  }
}

public class testBook{
  public static void main(String[] args) {
    Book bo = new Book();
    bo.setName("linson");
    System.out.println("setName" + bo.name);

    bo.setAuthor("gogo");
    System.out.println("setAuthor" + bo.author);




  }
}