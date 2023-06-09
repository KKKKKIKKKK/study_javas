public class StringClasses {
    public static void main(String[] args) {
        try {
            String name = "Sang hun oh";  // 변수 1)name 선언후 2) string 타입 부여 
            
           
           name.equalsIgnoreCase("Sang hun oh");//true
           name.equalsIgnoreCase("Sang hun ");//false
           
           String name_second = new String("friend Jane!");//new를 사용해서 인스턴스 초기화 
           name_second .equals("friend Jane!");  //true
           name_second .length(); // 13
           name_second .replaceAll("e","a");//name_second = name_second.replaceAll("e","a")
           String[] arrays = name_second.split(" ");
           String name_substring = name_second.substring(3, 11);


            System.out.println();

        } catch (Exception e) {
            // TODO: 예외 처리 코드 작성
        }

        System.out.println();
        //return 0; // 메인 메서드는 void로 선언되어 있으므로 return 문은 사용할 필요가 없습니다.
    }
}