# Write your MySQL query statement below
select *,
case when
x+y>z AND x+z>y AND y+z>x
then "Yes"
ELSE "No"
END as triangle
from Triangle;