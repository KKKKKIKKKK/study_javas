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
            String url = "jdbc:mysql://127.0.0.1:3306/db_cars";
            String user = "root";
            String password = "12345678";

            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("DB연결 성공\n");

            Statement statement = connection.createStatement();
            String query = "SELECT * FROM factorys";
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next())
            {
                System.out.println(resultSet.getString("COMPANY_ID") + resultSet.getString("COMPANY"));
            }
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }    
    }
}
