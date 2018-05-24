select SKILLS, sum(SALARY)
from developers
group by SKILLS
