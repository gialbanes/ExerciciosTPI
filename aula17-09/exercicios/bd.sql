create database aula05_tp;
use aula05_tp;

create table user(
idUser int auto_increment primary key,
nome varchar(255),
email varchar(255),
login varchar(255),
senha varchar(255)
);

select * from user;

create table consultaProduto(
idProduto int auto_increment primary key,
codigo int, 
nomeProduto varchar(255),
descricao varchar(500)
);

select * from consultaProduto;

create table consultaVendas(
id int auto_increment primary key, 
codigo int,
nomeVendedor varchar(255),
nomeProduto varchar(255)
);

select * from consultaVendas;