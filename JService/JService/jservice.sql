use jservice_bd;

create table clientes (
codigo_cliente integer not null primary key auto_increment,
nome_cliente varchar (35) not null,
email_cliente varchar (30),
cpf_cliente varchar (11) not null);

insert into clientes (codigo_cliente, nome_cliente, email_cliente, cpf_cliente) values 
(1 , 'Marco Mangan', 'marco.mangan@gmail.com', '11122233344');

create table equipamentos (
codigo_equipamento integer not null primary key auto_increment,
marca_equipamento varchar (20) not null,
modelo_equipamento varchar (20),
serial_equipamento varchar (11) unique not null);

insert into equipamentos (codigo_equipamento, marca_equipamento, modelo_equipamento, serial_equipamento) values 
(1 , 'HP', 'G42', 'ABC123DEF');

create table ordensdeservico (
id_os integer not null,
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
