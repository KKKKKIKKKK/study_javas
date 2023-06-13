package commons;

import java.util.UUID;

public class Commons {
    //1-1 ※ UUID 특정 키를 생성한다는 말. 

    public String generateUUID() {
         return UUID.randomUUID().toString();

    }
    
}
