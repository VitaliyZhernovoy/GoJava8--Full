insert into DEVELOPERS (developer_name, age, sex) VALUES
  ('Vitaliy',33,'male'),
  ('Olga',28,'female'),
  ('Lesja',25,'male'),
  ('Alexand',29,'male'),
  ('Masha',21,'female');

insert into SKILLS (id, skill, grade) VALUES
  (1,'Java','Junior Data Science Engineer'),
  (2,'Java','Middle Java Full Stack Engineer'),
  (3,'Java','Senior Java Developer');

insert into COMPANIES (company_name, adress) VALUES
  ('Luxoft','Kiev'),
  ('Ciklum','Odessa'),
  ('DMarket','Kiev');

insert into PROJECTS (project_name, description) VALUES
  ('StarDefender','MMO Game'),
  ('SMART Academy','some business logic'),
  ('Free Driver','Auto - Pilot system'),
  ('The Witcher','Game');

insert into CUSTOMERS (customer_name, adress) VALUES
  ('World owner','whole world');

insert into COMPANIES_support_CUSTOMERS (companie_id, customer_id) VALUES
  (1,1),
  (2,1),
  (3,1);

insert into COMPANIES_support_PROJECTS (company_id, project_id) VALUES
  (1,2),
  (2,2),
  (3,1),
  (4,3),
  (5,4);

insert into CUSTOMERS_support_PROJECTS (customer_id, project_id) VALUES
  (1,1),
  (1,2),
  (1,3),
  (1,4);

insert into DEVELOPERS_support_COMPANIES (developer_id, company_id) VALUES
  (1,1),
  (2,2),
  (3,3),
  (4,2),
  (5,3),
  (1,2),
  (2,3),
  (3,1),
  (4,1),
  (5,2);

insert into DEVELOPERS_support_PROJECTS (developer_id, project_id) VALUES
  (1,1),
  (2,1),
  (3,2),
  (4,3),
  (5,4);

insert into DEVELOPERS_support_SKILLS (developer_id, skill_id) VALUES
  (1,1),
  (2,1),
  (3,2),
  (4,2),
  (5,3);