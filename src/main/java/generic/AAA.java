package generic;

import java.util.ArrayList;

public class AAA {

  public class GenericStack<E> {

    private ArrayList<E> list = new ArrayList();

    public int getSize() {
      return list.size();
    }

    public E peek() {
      return list.get(getSize() - 1);
    }

    public void push(E o) {
      list.add(o);
    }



  }
}
