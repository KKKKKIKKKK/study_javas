import java.util.HashMap; 

public class ClassHashMaps {
    public static void main(String[] args) {
      try {
        
            HashMap hashMap = new HashMap (); 
            hashMap.put("first", 1 ); //null
            hashMap.put("second",2);  //null
            hashMap.put("third",3);   //null
            hashMap.get("third"); // Integer@42 "3" 순서값이 아닌 키값 

            hashMap.size(); //3 사이즈3 으로 바뀜  
            hashMap.put("second",5); //Integer@51 "2"
            hashMap.remove("second"); //Integer@50 "5" - 전체 삭제 
            hashMap.keySet(); //HashMap$KeySet@68 size=2
            hashMap.values(); // HashMap$Values@75 size=2
            hashMap.clear(); // (void) -초기화 


           



            System.out.println();

      } catch (Exception e) {
        // TODO: handle exception
      }
        
    }
    
}
