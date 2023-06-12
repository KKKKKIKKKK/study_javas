import java.sql.*;

public class ConnectDBs0612 {
    public static void main(String[] args) {
       
       
        try {
            // - MySQL workbench 실행 : JDBCs
            // - User/password와 접속 IP:port 접속
            String url = "jdbc:mysql://127.0.0.1:3306/db_cars";
            String user = "root";
            String password = "!yojulab*";

            Connection connection = DriverManager.getConnection(url, user, password);
                System.out.println("DB연결 성공\n");

            // - query Edit
            Statement statement = connection.createStatement();
            String query = "SELECT * FROM factorys";
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                System.out.println(resultSet.getString("COMPANY_ID") + resultSet.getString("COMPANY"));
            }
            //SELECT COUNT(*) AS CNT FROM factorys;
            query = "SELECT COUNT(*) AS CNT FROM factorys ";

            resultSet = statement.executeQuery(query);
            int totalCount = 0 ; 

             while (resultSet.next()) {
                System.out.println( resultSet.getInt("CNT"));
                totalCount = resultSet.getInt("CNT");
            }
            // INSERT INTO factorys 
            // (COMPANY_ID , COMPANY)
            // VALUE
            // ('CAR-01' , 'AUDI'); 
            String companyId = "CAR- 01";               //companyId 변수설정 
            String company = "AUDI";                    //company 변수설정 
            query = "INSERT INTO factorys " +           // 스페이스 찍어줌. 
                    "(COMPANY_ID , COMPANY) " +         //COMPANY_ID , COMPANY 를 위에 변수로 설정 
                    " VALUE " + 
                    "('"+companyId+"', '"+company+"') "; //쿼리안에 ' " +변수로 넣어준 상태에서 진행. 
           
           
            int count =  statement.executeUpdate(query);
            System.out.println();
        } catch (Exception e) {      //에러발생시 캐치함. 
            // TODO: handle exception
              System.out.println(e.getMessage());
        }
         System.out.println();
    }
}