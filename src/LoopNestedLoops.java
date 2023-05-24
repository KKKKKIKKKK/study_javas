public class LoopNestedLoops 
{
    public static void main(String[] args)
     {
      

    int second = 5;
    
    for (int line= 1; line< second ;  line = line  +1 ) {

    // code block to be executed
    System.out.println("for" +line);
    for (int line_2= 1; line_2< second ;  line_2 = line_2  +1 ) {
        System.out.println("_?");

    }
    System.out.println();
}
    System.out.println("End");
    // return 0;

    }

    }