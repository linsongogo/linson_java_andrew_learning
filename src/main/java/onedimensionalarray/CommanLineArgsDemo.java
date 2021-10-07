package onedimensionalarray;

public class CommanLineArgsDemo {

  public static void main(String[] args) {
    String[] city = {"New York", "Boston", "Atlanta"};

    //    for (int i = 0; i < args.length; i++) {
    //      System.out.println(args[i]);
    //    }

    CommanLineArgsDemoB.main(city);
  }
}
