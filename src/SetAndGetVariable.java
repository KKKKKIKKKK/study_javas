public class SetAndGetVariable {
    public static void main(String[] args) {
        int A = 0;
        int B = 0;
        int C = 0;
        int D = 0;
        int E = 200;
        int F = 30;
        int G = 50;
        int H = 10;
        System.out.println(A + " " + B + " " + C + " " + D + " " + E + " " + F + " " + G + " " + H);
        A = 1;
        B = 3;
        C = 5;
        D = 7;
        System.out.println(A + " " + B + " " + C + " " + D + " " + E + " " + F + " " + G + " " + H);
        if (B == 3) {
            System.out.println(A = H);
        } else {
            System.out.println(C);
        }
        if (D != 9) {
            System.out.println(B = C);
        } else {
            System.out.println(B = E);
        }
        if (A == 10) {
            System.out.println(C = G);
        } else {
            System.out.println(D = F);
        }
        System.out.println(A + " " + B + " " + C + " " + D);
    }
}