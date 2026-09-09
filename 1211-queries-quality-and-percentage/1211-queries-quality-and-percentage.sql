# Write your MySQL query statement below
select distinct query_name,
round(avg(rating/position),2) as quality,
round(sum(CASE WHEN rating<3 then 1 ELSE 0 END)*100.0/count(*),2) as poor_query_percentage
from Queries
where query_name IS NOT NULL
GROUP BY query_name 