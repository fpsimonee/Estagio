
/***************************************************************************
A ideia é basicamente a seguinte:
Teremos uma plataforma de negociação de mercadorias. Que obrigatoriamente deverá ter os seguintes
campos: Código da Mercadoria, Tipo da Mercadoria, Nome da Mercadoria, Quantidade, Preço, Tipo do Negócio
(Compra ou Venda).

Inicio do Script de Criacao das Tabelas 

Tabela referente 
***************************************************************************/
create table mercadoria (
    id_mercadoria int,
    tipo_mercadoria varchar(50),
    nome_mercadoria varchar(50),
    qtd int,
    preco double, 
    tipo_negocio varchar(6)
)  ENGINE=innodb;


create table operacao(
   id_operacao int, 
   tipo_operacao varchar(6),
   id_mercadoria int
) ENGINE=innodb; 

/***************************************************************************
Alter Table para adicionar as constraints
***************************************************************************/
-- Table Mercadoria
ALTER TABLE mercadoria ADD CONSTRAINT Pk_mercadoria 
PRIMARY KEY (id_mercadoria);

-- Table Operacao
ALTER TABLE operacao ADD CONSTRAINT Pk_operacao 
PRIMARY KEY (id_operacao);
ALTER TABLE operacao ADD CONSTRAINT Fk_operacao 
FOREIGN KEY (id_mercadoria) REFERENCES mercadoria (id_mercadoria);


/***************************************************************************
Fim das Constraints

Fim do Script 
***************************************************************************/