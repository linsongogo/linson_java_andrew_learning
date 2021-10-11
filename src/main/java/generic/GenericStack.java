package generic;

import java.util.ArrayList;

public class GenericStack<E> {

  private final ArrayList<E> list = new ArrayList<>();

  public int getSize() {
    return list.size();
  }

  public E peek() {   //查看堆栈顶部的对象，但不从堆栈中移除它。
    return list.get(getSize() - 1);
  }

  public void push(E o) {   //把项压入堆栈顶部。
    list.add(o);
  }

  public E pop() {    //移除堆栈顶部的对象，并作为此函数的值返回该对象。
    E o = list.get(getSize() - 1);
    list.remove(getSize() - 1);
    return o;
  }

  public boolean isEmpty() {
    return list.size() == 0;
  }
}
