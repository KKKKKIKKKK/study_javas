package surveys;

import java.beans.Statement;
import java.sql.ResultSet;

public class Statistics
{
    public int getRespondents(Statement statement)
    {
        try
        {
            System.out.println("--- 통계 ---");
            String queryB = "SELECT  count(*) CNT\r\n" + //
                    "FROM(\r\n" + //
                    "\tSELECT RESPONDENTS_ID , count(*) CNT\r\n" + //
                    "\tFROM statistics\r\n" + //
                    "\tgroup BY RESPONDENTS_ID \r\n" + //
                    ")AS  T_STATISTICS";
            ResultSet resultSet = statement.executeQuery(queryB);
            while (resultSet.next())
            {
                System.out.println("-- 총 설문자 : " + resultSet.getString("CNT") );
            }
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        return 0;
    }    
}
