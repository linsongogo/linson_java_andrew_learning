package reflection;

public class Test01 {

  public static void main(String[] args)
      throws ClassNotFoundException, IllegalAccessException, InstantiationException {
    Class c1 = Class.forName("reflection.User");  //Copy Reference
    System.out.println(c1);

    //类对象只有一个
    Class c2 = Class.forName("reflection.User");
    Class c3 = Class.forName("reflection.User");
    Class c4 = Class.forName("reflection.User");

    System.out.println(c2.hashCode());
    System.out.println(c3.hashCode());
    System.out.println(c4.hashCode());

    User user1 = new User();
    User user2 = (User) c1.newInstance();

    // 对象user2是不是User类的实例
    boolean t = user2 instanceof User;
    System.out.println(t);

  }
}


