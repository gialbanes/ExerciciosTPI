create database aula07_tp;
use aula07_tp;

create table produtos(
id int auto_increment primary key, 
codigo int, 
nomeProduto varchar(200),
descricao varchar(300)
);

select * from produtos;