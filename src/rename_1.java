import java.util.Scanner;

public class rename_1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String[] names_0 = {"이름을 입력하세요"};
        System.out.println(names_0.length);

        String[] names_1 = {"이름", ")", "FANTASTIC4"};
        System.out.println(names_1.length);

        for (int first = 0; first < names_1.length; first = first + 1) {
            System.out.print(names_1[first] + "");
        }
        System.out.println();
        
        // 1번. 질문 작성
        String question_1 = "1. 교수는 수업 전 강의 목표를 명확히 제시하였습니까?";
        System.out.println(question_1);

        String[] answer_1 = {"(1)전혀 아니다.", "(2)아니다.", "(3)그렇다.", "(4)매우 그렇다.", "답은 한가지만 선택가능"};
        for (int second = 0; second < answer_1.length; second = second + 1) {
            System.out.print(answer_1[second] + "");
        }
        
        System.out.println();

        String[] exact_1 = new String[3];
        for (int third = 0; third < exact_1.length; third = third + 1) {
            System.out.print("답 " + (third + 1) + ") 입력: ");
            exact_1[third] = sc.nextLine();
        }
        System.out.println();

        // 2번 시작
        String question_2 = "2. 강의의 내용은 체계적이고 성의있게 구성되었는가?";
        System.out.println(question_2);

        String[] answer_2 = {"(1)전혀 아니다.", "(2)아니다.", "(3)그렇다.", "(4)매우 그렇다.", "답은 한가지만 선택가능"};
        for (int second = 0; second < answer_2.length; second = second + 1) {
            System.out.print(answer_2[second] + "");
        }
        System.out.println();

        String[] exact_2 = new String[3];
        for (int third = 0; third < exact_2.length; third = third + 1) {
            System.out.print("답 " + (third + 1) + ") 입력: ");
            exact_2[third] = sc.nextLine();
        }
        System.out.println();

        // 3번 시작
        String question_3 = "3. 강의는 학습자의 흥미를 유발하였습니까?";
        System.out.println(question_3);

        String[] answer_3 = {"(1)전혀 아니다.", "(2)아니다.", "(3)그렇다.", "(4)매우 그렇다.", "답은 한가지만 선택가능"};
        for (int second = 0; second < answer_3.length; second = second + 1) {
            System.out.print(answer_3[second] + "");
        }
        System.out.println();

        String[] exact_3 = new String[3];
        for (int third = 0; third < exact_3.length; third = third + 1) {
            System.out.print("답 " + (third + 1) + ") 입력: ");
            exact_3[third] = sc.nextLine();
        }
        System.out.println();

        // 4번 시작
        String question_4 = "4. 강의의 난이도는 적절하게 조절되었습니까?";
        System.out.println(question_4);

        String[] answer_4 = {"(1)전혀 아니다.", "(2)아니다.", "(3)그렇다.", "(4)매우 그렇다.", "답은 한가지만 선택가능"};
        for (int second = 0; second < answer_4.length; second = second + 1) {
            System.out.print(answer_4[second] + "");
        }
        System.out.println();

        String[] exact_4 = new String[3];
        for (int third = 0; third < exact_4.length; third = third + 1) {
            System.out.print("답 " + (third + 1) + ") 입력: ");
            exact_4[third] = sc.nextLine();
        }
        System.out.println();

        // 설문종료 
        String[] exit_0 = {"--------------------설문종료-------------------"};
        System.out.println(exit_0.length);

        // 설문결과 
        String[] result_0 = {"--------------------설문결과-------------------"};
        System.out.println(result_0.length);


        System.out.println("1번: " + exact_1[2]);
        System.out.println("2번: " + exact_2[2]);
        System.out.println("4번: " + exact_3[2]);
        System.out.println("3번: " + exact_4[2]);
    }
}
