create table if not exists DEVELOPERS(
  id int primary key auto_increment,
  developer_name varchar(100),
  age int(3),
  sex varchar(6)
);

create table if not exists SKILLS(
  id int primary key,
  skill varchar(100),
  grade varchar(100)
);

create table if not exists PROJECTS(
  id int primary key auto_increment,
  project_name varchar(100),
  description varchar(255)
);

create table if not exists COMPANIES(
  id int primary key auto_increment,
  company_name VARCHAR(100),
  adress VARCHAR(255)
);

create table if not exists  CUSTOMERS(
  id int primary key auto_increment,
  customer_name varchar(100),
  adress varchar(255)
);

create table if not exists DEVELOPERS_support_SKILLS(
  id int primary key auto_increment,
  developer_id int not null,
  skill_id int not null,

  foreign key (developer_id) references DEVELOPERS(id),
  foreign key (skill_id) references SKILLS(id)
);

create table if not exists COMPANIES_support_CUSTOMERS (
  id int primary key auto_increment,
  company_id int not null,
  customer_id int not null,

  foreign key (company_id) references COMPANIES(id),
  foreign key (customer_id) references CUSTOMERS(id)
);

create table if not exists COMPANIES_support_PROJECTS(
  id int primary key auto_increment,
  company_id int not null,
  project_id int not null,

  foreign key  (company_id) references COMPANIES(id),
  foreign key (project_id) references PROJECTS(id)
);

create table if not exists CUSTOMERS_support_PROJECTS(
  id int primary key auto_increment,
  customer_id int not null,
  project_id int not null,

  foreign key (customer_id) references CUSTOMERS(id),
  foreign key (project_id) references PROJECTS(id)
);

create table if not exists DEVELOPERS_support_PROJECTS(
  id int primary key auto_increment,
  developer_id int not null,
  project_id int not null,

  foreign key (developer_id) references DEVELOPERS(id),
  foreign key (project_id) references PROJECTS(id)
);

create table if not exists DEVELOPERS_support_COMPANIES (
  id int primary key auto_increment,
  developer_id int not null,
  company_id int not null,

  foreign key (developer_id) references DEVELOPERS(id),
  foreign key (company_id) references COMPANIES(id)
);