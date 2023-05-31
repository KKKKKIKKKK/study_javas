public class ClassFirsts {
    //main안넣고 비어있는 상태 
    //생성자의 규칙 존재1.파일자바이름2.생성자이름,3.클래스이름  
    public int second =0 ;  //  1-3변수 0초기화 생성자 두개 다에 영향 미침   
    ClassFirsts(){

        System.out.println();

    }

    ClassFirsts(int first){ //1. 파라미터를 바꾸면 "class first 생성자" 내) 똑같은 이름을 여러개 사용 가능
        this.second =first;   //1-3 this. 을 클릭시 second 의 값을 받을 수 있음. 
        System.out.println(first); //1-1 first프린트 
    
    }
    public int getsecond(){ //1-4 메서드 쓸때, public 먼저 사용 return 값은 int .second 값을 가져와서 get()파라미터는 필요없음 
        return this. second; //1-5 
    }

}