package regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AAA {

  public static void main(String[] args) {

    final String regex = "(\\d{3,4})-(\\d{7,8})";
    final String string = "010-98765432\n"
        + "0876-76655667";

    final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
    final Matcher matcher = pattern.matcher(string);

    while (matcher.find()) {
      System.out.println("Full match: " + matcher.group(0));

      for (int i = 1; i <= matcher.groupCount(); i++) {
        System.out.println("Group " + i + ": " + matcher.group(i));
      }
    }

  }
}

