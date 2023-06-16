import java.util.Scanner;
public class Sanners {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        
        
        //System.out.println("Enter username");
    //실질적으로 값을 받는 곳 (NEXT LINE)
        //String userName = myObj.nextLine();  // Read user input
       // System.out.println("Username is: " + userName);  // Output user input
      
        int first = 0;  
        int second = 0; 

        first = myObj.nextInt();
        second = myObj.nextInt();
        System.out.println(first +","+second);
        
        myObj.close(); // ★ 꼭 작성하기 
        //return 0;
    }

    public String nextLine() {
        return null;
    } 
    
}
