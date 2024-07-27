package datastructure.map;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {

  public static void main(String[] args) {
    //TreeMap 比较和排序（默认升序）；HashMap 效率更高
    Map<Integer, String> treeMap = new TreeMap<>(new DescendingSorter());
    treeMap.put(40000, "小张");
    treeMap.put(30000, "小李");
    treeMap.put(50000, "小赵");

    treeMap.forEach((k, v) -> {
      System.out.println(k + ":" + v);
    });

    //创建学生实例
    Student student1 = new Student();
    student1.setScore(100);

    Student student2 = new Student();
    student2.setScore(99);

    Student student3 = new Student();
    student3.setScore(89);

    Map<Student, String> studentStringMap = new TreeMap<>(new StudentScoreDescending());

    studentStringMap.put(student1, "好学生");
    studentStringMap.put(student2, "中好学生");
    studentStringMap.put(student3, "一般学生");

    studentStringMap.forEach((k, v) -> {
      System.out.println(k + ":" + v);
    });


  }
}

class DescendingSorter implements Comparator<Integer> {

  @Override
  public int compare(Integer o1, Integer o2) {
    return o2 - o1; //降序排序
  }
}

class StudentScoreDescending implements Comparator<Student> {

  @Override
  public int compare(Student o1, Student o2) {
    return o2.getScore() - o1.getScore();
  }
}



class Student {

  private int id;
  private String name;
  private int score;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getScore() {
    return score;
  }

  public void setScore(int score) {
    this.score = score;
  }

  @Override
  public String toString() {
    return "Student{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", score=" + score +
            '}';
  }

}

