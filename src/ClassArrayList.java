import java. util. ArrayList ;

public class ClassArrayList {
    public static void main(String[] args) {
        try {
            int[] numbers = {1,2,3}; // int [] 괄호안에 숫자 선언 .

            ArrayList arrayList = new ArrayList(); // 1)Arraylist 인스턴스 무조건하기  
            arrayList .add(1);  //true //2)int 123과 같다. 다른점은 위는 [] 아래는 []필요x 
            arrayList .add(2);  //true
            arrayList .add(3); //true
            arrayList.size();    //3 -★ arrayList 총 사이즈. 
            //int val = (int)arrayList.get(2);//Cannot evaluate because of org.eclipse.debug.core.DebugException: could not resolve type: int.
            arrayList.set(1,5);// Integer@38 "2" - ★셋팅하고 싶을 때, (순서.값)
           
            arrayList.remove(0);//Integer@34 "1"
            arrayList.clear();// (void)- ★초기화 하고 싶을 때 


            System.out.println();

        } catch (Exception e) {
            // TODO: handle exception
        }
        //return0; 
    }
    
}
