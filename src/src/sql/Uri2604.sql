/*
create database uri2604

use uri2604

create table products(
	
	id int not null primary key identity(1,1),
	name varchar(50) not null, 
	amount int not null default 0,
	price numeric(10,2) not null default 0

)

insert products(name, amount, price) values ('Two-door wardrobe', 100, 80)
insert products(name, amount, price) values ('Dining table', 1000, 560)
insert products(name, amount, price) values ('Towel holder', 10000, 5.50)
insert products(name, amount, price) values ('Computer desk', 350, 100)
insert products(name, amount, price) values ('Chair', 3000, 210.64)
insert products(name, amount, price) values ('Single bed', 750, 99)

select * from products 
 
*/
SELECT id, name FROM products WHERE price < 10 OR price > 100;