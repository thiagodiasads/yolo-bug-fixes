/*Este comando seta o BD que será utilizado para os creates e inserts abaixo!*/
use jservice_bd;
/*Depois de "setar" o BD, executar os scripts de creates e inserts!*/
create table clientes (
codigo_cliente integer not null primary key auto_increment,
nome_cliente varchar (35) not null,
email_cliente varchar (30),
cpf_cliente varchar (11) not null);
/*Cliente inicial para testes*/
insert into clientes (codigo_cliente, nome_cliente, email_cliente, cpf_cliente) values 
(1 , 'Marco Mangan', 'marco.mangan@gmail.com', '11122233344');

create table equipamentos (
codigo_equipamento integer not null primary key auto_increment,
marca_equipamento varchar (20) not null,
modelo_equipamento varchar (20),
serial_equipamento varchar (11) unique not null);
/*Equipamento inicial para testes!*/
insert into equipamentos (codigo_equipamento, marca_equipamento, modelo_equipamento, serial_equipamento) values 
(1 , 'HP', 'G42', 'ABC123DEF');

create table ordensdeservico (
id_os integer not null auto_increment,
codigo_cliente_os integer not null,
codigo_equipamento_os integer not null,
problema_os varchar (70),
CONSTRAINT ordensdeservico_pkey PRIMARY KEY (id_os),
  CONSTRAINT ordensdeservico_codigo_cliente_os_fkey FOREIGN KEY (codigo_cliente_os)
      REFERENCES clientes (codigo_cliente) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT ordensdeservico_codigo_equipamento_os_fkey FOREIGN KEY (codigo_equipamento_os)
      REFERENCES equipamentos (codigo_equipamento) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
);
/*Ordem de serviço inicial para testes!*/
insert into ordensdeservico (codigo_cliente_os, codigo_equipamento_os, problema_os) values 
( 1 , 1, 'Não liga');
/*Comando que verifica as propriedades da tabela, como o próximo valor do auto increment!*/
SHOW TABLE STATUS LIKE 'ordensdeservico'

/*Novo usuário*/
revoke all on jservice_bd.* from 'jservice'@'%';
drop user 'jservice'@'%';
GRANT delete,update,select,insert on jservice_bd.* to 'jservice'@'%' identified by 'jservice';
flush privileges;
