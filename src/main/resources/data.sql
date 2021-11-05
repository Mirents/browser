DROP TABLE IF EXISTS pc;
CREATE TABLE pc (
    model VARCHAR(30) NOT NULL
    code INT NOT NULL,
    speed SMALLINT DEFAULT NULL,
    core SMALLINT NOT NULL,
    hd REAL NOT NULL,
    ram SMALLINT NOT NULL,
    price INT DEFAULT NULL
);
INSERT INTO pc (model, code, speed, core, hd, ram, price) VALUES
    ('Intel Feller',  421, 700,  2, 1024, 4096, 145),
    ('Intel Falcon',  784, 900,  2, 256,  2048, 215),
    ('Intel Amost',   289, 820,  2, 512,  2048, 138),
    ('Intel Imoles',  274, 450,  3, 256,  512,  174),
    ('Intel Boosil',  384, 1100, 1, 512,  4096, 251),
    ('AMD Jeremy',    587, 950,  2, 256,  512,  185),
    ('AMD Ontares',   197, 710,  3, 1024, 2048, 204),
    ('AMD Ikimuzi',   274, 820,  3, 512,  4096, 187),
    ('AMD Ospel',     367, 650,  6, 256,  512,  129),
    ('AMD Ritak',     917, 590,  8, 256,  4096, 171),
    ('AMD Pooler',    381, 740,  5, 512,  8192, 213),
    ('Azure Garned',  784, 700,  3, 1024, 1024, 194),
    ('Azure Lampent', 382, 590,  3, 256,  512,  167),
    ('Azure Okama',   974, 1100, 1, 2048, 2048, 159),
    ('Azure Filler',  284, 820,  2, 256,  8192, 202),
    ('Azure Giant',   741, 650,  3, 512,  1024, 178);