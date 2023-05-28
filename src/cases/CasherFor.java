package cases;

import java.util.Scanner;

public class CasherFor {

    public static void main(String[] args) {
        try {
  
            //☆ 1-1. 장바구니 5가지 넣는다는 문구 후 프린트 
            System.out.println("장바구니엔 5가지 넣음 ");

            int[] bucket = new int[5]; //빈장바구니에 넣을 물건의 값 , new int 5개의 공간. 
            int sum =0; 

          //해당 내용 각가 출력하기 위해 scanner 이용 후 변수 이용해서 값 하나씩 증가 
            Scanner myObj = new Scanner(System.in);  // Create a Scanner object
           
         

            System.out.println("----계산시작 ----");


             for (int first =0 ;first < bucket.length; first=first +1 ) { // int bucket 에 대한 값 입력을 위한 for문 
               System.out.print ((first+1)+"번째가격"); // first 초기값 0부터 시작이 1이어서 +1해줌
                bucket[first] = myObj.nextInt();        //가격 입력 

               if ( bucket [first] >100 ) {   // 가격이 100초과시 
                bucket [first] = 0  ;  // 0이 된다. 
                System.out.println("100초과 0원 적용");
               } 

                else if (bucket [first] == 0 ) {// 해당 값이 0일때, break 빠져나옴 
                break;

                } 
                sum =sum+bucket[first];  // 합계 

                
            }
            
            System.out.println("합계"+sum);  //총합 출력 
           
        } catch (Exception e) {
            // TODO: handle exception

        } finally {

        }
        System.out.println();

        // return 0;

    }
}