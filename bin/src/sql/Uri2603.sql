/*
create database uri2603

use uri2603

create table customers(
	
	id int not null primary key identity(1,1),
	name varchar(50) not null,
	street varchar(50) not null, 
	city varchar(50) not null,
	state varchar(2) not null,
	credit_limit numeric(10,2) not null default 0
)

insert customers(name, street, city, state, credit_limit) values ('Pedro Augusto da Rocha', 'Rua Pedro Carlos Hoffman', 'Porto Alegre', 'RS', 700.00)
insert customers(name, street, city, state, credit_limit) values ('Antonio Carlos Mamel', 'Av. Pinheiros', 'Belo Horizonte', 'MG', 3500.50)
insert customers(name, street, city, state, credit_limit) values ('Luiza Augusta Mhor', 'Rua Salto Grande', 'Niteroi', 'RJ', 4000.00)
insert customers(name, street, city, state, credit_limit) values ('Jane Ester', 'Av. 7 de Setembro', 'Erechim', 'RS', 800.00)
insert customers(name, street, city, state, credit_limit) values ('Marcos Antônio dos Santos', 'Av. Farrapos', 'Porto Alegre', 'RS', 4250.25)

select * from customers
*/

SELECT name, street FROM customers WHERE city = 'Porto Alegre';