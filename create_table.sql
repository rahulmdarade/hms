use hms;

create table Hospital(name varchar(30) not null,address sql_variant,website varchar(25),contactNumber bigint)

create table Doctor(id int primary key identity,name varchar(30) not null,designation varchar(30),degree varchar(20),experience int,
					address sql_variant,emailId sql_variant,contactNumber bigint);

create table Patient(id int primary key identity,name varchar(30) not null,address sql_variant,gender varchar(7),
					disease sql_variant,emailId sql_variant,contactNumber bigint, doctorid int,
					foreign key (doctorid) references Doctor(id));

create table Invoice(id int primary key identity,patientid int,doctorid int,particulars varchar(30),
					quantity int,unitvalue int,totalamount int,
					foreign key (patientid) references Patient(id),
					foreign key (doctorid) references Doctor(id))

select * from Hospital
select * from Doctor
select * from Patient
select * from Invoice
/*select * from Patient
drop table Patient*/