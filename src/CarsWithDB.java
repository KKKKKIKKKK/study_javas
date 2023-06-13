import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Scanner;

import commons.Commons;

public class CarsWithDB {
    public static void main(String[] args) {
        try {
            // - MySQL workbench 실행 : JDBC
            // - User/password와 접속 IP:port 접속
            String url = "jdbc:mysql://127.0.0.1:3306/db_cars";
            String user = "root";
            String password = "!yojulab*";

            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("DB연결 성공\n");

            // - query Edit// QUERY 문 던짐. 
            Statement statement = connection.createStatement();
            String query = "";

            // 작업 키 입력 = 작동KEY랑 소스같다. 단 루핑을돌린다는것 만 다름. 
            Scanner scanner = new Scanner(System.in);
            String workKey = "P";
            while (!workKey.equals("E")) {
                System.out.print("선택입력 : ");
                workKey = scanner.nextLine();
                if (workKey.equals("O")) {
                    System.out.println("- 차 이름 명단");
                    //메모장에 1. 현대-소나타 :네비게이션, 가죽시트부분. 
                    query = "SELECT T_FAC.COMPANY, T_CAR_INFOR.CAR_NAME\n" + //
                            "\t, T_CAR_INFOR.CAR_INFOR_ID\n" + //
                            "FROM (factorys AS T_FAC\n" + //
                            "\tinner JOIN car_infors AS T_CAR_INFOR\n" + //
                            "    ON T_FAC.COMPANY_ID = T_CAR_INFOR.COMPANY_ID)";
                    ResultSet resultSet = statement.executeQuery(query) ;
                    //메모장에 차명번호 입력 :1과매칭되는게 무엇인지 알기위해, 앞전 소나타 등의 값을 
                    //키와 VLAUE로 매칭해서  HashMap에 넣어줌. 
                    //1이라는 걸 누르는 순간 C001 확보 가능. 
                    int number = 1;
                    Statement statement2 = connection.createStatement();
                    ResultSet resultSet2;
                    String query2;
                    HashMap<String ,String> carNumberMap = new HashMap<>();
                    while (resultSet.next()) {
                        System.out.print(number + ". " +
                            resultSet.getString("COMPANY") + " - " +
                            resultSet.getString("CAR_NAME") + ": ");
                        String carInforId= resultSet.getString("CAR_INFOR_ID") ; 
                        carNumberMap.put(String.valueOf(number), carInforId); 
                        // 메모장에 옵션추가 시작 부분 
                        query2 = "SELECT T_OPT_INFO.OPTION_NAME\n" + //
                                "FROM option_infors AS T_OPT_INFO\n" + //
                                "\tinner join `options` AS T_OPTS\n" + //
                                "    ON T_OPT_INFO.OPTION_INFOR_ID = T_OPTS.OPTION_INFOR_ID\n" + //
                                "    AND T_OPTS.CAR_INFOR_ID = '"+resultSet.getString("CAR_INFOR_ID")+"'";
                        resultSet2 = statement2.executeQuery(query2);
                        while(resultSet2.next()){
                            System.out.print(resultSet2.getString("OPTION_NAME")+",");
                        }
                        number = number + 1;
                        System.out.println();
                    }

                    // 차량 번호 입력 출력 받는부분 : 
                    // carNumberMap.get(carNumber); 차 번호가 튀어나옴 
                    //차량마다 가지고 있는 PK를 받음 EX)5를 넣으면 5실행이됨 
                    //EX_1번 소나타 
                    System.out.print("- 차 이름 명단 : ") ;
                    String CarNumber = scanner.nextLine();
                    // System.out.println("차명 PK : " + carNumberMap.get(CarNumber));
                    System.out.println("- 선택 가능 옵션들");
                    query = "SELECT OPTION_INFOR_ID, OPTION_NAME\n" + //
                            "FROM option_infors";
                    resultSet = statement.executeQuery(query);
                    number = 1;
                    HashMap<String, String> carOptionInfor = new HashMap<>();
                    while(resultSet.next()){
                        System.out.print(number +"."+ resultSet.getString("OPTION_NAME")+", ");
                        carOptionInfor.put(String.valueOf(number), resultSet.getString("OPTION_INFOR_ID"));
                        number = number + 1;
                    }
                    System.out.println();
                    System.out.print("- 추가 옵션 선택 : ");
                    String optionNumber = scanner.nextLine();
                    System.out.println(carNumberMap.get(CarNumber) +", "+carOptionInfor.get(optionNumber));
                    String carPK = carNumberMap.get(CarNumber) ; 
                    String optionPK = carOptionInfor.get(optionNumber); 

                    //delete 옵션 sql가서 delete부분 복사후  " 사이에 넣음 " ; 
                    
                    // 1-1 commons에서 값을 불러일으키기 위해 uuid 생성 008 중복값 피하기 위한 목적 
                    Commons commons = new Commons(); 
                    //1-2 하단 query 에 optionId 기입 후 count 입력 진행 
                    String optionId = commons.generateUUID() ;  

                    query=" DELETE FROM `OPTIONS`\n" + //
                            "WHERE CAR_INFOR_ID = '"+carPK+  " 'AND OPTION_INFOR_ID = '"+optionPK+ "'" ;
                    int count = statement.executeUpdate(query); 
                    //insert 옵션 위에라 똑같이 query 부분sql 가서 복사 
                    query = " INSERT INTO `OPTIONS`\n" + //
                            "(OPTION_ID, CAR_INFOR_ID, OPTION_INFOR_ID)\n" + //
                            "value\n" + //
                            "('" + optionId +"', '"+carPK+"', '"+optionPK+"')"; // oi랑 ci 안에 carpk 입력 //o008은 중복이라 매번새로운 값 필요

                        count =   statement.executeUpdate(query); 

                        System.out.println();

                } else if (workKey.equals("S")) {
                    System.out.println("- 통계 시작 -");
                    query = "SELECT T_FAC.COMPANY, T_CAR_INFOR.CAR_NAME, COUNT(*) AS CNT\n" + //
                            "FROM (factorys AS T_FAC\n" + //
                            "\tinner JOIN car_infors AS T_CAR_INFOR\n" + //
                            "    ON T_FAC.COMPANY_ID = T_CAR_INFOR.COMPANY_ID)\n" + //
                            "    inner join `options` AS T_OPTS\n" + //
                            "    ON T_CAR_INFOR.CAR_INFOR_ID = T_OPTS.CAR_INFOR_ID\n" + //
                            "GROUP BY T_FAC.COMPANY_ID, T_CAR_INFOR.CAR_INFOR_ID";
                    
                    // executeQuery(query) 던진것에 대한 결과문이 ResultSet이다. 
                    ResultSet resultSet = statement.executeQuery(query) ;
                    while (resultSet.next()) {
                        System.out.println(resultSet.getString("COMPANY") + ", " +
                            resultSet.getString("CAR_NAME") + ", " +
                            resultSet.getInt("CNT"));
                    }
                } else {
                    System.out.println("--- 작업 키 확인 : 입력한 값 : " + workKey);
                }
            }
            System.out.println("----- 작업종료 ------");
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
        System.out.println();
    }
}