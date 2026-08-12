# Write your MySQL query statement below
select unique_id,name
from Employees e
left join EmployeeUNI em ON e.id=em.id;
