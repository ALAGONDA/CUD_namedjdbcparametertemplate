# CUD_namedjdbcparametertemplate
3_ways_insert_update_softdelete  using namedparameter jdbc template

Query for table in database

create table employee_info_ref(
	emp_id serial primary key,
	first_nm varchar(45) not null,
	middle_nm varchar(45) not null,
	last_nm varchar(45) not null,
	address varchar(45) not null,
	pincode int not null,
	gender varchar(25) not null,
	branch varchar(45) not null,
	phone_no bigint not null,
	email_id varchar(55) not null,
	emp_salary NUMERIC not null,
	company_nm varchar(45) not null,
	emp_designation varchar(45) not null,
	isactive boolean default true,
	version_id int default 1,
	created_dttm Timestamp default now(),
	modified_dttm Timestamp
);
