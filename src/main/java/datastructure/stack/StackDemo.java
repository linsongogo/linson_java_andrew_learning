package datastructure.stack;

import java.util.Stack;

public class StackDemo {

  public static void main(String[] args) {
    Stack<Integer> stack = new Stack<>();

    stack.push(1);
    stack.push(2);
    stack.push(3);
    stack.push(4);
    stack.push(5);
    stack.push(6);

    System.out.println(stack); // [1, 2, 3, 4, 5, 6]

    //pop 移除堆栈顶部的对象，并将该对象作为函数的值返回。
    System.out.println(stack.pop()); // 6
    System.out.println(stack); // [1, 2, 3, 4, 5]

    //peek 查看堆栈顶部的对象，而不将其从堆栈中移除。
    System.out.println(stack.peek()); // 5
    System.out.println(stack);  //[1, 2, 3, 4, 5]

    while (!stack.isEmpty()){
      System.out.println(stack.pop()); // （换行的）5 4 3 2 1
    }
    System.out.println(stack); // []
  }
}
