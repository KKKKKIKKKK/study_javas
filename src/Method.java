
public class Method {
    public int minus(int first, int second){
        int result = 0;
        try {
           result = first - second;
        } catch (Exception e) {
            // TODO: handle exception
        }
        return result;
    }
    
    public int add(int first, int second){
        int result = 0;
        try {
            result = first + second;
        } catch (Exception e) {
            // TODO: handle exception
        }
        return result ;
    }
    
    public static void main(String[] args) {
        Method obj = new Method(); // 1. 인스턴스 생성
        // - 인스턴스는 1회
        // - 초기 값은 2를 넘지 않음.
        // - main 결과값은 17


        try {
            int second = 2;

            for (int first = 2; first <= 18; first=first+1) {
                first = obj.add(first, second);
                
                if (first >= 18) {
                    second = obj.minus(first, second);
                }
            }
            
            if (second == 17) {
                System.out.println("Main Result: " + second);
            }
        } catch (Exception e) {
            // 예외 처리
        }
    }
}