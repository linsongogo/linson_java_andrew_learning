package regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchPatternDemo {

  public static void main(String[] args) {
    //匹配数字  \d  数字字符匹配。等效于 [0-9]。
    Pattern pattern = Pattern.compile("\\d{11}", Pattern.CASE_INSENSITIVE);
    Matcher matcher = pattern.matcher("13068146985");

    boolean matchFound = matcher.find();
    if (matchFound) {
      System.out.println("Match found");
    } else {
      System.out.println("Match not found");
    }


    //匹配常用字符   \w  匹配任何字类字符，包括下划线。与"[A-Za-z0-9_]"等效。
    //匹配空格字符   \s  匹配任何空白字符，包括空格、制表符、换页符等。与 [ \f\n\r\t\v] 等效。
    //匹配非数字    \D  非数字字符匹配。等效于 [^0-9]。
    //重复匹配

  }

}
