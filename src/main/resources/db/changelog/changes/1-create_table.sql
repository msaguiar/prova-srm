create table risco (
  id bigint auto_increment not null,
  nome varchar(50) not null,
  taxa_juros decimal not null,
  primary key (id)
);

create table credito (
  id bigint auto_increment not null,
  nome_cliente varchar(50) not null,
  limite decimal not null,
  taxa_juros decimal not null,
  primary key (id)
);