import java.util.Scanner;
// //------ 작동 key ------
// (E)xit : 종료                            
// (O)ption : 옵션 추가 시작
// (S)tatistic : 옵션 갯수 통계 
import java.util.Scanner;

public class CarsWithDB {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            String workKey = "P";
            while(!workKey.equals("E")){
                System.out.print("선택입력 : ");
                workKey = scanner.nextLine();
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
        System.out.println();
    }
}