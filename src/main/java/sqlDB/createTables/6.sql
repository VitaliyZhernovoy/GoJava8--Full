select * ,min(cost)
from (select * ,avg(cost)
      from PRODJECTS) as anotheralias;



