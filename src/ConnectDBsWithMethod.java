import java.sql.*;

import cars.FactoryDMLs;

public class ConnectDBsWithMethod {
    public static void main(String[] args) {
       Connection connection ; 
       Statement statement ; 
       
       
        try {
            // - MySQL workbench 실행 : JDBC
            // - User/password와 접속 IP:port 접속
            String url = "jdbc:mysql://127.0.0.1:3306/db_cars";
            String user = "root";
            String password = "!yojulab*";

            connection = DriverManager.getConnection(url, user, password);
            System.out.println("DB연결 성공\n");

            // - query Edit
            statement = connection.createStatement();
            String query = "SELECT * FROM factorys";
            FactoryDMLs factoryDMLs = new FactoryDMLs(); // 1)factory 인스턴스화, 
            ResultSet resultSet = factoryDMLs.selectStatements(statement, query);
            while (resultSet.next()) {
                System.out.println(resultSet.getString("COMPANY_ID") + resultSet.getString("COMPANY"));
            }

            // SELECT COUNT(*) AS CNT FROM factorys;
            query = "SELECT COUNT(*) AS CNT FROM factorys";
            resultSet = factoryDMLs.selectStatements(statement, query); //2)위에 factorydml 데리고옴. 
            int totalCount = 0;

            while (resultSet.next()) {
                System.out.println(resultSet.getInt("CNT"));
                totalCount = resultSet.getInt("CNT");
            }
            // function 화 시켜야함 초기적인단계인 query전체 단계 

            /*
            INSERT INTO factorys
            (COMPANY_ID, COMPANY) 
            VALUE 
            ('CAR-01', 'AUDI');
            */
            String companyId = "CAR-01";
            String company = "AUDI" ;
            query = "INSERT INTO factorys " +
                    "(COMPANY_ID, COMPANY) " +
                    " VALUE " +
                    "('"+companyId+"', '"+company+"') ";
            
            int count = factoryDMLs.insertStaments(statement, query);
            System.out.println();

            statement.close(); 
            connection.close(); 
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
       
       
        }finally{                      // 1)   에러이든 아니든 자원반납 목적 동작시켜주고 싶을 때finally 사용 
                   // 1-1) 인스턴스 new 반대로 수행 
                                      // 1-2) editor를 코드화시킬때, 
        }                             // 1-3) 
        System.out.println();
    }
}