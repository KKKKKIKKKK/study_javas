import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Scanner;
import java.util.UUID;

import commons.Commons;
import surveys.Statistics;

public class SurveysApp
{
    public static void main(String[] args)
    {
        try
        {
            String url = "jdbc:mysql://127.0.0.1:3306/db_survey";
            String user = "root";
            String password = "12345678";

            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("DB연결 성공\n");

            // - query Edit
            Statement statement = connection.createStatement();
            
            System.out.println("--- 설문자 가능 명단 ---");
            // -- 설문자 가능 명단(가입 완료)
            // -- 1. 홍길동, 2.장길산, 3.신사임당, ...
            String queryB = "select *\n" + //
                    "from respondents;";
            ResultSet resultSet = statement.executeQuery(queryB);
            int number = 1;
            Scanner scanners = new Scanner(System.in);

            HashMap<String, String> respondentsInfo = new HashMap<>();
            while (resultSet.next())
            {
                System.out.print(number + "." + resultSet.getString("respondents") + ", ");
                respondentsInfo.put(String.valueOf(number), resultSet.getString("respondents_id"));
                number = number + 1;
            }
            System.out.println();
            // 설문자 선택
            System.out.print("설문자 선택: ");
            String respondent = scanners.nextLine();

            // -- 설문 시작
            // -------- 참조 : poll contents example -------------
            // -- 1. 교수는 수업 전 강의 목표를 명확히 제시하였습니까?
            // -- 2. 강의의 내용은 체계적이고 성의있게 구성되었는가?
            System.out.println("-- 설문 시작");
            queryB = "select *\n" + //
                    "from questions;";
            resultSet = statement.executeQuery(queryB);
            number = 1;
            Statement statement_second = connection.createStatement();

            Commons commons = new Commons();
            while (resultSet.next())
            {
                System.out.println(number + "." + resultSet.getString("questions") + ", ");

            queryB = "select T_cho.choice_id, T_cho.choice\n" + //
                    "from question_choice as T_ques\n" + //
                    "inner join choice as T_cho\n" + //
                    "on T_ques.choice_id = T_cho.choice_id\n" + //
                    "and questions_id = 'Q1';";
            ResultSet resultSet_second = statement_second.executeQuery(queryB);
            int number_second = 1;
            HashMap<String, String> choiceInfor = new HashMap<>();
                while (resultSet_second.next())
                {
                    System.out.print("(" + number_second + ")" + "." + resultSet_second.getString("choice") + ", ");
                    choiceInfor.put(String.valueOf(number_second), resultSet_second.getString("choice_id"));
                    number_second = number_second + 1;
                }
            resultSet_second.close();
            System.out.println();
            // insert 문 작성
            System.out.print("답항 선택: ");
            String choice_key = scanners.nextLine();   // 1, 2, 3으로 답변
            queryB = "insert into statistics\n" + //
                    "(statistics_id, respondents_id, questions_id, choice_id)\n" + //
                    "values\n" + //
                    "('" + commons.generateUUID() + "', '" + respondentsInfo.get(respondent)
                    + "', '" + resultSet.getString("questions_id")
                    + "', '" + choiceInfor.get(choice_key) + "');";
            int result = statement_second.executeUpdate(queryB);

            number = number + 1;
            }
            System.out.println();

            //통계 - 총 설문자 표시
            Statistics statistics = new Statistics();
            statistics.getRespondents(statement);
        }
        catch (Exception e)
        {
             System.out.println(e.getMessage());
        }
    }
    
}
