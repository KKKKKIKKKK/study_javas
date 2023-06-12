import java.util.Scanner;

public class CarsWithDB {

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
          
            String workkey = scanner.nextLine();
            while(!workkey.equals("E")){
                System.out.println("선택입력: : ");
                workkey = scanner.nextLine() ; 
            }
           
        } catch (Exception e) {
            System.out.println( e.getMessage());
        }
        System.out.println();
    }
}