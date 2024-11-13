create database javaCrud;
use javaCrud;

create table usuario(
id int auto_increment primary key, 
codigo int(4) not null,
nome varchar(80),
telefone varchar(14),
login varchar(60),
senha varchar(50)
);

create table pacientes(
id int auto_increment primary key,
codigo int(4) not null,
nome varchar(80),
login varchar(60),
senha varchar(50),
endereco varchar(200),
complemento varchar(50),
rg varchar(14),
cpf varchar(14),
dt_nascimento varchar(10)
);