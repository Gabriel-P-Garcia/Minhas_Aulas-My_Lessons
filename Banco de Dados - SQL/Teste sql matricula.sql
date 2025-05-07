create database teste;

-- Geração de Modelo físico
-- Sql ANSI 2003 - brModelo.



CREATE TABLE aluno (
IDaluno BIGINT(16) PRIMARY KEY,
Nome VARCHAR(100)
);

CREATE TABLE disciplina (
IDdisciplina BIGINT(16) PRIMARY KEY,
nome_disciplina VARCHAR(50)
);

CREATE TABLE matricula (
ID_matrícula BIGINT(16) PRIMARY KEY,
ID_aluno BIGINT(16),
ID_disciplina BIGINT(16),
FOREIGN KEY(ID_aluno) REFERENCES Aluno (IDaluno),
FOREIGN KEY(ID_disciplina) REFERENCES disciplina (IDdisciplina)
);

