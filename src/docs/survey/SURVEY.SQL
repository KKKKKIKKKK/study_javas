-- - 설문자 가능 명단(가입 완료)
-- 1. 홍길동, 2.장길산, 3.신사임당, ..

-- SELECT column_name(s)
-- FROM table_name 
-- WHERE condition
-- GROUP BY column_name(s)
-- HAVING condition
-- ORDER BY column_name(s);

-- - 설문자 가능 명단(가입 완료) EX)respondents  응답자 
-- 1. 홍길동, 2.장길산, 3.신사임당, ..

SELECT *
FROM respondents 
;
-- 설문 시작	
-- -------- 참조 : poll contents example -------------
-- <1> 문항 뭉텅이 부터 배열 
-- <2> 답항 뭉텅이는 다음 배열 해서 종속적으로 나오도록 해야함. 

-- 1. 교수는 수업 전 강의 목표를 명확히 제시하였습니까? //문항 
-- (1)전혀 아니다. (2)아니다. (3)그렇다. (4)매우그렇다. //답항 


SELECT *
FROM questions 
; 

SELECT *
FROM choice
; 



