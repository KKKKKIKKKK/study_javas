import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        
        String answer = ""; // 사용자의 답변을 저장할 변수
        String[] answers = new String[2]; // 두 개의 답변을 저장할 배열

        System.out.println("1. 교수는 수업 전 강의 목표를 명확히 제시하였습니까? ");
        System.out.println("(1) )전혀 아니다." + "(2) 아니다. " + "(3) 그렇다." + "(4)매우그렇다." (5));
        System.out.println("답)1");

        answers[0] = myObj.nextLine(); // 첫 번째 답변을 입력받음

        System.out.println("2. 문항");
        System.out.println("(1) 답항" + "(2) 답항" + "(3) 답항");

        answers[1] = myObj.nextLine(); // 두 번째 답변을 입력받음

        for (int first = 0; first < answers.length; first = first + 1) {
            System.out.print(answers[first] + ",");
        }

        System.out.println();
    }
}