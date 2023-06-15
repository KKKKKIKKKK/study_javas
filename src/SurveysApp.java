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
            String password = "!yojulab*";

            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("DB연결 성공\n");

            // - query Edit
            Statement statement = connection.createStatement();
            System.out.println("--- 통계 ---");
            String queryA = "SELECT  count(*) CNT\r\n" + //
                    "FROM(\r\n" + //
                    "\tSELECT RESPONDENTS_ID , count(*) CNT\r\n" + //
                    "\tFROM statistics\r\n" + //
                    "\tgroup BY RESPONDENTS_ID \r\n" + //
                    ")AS  T_STATISTICS";
            ResultSet resultSet = statement.executeQuery(queryA);
            while (resultSet.next()) {
                System.out.println("-- 총 설문자 : " + resultSet.getString("CNT") );
            }


           
        } catch (Exception e) {
            // TODO: handle exception

             System.out.println(e.getMessage());
        }
    }
    
}
