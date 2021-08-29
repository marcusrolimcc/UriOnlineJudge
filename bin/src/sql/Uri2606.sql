/*
create database uri2606

use uri2606

create table categories(
	
	id int not null primary key identity(1,1),
	name varchar(50) not null

)

create table products(
	
	id int not null primary key identity(1,1),
	name varchar(50) not null, 
	amount int not null default 0,
	price numeric(10,2) not null default 0,
	id_categories int not null references categories(id)	
)

insert categories(name) values ('old stock')
insert categories(name) values ('new stock')
insert categories(name) values ('modern')
insert categories(name) values ('commercial')
insert categories(name) values ('recyclable')
insert categories(name) values ('executive')
insert categories(name) values ('superior')
insert categories(name) values ('wood')
insert categories(name) values ('super luxury')
insert categories(name) values ('vintage')

insert products(name, amount, price, id_categories) values ('Lamp', 100, 800, 4)
insert products(name, amount, price, id_categories) values ('Table for painting', 1000, 560, 9)
insert products(name, amount, price, id_categories) values ('Notebook desk', 10000, 25.50, 9)
insert products(name, amount, price, id_categories) values ('Computer desk', 350, 320.50, 6)
insert products(name, amount, price, id_categories) values ('Chair', 3000, 210.64, 9)
insert products(name, amount, price, id_categories) values ('Home alarm', 750, 460, 4)

select * from categories
select * from products
*/

select p.id, p.name
from products as p
	join categories as c on p.id_categories = c.id
where c."name" like 'super%'