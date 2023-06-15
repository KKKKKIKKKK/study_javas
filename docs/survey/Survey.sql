-- select column_name(s)
-- from table_name
-- where condition
-- group by column_name(s)
-- having condition
-- order by column_name(s);

-- 설문자 가능 명단(가입 완료)
-- 1. 홍길동, 2.장길산, 3.신사임당, ...
select *
from respondents;

-- 설문 시작
-------- 참조 : poll contents example -------------
-- 1. 교수는 수업 전 강의 목표를 명확히 제시하였습니까?
-- 2. 강의의 내용은 체계적이고 성의있게 구성되었는가?
-- 문항
select *
from questions;

-- 답항
-- 1. 교수는 수업 전 강의 목표를 명확히 제시하였습니까?
-- (1)전혀 아니다. (2)아니다. (3)그렇다. (4)매우그렇다.

select *
from question_choice;