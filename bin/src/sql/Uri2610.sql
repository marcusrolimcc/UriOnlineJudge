/*
create database uri2610

use uri2610

create table products(
	
	id int not null primary key identity(1,1),
	name varchar(50) not null,
	amount int not null default 0,
	price numeric(10,2) not null default 0
)

insert products(name, amount, price) values ('Two-doors', 100, 800)
insert products(name, amount, price) values ('Dining table', 1000, 560)
insert products(name, amount, price) values ('Towel holder', 10000, 25.50)
insert products(name, amount, price) values ('Computer desk', 350, 320.50)
insert products(name, amount, price) values ('Chair', 3000, 210.64)
insert products(name, amount, price) values ('Single bed', 750, 460)

select * from products

*/
select round(avg(price), 2) as price from products