USE wm;

INSERT INTO estados(id, nome,sigla, regiao, populacao)
VALUES (1000, 'Novo', 'NV', 'SUL', 2.54);

INSERT INTO estados(nome,sigla, regiao, populacao)
VALUES ('Mais Novo', 'MN', 'Norte', 2.51);

SELECT * FROM estados;
