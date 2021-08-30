create database uri2609

use uri2609

create table categories(
	
	id int not null primary key identity(1,1),
	name varchar(50) not null
)
/*
create table products(
	
	id int not null primary key identity(1,1),
	name varchar(50) not null,
	amount int not null default 0,
	price numeric(10,2) not null default 0,
	id_categories int not null references categories(id)
)

insert categories(name) values ('wood')
insert categories(name) values ('luxury')
insert categories(name) values ('vintage')
insert categories(name) values ('modern')
insert categories(name) values ('super luxury')

insert products(name, amount, price, id_categories) values ('Two-doors wardrobe', 100, 800, 1)
insert products(name, amount, price, id_categories) values ('Dining table', 1000, 560, 3)
insert products(name, amount, price, id_categories) values ('Towel holder', 10000, 25.50, 4)
insert products(name, amount, price, id_categories) values ('Computer desk', 350, 320.50, 2)
insert products(name, amount, price, id_categories) values ('Chair', 3000, 210.64, 4)
insert products(name, amount, price, id_categories) values ('Single bed', 750, 460, 1)

select * from categories
select * from products

*/

select c.name, sum(p.amount) sum from products as p join categories as c on id_categories = c.id group by (c.name),(p.id_categories) order by c.name, sum