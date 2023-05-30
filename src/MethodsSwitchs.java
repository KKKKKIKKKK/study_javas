public class MethodsSwitchs {
  // <access_modifier> <return_type> <method_name>( list_of_parameters)
    // {
    // //body
    // }

    
    public String today(int day ) {
        String str="";
        try {
           
        } catch (Exception e) {
            // TODO: handle exception
        }
      
    
        return str; 
    }
    public static void main(String[] args) {
        try {
            int day = 4;  // 1~4 가능 
            String str = ""; //string 에 변수 넣음 

        
            MethodsSwitchs methodsSwitchs = new MethodsSwitchs();
           String returnResult =  methodsSwitchs.today(day);
            System.out.println( returnResult);
                
            } catch (Exception e) {
                // TODO: handle exception}
            }
            //return 0;
    }
}