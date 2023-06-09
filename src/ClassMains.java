import cases.ClassSeconds; 
public class ClassMains { 
    public static void main(String[] args) {
        
        try {



            ClassFirsts calssFirsts =new ClassFirsts(); //인스턴스화 new  no 파라미터 1-1 괄호에 아무것도 없어서 클래스를 생성하지만, ()안에 채우면 
            ClassFirsts calssFirstsWithVar =new ClassFirsts(5); //1-2생성자는 같으나, 파라미터 안에 5를 return 
            int second = calssFirstsWithVar.getsecond(); //1-3 바로 위 생성자. 을 하면 second가 보임. 변수일때만 가져올 수있음 1-4 get second 적은후 int 
            ClassSeconds   classSeconds = new ClassSeconds(6);
            System.out.println(); //1-1 빈공간 출력 왜?

        } catch (Exception e) {
            // TODO: handle exception
        }


        
        //return0;
    }
}
