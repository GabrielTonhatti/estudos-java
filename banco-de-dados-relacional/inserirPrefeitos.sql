USE wm;

SELECT * FROM cidades;

INSERT INTO prefeitos(nome, cidade_id)
VALUES ('Rodrigo Nevez', 2),
       ('Raquel Lyra', 3),
       ('Zenaldo Coutinho', NULL);

SELECT * FROM prefeitos;

INSERT INTO prefeitos(nome, cidade_id)
VALUES ('Rafael Greca', NULL);

INSERT INTO prefeitos(nome, cidade_id)
VALUES ('Rodrigo Pinheiro', 3);