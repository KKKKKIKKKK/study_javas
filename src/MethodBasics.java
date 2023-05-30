public class MethodBasics {
//<access_modifier> <return_type> <method_name>(list of)
//{
//body
//}
//x에 x+1 
    public int F(int x) //data의 값과 return과 같아야 함. /<return_data_type>- int로 변경 
    {
        int result = x + 1; //return값에는 변수가 항상 들어가야함 
        return result; // x+1의 값이 들어가야함  
    }
    
    public int T(int y) //data의 값과 return과 같아야 함. /<return_data_type>- int로 변경 
    {
        int result = y + 1; //return값에는 변수가 항상 들어가야함 
        return result; // x+1의 값이 들어가야함  
    }
    public static void main(String[] args) {
        
        try {
            
            int x=4;
            int y =0;
            //y= x + 1; //변수에 +1
            MethodBasics  methodBasics = new MethodBasics (); //변수의 타입=class 
               //class 내에 있는 function 
            
           y = methodBasics.F(x);
           
           //1.인스턴스화 시키고 똑같은 값을 도출하도록 
           y = methodBasics.T(y);
           

        
        } catch (Exception e) {
            // TODO: handle exception
        }
        System.out.println();
        //return0;  //결과값 
    }
}
