package cars;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FactoryDMLs {
    public ResultSet selectStatements(Statement statement, String query) throws SQLException{
        ResultSet resultSet = statement.executeQuery(query);
        return resultSet;
    }

    public int insertStaments(Statement statement, String query) throws SQLException {//1) result 결괏값은 int를 넣어줌 (2) ()괄호한에 변수 넣기 statement 
        int count = statement.executeUpdate(query) ;
        return count  ;                                  
    }
    
}