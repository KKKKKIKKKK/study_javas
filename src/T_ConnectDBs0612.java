import java.sql.*;

public class T_ConnectDBs0612 {
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
            
            // SELECT COUNT(*) AS CNT FROM factorys;
            query = "SELECT COUNT(*) AS CNT FROM factorys";
            resultSet = statement.executeQuery(query);
            int totalCount = 0;
            while (resultSet.next()) {
                System.out.println(resultSet.getInt("CNT"));
                totalCount = resultSet.getInt("CNT");
            }

            /*
            INSERT INTO factorys
            (COMPANY_ID, COMPANY) 
            VALUE 
            ('CAR-01', 'AUDI');
            */
            String companyId = "CAR-01";
            String company = "AUDI";
            query = "INSERT INTO factorys " +
                    "(COMPANY_ID, COMPANY) " +
                    "VALUES " +
                    "('"+companyId+"', '"+company+"') ";
           
            int count = statement.executeUpdate(query);
            System.out.println("추가된 레코드 수: " + count);

            // UPDATE factorys
            // SET COMPANY = '페라리'
            // WHERE COMPANY_ID = 'CAR-01';
            companyId = "CAR-01";
            company = "페라리";
            query = "UPDATE factorys " +
                    "SET COMPANY = '"+company+"' " +
                    "WHERE COMPANY_ID = '"+companyId+"' ";
            count = statement.executeUpdate(query);
            System.out.println("업데이트된 레코드 수: " + count);

            // DELETE FROM factorys
            // WHERE COMPANY_ID = 'CAR-01';
            companyId = "CAR-01";
            query = "DELETE FROM factorys " +
                    "WHERE COMPANY_ID = '"+companyId+"' ";
            count = statement.executeUpdate(query);
            System.out.println("삭제된 레코드 수: " + count);

            connection.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println();
    }
}