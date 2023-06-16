package surveys;

import java.sql.ResultSet;
import java.sql.Statement;

public class Statistics {
    public int getRespondents(Statement statement){
        try {
            System.out.println("--- 통계 ---");
            // -- 총 설문자 : 3명
            String queryA = "SELECT COUNT(*) CNT\r\n" + //
                    "FROM (\r\n" + //
                    "\tSELECT RESPONDENTS_ID, COUNT(*) CNT\r\n" + //
                    "\tFROM statistics\r\n" + //
                    "\tgroup by RESPONDENTS_ID\r\n" + //
                    "    ) AS T_STATIC";
            ResultSet resultSet = statement.executeQuery(queryA);
            while (resultSet.next()) {
                System.out.println("-- 총 설문자 : "+resultSet.getString("CNT"));
            }            
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return 0;
    }
}