USE wm;

SELECT *
FROM estados
WHERE id = 25;

INSERT INTO cidades (nome, area, estado_id)
VALUES ('Campinas', 795, 25);

INSERT INTO cidades (nome, area, estado_id)
VALUES ('Noterói', 133.9, 19);

INSERT INTO cidades(nome, area, estado_id)
VALUES ('Caruaru', 920.6,
        (SELECT id FROM estados WHERE sigla = 'PE'));

INSERT INTO cidades(nome, area, estado_id)
VALUES ('Juazeiro do Norte', 248.2,
        (SELECT id FROM estados WHERE sigla = 'CE'));

SELECT *
FROM cidades;
