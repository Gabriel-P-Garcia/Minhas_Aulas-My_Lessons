CREATE DATABASE loja;

CREATE TABLE tabela_nao_normalizada(
	nome_cliente VARCHAR(100),
    telefone_cliente VARCHAR(15),
    telefone2_cliente VARCHAR(15),
    pedido_produto VARCHAR(50),
    pedido_quantidade INTEGER,
    pedido_valor_produto REAL(10,2) -- lembra de não botar a vígula no ultimo atributo
);

CREATE TABLE CLIENTE(
	id_cliente INTEGER PRIMARY KEY AUTO_INCREMENT,
    nome_cliente VARCHAR(100),
	telefone_cliente VARCHAR(15),
	pedido_produto VARCHAR (50),
	pedido_quantidade INTEGER,
	pedido_valor_produto REAL (10,2)
);

INSERT INTO cliente VALUES(null, "Dudu Fufu", "(61)98123-9876", "celular", 10, 989.98);

SELECT * FROM cliente;

INSERT INTO CLIENTE VALUES(null, "Maurício Frias", "(61)992334395", "tablet", 36, 289732.76);
    
INSERT INTO CLIENTE VALUES(null, "Fulano de Tal", "(61)993445496", "xbox", 97, 846257.37);

INSERT INTO cliente VALUES(null,"Guilherme Campbell", "(61)98888-7777", "celular", 10, 999.99);

INSERT INTO CLIENTE VALUES(null, "Luis Romera", "(61)93344-4443", "livro", 8, 432.65);

INSERT INTO cliente VALUES(null, "Tudes Pereira", "(61)4402-8922", "computador", 5, 997.50);

INSERT INTO cliente VALUES(null, "Caio Oham","(61) 90900_8080","celular", 5, 800.98);

INSERT INTO cliente VALUES(null, "Guilherme Tierno", "(61)99808-1040", "PC", 10, 999.99);

INSERT INTO cliente VALUES(null, "Rodrigo", "(61)99999-8888", "celular", 10, 975.80);

INSERT INTO cliente VALUES(null, "Filipe Moura", "(61)98888-4848", "celular", 10, 889.99);

INSERT INTO cliente VALUE(null, "Lucas Davi", "(61)99506-9307", "iphone", 10, 999.99);

INSERT INTO cliente VALUES(null,"Daniele Pinheiro", "(61)998989898 ", "celular", 11, 999.99);

INSERT INTO cliente VALUES(null, "Inacio Barros" , "(61) 984995360" , "celular" , 10, 99.99) ;

INSERT INTO cliente VALUES(null, "Vitor", "(61)99365-3310", "celular", 21, 999.99);

INSERT INTO cliente (nome_cliente, telefone_cliente) VALUE ("Marcelinho", "(61)93321-8181");

SELECT * FROM cliente WHERE id_cliente = 2;
SELECT nome_cliente FROM cliente WHERE id_cliente = 1;

SELECT COUNT(*) FROM cliente;

