package LinkedListDemo;

import java.util.List;

public class LinkedList {

  public static void main(String[] args) {
    List<Integer> linkedList = new java.util.LinkedList<>();
    linkedList.add(5);
    linkedList.add(4);
    linkedList.add(3);
    linkedList.add(2);
    linkedList.add(1);
    System.out.println(linkedList);  // [5, 4, 3, 2, 1]

    linkedList.add(2,9);
    System.out.println(linkedList);  // [5, 4, 9, 3, 2, 1]
    linkedList.remove(0);
    System.out.println(linkedList);  // [4, 9, 3, 2, 1]
  }
}
