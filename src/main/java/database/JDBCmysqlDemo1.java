package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class JDBCmysqlDemo1 {

  public static void main(String[] args) throws SQLException {
    String SQL_SELECT = "select *from Course";
    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql",
        "root", "11111111");

    if (conn != null) {
      System.out.println("Connected to the database!");
    } else {
      System.out.println("Fail to make connection");
    }
    PreparedStatement preparedStatement = conn.prepareStatement(SQL_SELECT);
    ResultSet resultSet = preparedStatement.executeQuery();

    List<Course> courseList = new ArrayList<>();
    while (resultSet.next()) {
      String courseId = resultSet.getString("courseId");
      String subjectId = resultSet.getString("subjectId");
      String courseNumber = resultSet.getString("courseNumber");
      String title = resultSet.getString("title");
      String numOfCredits = resultSet.getString("numOfCredits");

      Course instance = new Course();
      instance.setCourseId(courseId);
      instance.setSubjectId(subjectId);
      instance.setCourseNumber(courseNumber);
      instance.setTitle(title);
      instance.setNumOfCredits(numOfCredits);

      courseList.add(instance);
    }
    System.out.println(courseList);
  }
}