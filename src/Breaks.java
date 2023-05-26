
import java.util.Scanner;

public class Breaks {
    // ☆ 1-2. scanners 이용 import 눌러야함
    // 콜센터 업무 안내 작성

    public static void main(String[] args) {
      
        // ☆ 1. try catch 문 사용
        try {

            Scanner myObj = new Scanner(System.in);  // Create a Scanner object
            String answer ="";
            //☆ 1-1. 안내입니다 (답변) 사용
            System.out.println("안내입니다");
//★ 1-6. while문 이용해서 전체를 묶어줌  answer 3~9 /answer true (1)입력해주기 위해 loops 입력 진행 
            boolean loops = true;
            while(loops){
            System.out.println("1-대출, 2-예금, 3~9-종료 ");
            //☆ 1-2. scanners 이용해야함 눌러야함 
            
              //☆ 1-2. scanners 이용 scanner myObj 눌러야함 
           
            
            System.out.println("입력하세요");
            //☆ 1-3. 문자 ( String) 및 스캐너 사용  
              answer =myObj.nextLine();
            
            //☆ 1-4. 분기필요 ( String) 및 스캐너 사용 위 answer을 변수로 사용 

            if(answer.equals("1")) {
                //☆ 1-5. 각 1번에 대한 프린트값  입력  
                System.out.println("대출 업무입니다.");

            } else if (answer.equals("2")) {
                  //☆ 1-5. 각 1번에 대한 프린트값  입력
                System.out.println("예금 업무입니다.");

            }else{
                  //☆ 1-5. 각 1번에 대한 프린트값  입력
                System.out.println("업무가 종료됩니다.");

                break;
            }
        }

        } catch (Exception e) {
            System.out.println();

        } finally {
            System.out.println();
        }
        System.out.println();

        // return 0;
    }

    // function의 기본적인 주요 기능 .
    // try catch문 사이에만 입력 -기본(1)

}
