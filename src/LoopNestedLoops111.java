public class LoopNestedLoops111 {
    public static void main(String[] args) {
        // for 안에 변수선언 
       
        for (int first = 1; first < 5; first = first + 1) {
        System.out.println("for " + first);
        }
    
        for ( int second =1; second <=4; second =second + 1) {
                System.out.print("_?");
        }
        System.out.println();
       
        System.out.println("end");
        //return 0;

    }
}


