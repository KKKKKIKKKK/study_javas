-- select column_name(s)
-- from table_name
-- where condition
-- group by column_name(s)
-- having condition
-- order by column_name(s);

-- poll Statistic example
-- 총 설문자: 3명
select count(*) CNT
from (
select respondents_id, count(*) as CNT
from statistics
group by respondents_id) as T_static;


-- 기본 시작
select respondents_id, count(*) as CNT
from statistics
group by respondents_id;