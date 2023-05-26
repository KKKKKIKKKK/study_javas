import java.util.Scanner;

public class TeacherPollswithout_C {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        String[] answers = new String[4];
        String[][] polls = {
                { "1. 교수는 수업 전 강의 목표를 명확히 제시하였습니까? " },
                { "(1) 전혀 아니다.", "(2) 아니다.", "(3) 그렇다.", "(4) 매우그렇다.", "-답은 한가지만 선택가능." },
                { "2. 강의의 내용은 체계적이고 성의있게 구성되었는가?" },
                { "(1) 전혀 아니다.", "(2) 아니다.", "(3) 그렇다.", "(4) 매우그렇다.", "-답은 한가지만 선택가능." },
                { "3. 교수는 강의 내용에 대해 전문적 지식이 있었는가? " },
                { "(1) 전혀 아니다.", "(2) 아니다.", "(3) 그렇다.", "(4) 매우그렇다.", "-답은 한가지만 선택가능." },
                { "4. 강의 진행 속도는 적절하였는가?" },
                { "(1) 전혀 아니다.", "(2) 아니다.", "(3) 그렇다.", "(4) 매우그렇다.", "-답은 한가지만 선택가능." },
        };

        int count = 0;
        for (int second = 0; second < polls.length; second = second + 2) {
            System.out.println(polls[second][0]);
            System.out.print("답하기 : ");
            answers[count] = myObj.nextLine();
            System.out.println( answers[count]);
            count = count + 1;
            System.out.println();
            
           
        }
        for (int i =0; i<4; i=i+1) {
            System.out.print(answers[i]);

        
        }
    
    }
    

}



// 
    //for (int first=0 ; first< answers.length; first =first + 1){
        //System.out.print(answer[first][second] + ",");
    //}
    //System.out.println();
//}