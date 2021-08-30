/*
create database uri2607

use uri2607

create table providers(

	id int not null primary key identity(1,1),
	name varchar(50) not null, 
	street varchar(50) not null, 
	city varchar(50) not null, 
	state varchar(2) not null
)

insert providers(name, street, city, state) values('Henrique','Av. Brasil','Rio de Janeiro','RJ')
insert providers(name, street, city, state) values('Marcelo Augusto','Rua Imigrantes','Belo Horizonte','MG')
insert providers(name, street, city, state) values('Caroline Silva','Av. São Paulo','Salvador','BA')
insert providers(name, street, city, state) values('Guilherme Staff','Rua Central','Porto Alegre','RS')
insert providers(name, street, city, state) values('Isabela Moraes','Av. Juiz Grande','Curitiba','PR')
insert providers(name, street, city, state) values('Francisco Accer','Av. Paulista','São Paulo','SP')

select * from providers
*/

select distinct city from providers order by city asc