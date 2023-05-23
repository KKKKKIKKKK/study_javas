public class MakingGamebyOneHand {
    public static void main(String[] args) {
        String emptyA = "";
        String emptyB = "";
        String emptyC = "";
      
        String card1 = "1";
        emptyA = card1;
        
        String card2 = "2";
        emptyC = card2;
        emptyB = emptyC;

        emptyC = emptyA;
        emptyA = emptyB;
        emptyB = "";

        System.out.println("A = " + emptyA);
        System.out.println("B = " + emptyB);
        System.out.println("C = " + emptyC);
    }
}