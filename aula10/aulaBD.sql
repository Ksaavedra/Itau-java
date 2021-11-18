-- Linguagem SQL

-- criar um novo banco de dados (novo Schema)
create database bancoItau4;

-- apagar um Database
-- drop database bancoItau4;

-- marcar uma database como padrão (default)
use bancoItau4;

-- criar uma nova tabela
create table cliente (
	codigo integer not null auto_increment,
    nome varchar(120) not null,
    telefone varchar(20),
    constraint pk_cliente primary key (codigo)
);

-- para alterar um campo depois da tabela criada
-- alter table cliente change telefone fone varchar(20);

-- not null = não pode ser deixado em branco, tem que preencher (obrigatorio)
-- auto_increment = o Banco de Dados irá gerar o número sequencialmente
-- varchar(xx) = campo do tipo caracter, com tamanho máximo xx
-- constraint = restrição (regra) para esta tabela
-- primary key = chave primária = identifica de forma única um cliente

-- para apagar uma tabela (cuidado: incluindo todos os dados!!!!)
-- drop table cliente;

create table carro (
	codigo integer not null auto_increment,
    marca varchar(30) not null,
    modelo varchar(40) not null,
    ano_fabricacao integer,
    proprietario integer,
    constraint pk_carro primary key (codigo),
    constraint fk_carro foreign key (proprietario) references cliente(codigo)
);

-- foreign key = chave estrangeira = liga com a chave primária de outra tabela

-- inserir dados na tabela

insert into cliente values (null, "Carlos Santos", "(11) 99999-9999" );
insert into cliente values (null, "Augusto Silva", "(12) 88888-1111" );
insert into cliente values (null, "Davi Peres", "(11) 44444-3333" );


insert into carro values (null, "Chevrolet", "Astra", 1980, 1);
insert into carro values (null, "VW", "Gol", 2008, 1);
insert into carro values (null, "BMW", "X3", 2010, 2);

-- buscar informações no banco de dados

Select * 		-- quais colunas eu quero na resposta (* =  todas as colunas) 
From  cliente;  -- de qual tabela

select nome, telefone    -- mostra apenas estas 2 colunas, não mostra o código
from cliente;

select *
from cliente
where codigo = 2;  -- busque apenas as linhas (os clientes) onde o código seja 2

-- listar todos os carros
select * from carro;

-- listar os carros do cliente que tem código 1
select *
from carro
where proprietario = 1;

-- listar os dados do cliente com nome "Carlos"
select *
From cliente
-- where nome = "Carlos Santos";
where nome like '%Carlos%'; -- % significa quaisquer caracteres antes ou depois

-- Quais são os carros do Carlos listados em ordem decrescente de ano?
select marca, modelo, ano_fabricacao 
from cliente inner join carro on carro.proprietario = cliente.codigo
where nome like 'Carlos%'
order by ano_fabricacao desc;

-- Quantos carros o Carlos possui?
select count(*) as 'quantidade'
from cliente inner join carro on carro.proprietario = cliente.codigo
where nome like 'Carlos%';

-- (Só exemplo, não faz sentido aqui!!!) Vamos usar ano como se fosse valor
-- qual o valor total dos carros do carlos? 
select sum(ano_fabricacao) as 'total'
from cliente inner join carro on carro.proprietario = cliente.codigo
where nome like 'Carlos%';

-- quantos carros cada cliente possui ?
select nome, count(*) as 'quantidade'
from cliente inner join carro on carro.proprietario = cliente.codigo
group by cliente.codigo;

-- Atualizar dados na tabela

-- alterar o telefone do cliente código 1
update cliente
set telefone = "(14) 92222-2222"
where codigo = 1;

-- Apagar dados na tabela

delete from cliente  -- paga os dados da tabela cliente
where codigo = 3;    -- onde o código seja igual a 3
