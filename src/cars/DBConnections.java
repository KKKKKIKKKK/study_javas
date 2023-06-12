package cars;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DBConnections {
    public Statement creatConnection(String url, String user, String password){ //1)파라미터는 url. user. 등을 데리고 옴 
       
        Statement statement =new ;
        try {
        
      
       
            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("DB연결 성공\n");

            statement  = connection.createStatement(); 

        } catch (Exception e) {
        // TODO: handle exception
        }
        return statement;  //3) return 해야 되는 값? statement 값 / 오류난 이유  변수가 캐치문 안에있어서.

    } 
}
