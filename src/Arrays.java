public class Arrays {
    public String []  initialArrays(){  //1)public 값 생성 
        String[] carTypes = {"Volvo", "BMW", "Ford", "Mazda"}; 
        return carTypes ;


    } 
    //-------------------------------------------------------------------------//
     public static void main(String[] args) {
        Arrays arrays = new Arrays();
        String[] cars = arrays.initialArrays();  //위 상단의 차의 어레이 받아들여 프린트 
        System.out. println (cars.length);
        
        for(int first =0; first < cars.length; first= first+1){
            System.out.print(cars[first]+",");
        }
        System.out.println();
       
           
        System.out.println("end");
            //return 0;
    


    }  
}
