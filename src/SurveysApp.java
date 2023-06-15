import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import surveys.Statistics;

public class SurveysApp
{
    public static void main(String[] args)
    {
        try
        {
            String url = "jdbc:mysql://127.0.0.1:3306/db_survey";
            String user = "root";
            String password = "12345678";

            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("DB연결 성공\n");

            // - query Edit
            Statement statement = connection.createStatement();

            // 통계 - 총 설문자 표시
            Statistics statistics = new Statistics();
            statistics.getRespondents(statement);
        }
        catch (Exception e)
        {
             System.out.println(e.getMessage());
        }
    }
    
}
