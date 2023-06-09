import java.util.ArrayList;
import java.util.HashMap;

public class MedicalCheckupWithoutDB {

    public static void main(String[] args) {
        try {
            ArrayList<HashMap<String, String>> MedicalCheckup_list = new ArrayList<>(); // MedicalCheckup_list 생성

            HashMap<String, String> MedicalCheckup_spec = new HashMap<>(); // 홍길동 정보 추가
            MedicalCheckup_spec.put("이름", "홍길동");
            MedicalCheckup_spec.put("성별", "남");
            MedicalCheckup_spec.put("나이", "30");
            MedicalCheckup_spec.put("키 (cm), 체중 (kg)", "175, 75");
            MedicalCheckup_spec.put("혈압 (mmHg), 혈당 (mg/dL)", "120/80, 90");
            MedicalCheckup_spec.put("검진 결과", "비정상");
            MedicalCheckup_spec.put("재검진 항목", "폐암, 갑상선 질환");
            MedicalCheckup_spec.put("유지 방안", "");
            MedicalCheckup_list.add(MedicalCheckup_spec);

            MedicalCheckup_spec = new HashMap<>(); // 김영희 정보 추가
            MedicalCheckup_spec.put("이름", "김영희");
            MedicalCheckup_spec.put("성별", "여");
            MedicalCheckup_spec.put("나이", "25");
            MedicalCheckup_spec.put("키 (cm), 체중 (kg)", "160, 55");
            MedicalCheckup_spec.put("혈압 (mmHg), 혈당 (mg/dL)", "110/70, 85");
            MedicalCheckup_spec.put("검진 결과", "비정상");
            MedicalCheckup_spec.put("재검진 항목", "간암, 뇌졸중");
            MedicalCheckup_spec.put("유지 방안", "");
            MedicalCheckup_list.add(MedicalCheckup_spec);

            MedicalCheckup_spec = new HashMap<>(); // 박철수 정보 추가
            MedicalCheckup_spec.put("이름", "박철수");
            MedicalCheckup_spec.put("성별", "남");
            MedicalCheckup_spec.put("나이", "45");
            MedicalCheckup_spec.put("키 (cm), 체중 (kg)", "180, 85");
            MedicalCheckup_spec.put("혈압 (mmHg), 혈당 (mg/dL)", "130/85, 100");
            MedicalCheckup_spec.put("검진 결과", "정상");
            MedicalCheckup_spec.put("재검진 항목", "심장질환");
            MedicalCheckup_spec.put("유지 방안", "식습관 개선, 운동 계획");
            MedicalCheckup_list.add(MedicalCheckup_spec);

            MedicalCheckup_spec = new HashMap<>(); // 이지은 정보 추가
            MedicalCheckup_spec.put("이름", "이지은");
            MedicalCheckup_spec.put("성별", "여");
            MedicalCheckup_spec.put("나이", "35");
            MedicalCheckup_spec.put("키 (cm), 체중 (kg)", "165, 60");
            MedicalCheckup_spec.put("혈압 (mmHg), 혈당 (mg/dL)", "115/75, 95");
            MedicalCheckup_spec.put("검진 결과", "비정상");
            MedicalCheckup_spec.put("재검진 항목", "간암, 알츠하이머병");
            MedicalCheckup_spec.put("유지 방안", "");
            MedicalCheckup_list.add(MedicalCheckup_spec);

            MedicalCheckup_spec = new HashMap<>(); // 최민호 정보 추가
            MedicalCheckup_spec.put("이름", "최민호");
            MedicalCheckup_spec.put("성별", "남");
            MedicalCheckup_spec.put("나이", "28");
            MedicalCheckup_spec.put("키 (cm), 체중 (kg)", "170, 70");
            MedicalCheckup_spec.put("혈압 (mmHg), 혈당 (mg/dL)", "125/80, 92");
            MedicalCheckup_spec.put("검진 결과", "정상");
            MedicalCheckup_spec.put("재검진 항목", "간암");
            MedicalCheckup_spec.put("유지 방안", "");
            MedicalCheckup_list.add(MedicalCheckup_spec);

            for (HashMap<String, String> medical: MedicalCheckup_list){
                System.out.println(medical.get("이름") +medical.get("성별") +medical.get("나이") +medical.get("키") +medical.get("혈압") +medical.get("체중") +medical.get("혈당") +medical.get("유지방안"));
            }
            System.out.println();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}