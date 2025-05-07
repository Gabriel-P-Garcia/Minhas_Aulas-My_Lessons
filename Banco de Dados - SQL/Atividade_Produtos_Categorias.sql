CREATE DATABASE produtos;

CREATE TABLE produto_categoria(
	id_produto INTEGER PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR (20),
    preco REAL (10,2),
    categoria VARCHAR (30),
    descricao_categoria VARCHAR (400)
);

INSERT INTO produto_categoria VALUES (null, "Bomba de Banho", 19.99, "Casa e Banho", "Produtos para decorar a casa e aromatizar banheiros");
INSERT INTO produto_categoria VALUES (null, "Enxoval Marcacara", 305.99, "Casa e Banho",  "Produtos para decorar a casa e aromatizar banheiros");
INSERT INTO produto_categoria VALUES (null, "Boomba de Banho", 400.55, "Explosivos", "Produtos que explodem ao entrar em contato com fogo");

SELECT * FROM produto_categoria;
SELECT * FROM produto_categoria WHERE categoria = "Casa e Banho";
SELECT COUNT(*) FROM produto_categoria;

