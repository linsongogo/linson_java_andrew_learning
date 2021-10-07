package objectandclass;

public class StringStudy3 {

  public static void main(String[] args) {

    String a= "Java is Fun";
    System.out.println(a.matches("Jav.*"));

    String s = "a+b$#c".replaceAll("[$+#]","NN");
    System.out.println(s);


    String[] tokens = "Java,C?C#,C++".split("[.,:;?]");

    for (int i = 0; i < tokens.length; i++) {
      System.out.println(tokens[i]);
    }

  }

}
