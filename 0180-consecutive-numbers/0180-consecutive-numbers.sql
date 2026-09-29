select distinct a.num as ConsecutiveNums
from logs a
inner join logs b
on a.id + 1 = b.id and a.num = b.num
inner join logs c
on a.id + 2 = c.id and a.num = c.num;