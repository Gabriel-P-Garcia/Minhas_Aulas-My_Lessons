CREATE DATABASE editora;

CREATE TABLE autor(
	id_autor INTEGER PRIMARY KEY AUTO_INCREMENT,
    nome_autor VARCHAR (25),
    titulo_livro VARCHAR (50),
    ano_publicação INTEGER (4)
);

INSERT INTO autor VALUES (null, "Marcelino Escritô", "Historias de Marcelino", 2004);
INSERT INTO autor VALUES (null, "Josias Tribiano IV", "Crônicas de um Sapato", 1866);
INSERT INTO autor VALUES (null, "Josias Tribiano IV", "Manual de Vampirismo", 2023);

SELECT * FROM autor;
SELECT * FROM autor WHERE titulo_livro = "Manual de Vampirismo";