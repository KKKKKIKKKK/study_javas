import java.util.ArrayList; 
import java.util.HashMap;

public class LoopForEachs {



    //refer: https://www.w3schools.com/java/java_foreach_loop.asp
    public static void main(String[] args) {
       


        try {
            ArrayList<String> cars = new ArrayList<String>() ;
            cars.add("Volvo"); 
            cars.add("BMW"); 
            cars.add("Ford"); 
            cars.add("Mazda");
            // for (type variableName : arrayName) {
            // code block to be executed
            //   }
            
            for(String car : cars) {
                System.out.println(car);

            }//타입 type variableNAME : aray name (cars) 
               
            
            //Automobile Company Vehicle Names 
            ArrayList <HashMap>carList =new ArrayList<HashMap>(); //1)new리스트 만들기 
            HashMap <String, String> carSpec = new HashMap <String, String> (); // 2)카 네임 
            carSpec.put ("CarCompany","Ford");
            carSpec.put ("CarName", "Mustang");
            carSpec.put ("Year", "2022");
            carList.add (carSpec);
            
            carSpec = new HashMap <String, String> (); 
            carSpec.put ("CarCompany","Toyota");
            carSpec.put ("CarName", "Camry");
            carSpec.put ("Year", "2021");
            carList.add (carSpec); 
           
            carSpec = new HashMap <String, String> (); 
            carSpec.put ("CarCompany","Chevrolet");
            carSpec.put ("CarName", "Silverado");
            carSpec.put ("Year","2023");
            carList.add (carSpec); 



for(HashMap<String, String> car : carList){                      //프린트 하기 위한 , for each 준비구문 
     System.out.println(car.get("CarCompany")+car.get("CarName") +car.get( "year"));  //가져올때.
    
     System.out.println();
    
}
            System.out.println();

            } catch (Exception e) {
            // TODO: handle exception
            }
    }
    
}
