/*
create database Uri2605;

use Uri2605;

create table providers(

	id int not null primary key identity(1,1),
	name varchar(50) not null,
	street varchar(50) not null,
	city varchar(50) not null, 
	state varchar(50) not null
	
)

create table categories(

	id int not null primary key identity(1,1),
	name varchar(50) not null

)

create table products(
	
	id int not null primary key identity(1,1),
	name varchar(50) not null, 
	amount int not null default 0,
	price numeric(10,2) not null default 0,
	id_providers int not null references providers(id),
	id_categories int not null references categories(id)

)

insert into providers(name, street, city, state) values('Henrique', 'Av Brasil', 'Rio de Janeiro', 'RJ')
insert into providers(name, street, city, state) values('Marcelo Augusto', 'Rua Imigrantes', 'Belo Horizonte', 'MG')
insert into providers(name, street, city, state) values('Caroline Silva', 'Av São Paulo', 'Salvador', 'BA')
insert into providers(name, street, city, state) values('Guilherme Staff', 'Rua Central', 'Porto Alegre', 'RS')
insert into providers(name, street, city, state) values('Isabela Moraes', 'Av Juiz Grande', 'Curitiba', 'PR')
insert into providers(name, street, city, state) values('Francisco Accer', 'Av Paulista', 'São Paulo', 'SP')

insert into categories(name) values('old stock')
insert into categories(name) values('new stock')
insert into categories(name) values('modern')
insert into categories(name) values('commercial')
insert into categories(name) values('recyclable')
insert into categories(name) values('executive')
insert into categories(name) values('superior')
insert into categories(name) values('wood')
insert into categories(name) values('super luxury')
insert into categories(name) values('vintage')

insert into products(name, amount, price, id_providers, id_categories) values ('Two-door wardrobe', 100, 800, 6, 8)
insert into products(name, amount, price, id_providers, id_categories) values ('Dining table', 1000, 560, 1, 9)
insert into products(name, amount, price, id_providers, id_categories) values ('Towel holder', 10000, 25.50, 5, 1)
insert into products(name, amount, price, id_providers, id_categories) values ('Computer desk', 350, 320.50, 4, 6)
insert into products(name, amount, price, id_providers, id_categories) values ('Chair', 3000, 210.64, 3, 6)
insert into products(name, amount, price, id_providers, id_categories) values ('Single bed', 750, 460, 1, 2)

select * from providers
select * from categories
select * from products
*/

select p.name, pv.name
from products as p
join providers as pv on p.id_providers = pv.id
where id_categories = 6