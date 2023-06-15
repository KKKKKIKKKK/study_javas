import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

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

            System.out.println("--- 통계 ---");
            // -- 총 설문자: 3명
            Statement statement = connection.createStatement();

            String queryB = "select count(*) CNT\r\n" + //
                    "from (\r\n" + //
                    "select respondents_id, count(*) as CNT\r\n" + //
                    "from statistics\r\n" + //
                    "group by respondents_id) as T_static;";
            ResultSet resultSet = statement.executeQuery(queryB);
            while (resultSet.next())
            {
                System.out.println("-- 총 설문자: " + resultSet.getString("CNT"));
            }
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }    
    }
}
