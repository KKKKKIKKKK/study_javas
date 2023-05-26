import java.util.Scanner;

public class PollsWhile {

    public static void main(String[] args) {
        try {
            Scanner myObj = new Scanner(System.in);  // Create a Scanner object
            String answer = "";

            //☆ 1-1. 선택에 따라 안내글을 보여드립니다 (답변) 사용
            System.out.println("선택에 따라 안내글을 보여드립니다.");

            boolean loops = true;
           
                System.out.println("------작동 key-----");
                System.out.println("(E)xit : 종료");
                System.out.println("(P)oll : 설문시작");
                System.out.println("(S)tatistic : 설문통계");
                

               
               
                while (loops) {
                    System.out.print("선택입력 : ");
                    answer = myObj.nextLine();

                  if (answer.equals("P")) {
                    //☆ 1-5. 각 1번에 대한 프린트값  입력  
                    System.out.println("----설문시작-----");

                    } else if (answer.equals("S") || answer.equals("Statistic" )) {
                    //☆ 1-5. 각 1번에 대한 프린트값  입력
                    System.out.println("----설문통계----");
                    } else if (answer.equals("E" ) || answer.equals("Exit" )  )   {
                    //☆ 1-5. 각 1번에 대한 프린트값  입력
                   
                    System.out.println("----설문종료----"+ "Exit");
                    break ;
                   
                   

                  
                }

            }
        } catch (Exception e) {
            System.out.println();
        }finally {
            System.out.println();
        }
        System.out.println();
    

        // return 0;
    }
}