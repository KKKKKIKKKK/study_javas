package cases;

import java.util.Scanner;
public class ForBuckets {
    public static void main(String[] args) {
        
        try {

            //1-1 try 안에 장바구니 (bucket_1,2,3 입력 진행 )
            //장바구니 3가지만 담게 선언 
            String bucket_1 = "";
            String bucket_2 = "";
            String bucket_3 = "";
            //1-3 빈 바구니 생성 
            String[] bucket = {"","",""};



            Scanner myObj = new Scanner(System.in);  // Create a Scanner object
           
           //1-2 버킷에 내용물 담을 시, 0.1.2 가능 .증가값. 횟수이기에 for로 가능 
           //for 문 +1항값과 같음

           for (int first =0 ;first < 3 ; first=first +1 ) {

            //1-4 first+1 해결하기 위해, 먼저 입력 후 "1번째 담기 " 1,2,3.4로 나옴 
            System.out.print((first+1)+"번째 담기:");
            //1-4 1번만 계속 남길수 없기에, 배열로 진행 /변하는 값을 선정 first 
            bucket[first]= myObj.nextLine(); //Read user input
           }
            
            // 버킷 1.2.3 출력 "," 하는 이유는 띄어쓰기 하기 위함 
            //1-5 빈버킷에 0.1.2 로 작성 진행 
            System.out.println("----담은 내용물----");
            System.out.println(bucket[0] + ",");
            System.out.println(bucket[1] + ",");
            System.out.println(bucket[2] + ",");

        } catch (Exception e) {
            // TODO: handle exception

        } finally {

        }
        System.out.println();

        // return 0;

    }
}