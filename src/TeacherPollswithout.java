import java.util.Scanner;
public class TeacherPollswithout {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
//위에 똑같은 이름으로 쓰면 안됨 (string answer=" ";)
        String answer="";
        //변수선언해주기 2개니까   answer ={,} 초기값이 중요 &묶음
        String[] answers ={"" , ""};

        System.out.println("1.문항");
        System.out.println("(1) 답항"+ "(2) 답항"+"(3) 답항");
        //사용자가 답하는 것을 알기 위한 comment
        System.out.println("답하기");
        
        answers [0]= myObj.nextLine();

        System.out.println("2.문항");
        System.out.println("(1) 답항"+ "(2) 답항"+"(3) 답항");
        
        answers[1] = myObj.nextLine();
//for 적어주기 
for (int first = 0; first < answers.length; first = first + 1) {
    System.out.print(answers[first] + ",");
}

        System.out.println();
        //return 0;
    }
}
