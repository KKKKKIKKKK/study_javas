-- SELECT column_name(s)
-- FROM table_name 
-- WHERE condition
-- GROUP BY column_name(s)
-- HAVING condition
-- ORDER BY column_name(s);

SELECT RESPONDENTS_ID , count(*) CNT
FROM statistics
group by STATISTICS_ID