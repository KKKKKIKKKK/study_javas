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

delete from statistics
where respondents_id = 'R1';

insert into statistics
(statistics_id, respondents_id, questions_id, choice_id)
values
('ST-01', 'R1', 'Q1', 'C3');

insert into statistics
(statistics_id, respondents_id, questions_id, choice_id)
values
('ST-02', 'R1', 'Q2', 'C1');

insert into statistics
(statistics_id, respondents_id, questions_id, choice_id)
values
('694ce8f7-3e02-4fbf-8627-aec2e5958451', 'R1', 'Q1', 'C2');

insert into statistics
(statistics_id, respondents_id, questions_id, choice_id)
values
('d90e2bc4-9b71-4a4e-88fa-64d244e5c7be', 'R1', 'Q2', 'C3');