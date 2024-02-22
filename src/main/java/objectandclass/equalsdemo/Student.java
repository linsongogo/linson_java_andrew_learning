package objectandclass.equalsdemo;

import java.util.Objects;

public class Student {

  private String firstName;
  private String lastName;
  private String score;

  public Student(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getScore() {
    return score;
  }

  public void setScore(String score) {
    this.score = score;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Student student = (Student) o;//显示转换，向下转换
    return Objects.equals(firstName, student.firstName) && Objects.equals(
        lastName, student.lastName);
  }


  protected final void m(){

  }



}
