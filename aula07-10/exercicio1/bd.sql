create database aula07_tp;
use aula07_tp;

create table produtos(
id int auto_increment primary key, 
codigo int, 
nomeProduto varchar(200),
descricao varchar(300)
);

select * from produtos;

create table usuarios(
id int auto_increment primary key, 
nome varchar(255),
login varchar(255),
senha varchar(255),
email varchar(255)
);