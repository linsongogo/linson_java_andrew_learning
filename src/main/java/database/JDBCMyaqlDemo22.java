package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCMyaqlDemo22 {

  public static void main(String[] args) throws SQLException {
    String SQL_SELECT = "select *from Course";
    String UPDATE_SQL = "UPDATE mysql.Course t SET t.numOfCredits = 8 WHERE t.courseId = 1";

    String Insert_sql_1 =
        "INSERT INTO mysql.Course (courseId, subjectId, courseNumber, title, numOfCredits)"
            + " VALUES (4, 'music1', 4, 'chinese1', 2)";
    String Insert_sql_2 =
        "INSERT INTO mysql.Course (courseId, subjectId, courseNumber, title, numOfCredits)"
            + " VALUES (4, 'music2', 5, 'chinese2', 5)";

    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql",
        "root", "11111111");

    if (conn != null) {
      System.out.println("Connected to the database!");
    } else {
      System.out.println("Fail to make connection");
    }

    Statement statement = conn.createStatement();
    boolean flag = statement.execute(SQL_SELECT);
    System.out.println("flag: " + flag);

    int changedLine = statement.executeUpdate(UPDATE_SQL);
    System.out.println("changedLine:" + changedLine);

    statement.addBatch(Insert_sql_1);
    statement.addBatch(Insert_sql_2);
    statement.executeBatch();

  }
}
