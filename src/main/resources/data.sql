DROP TABLE IF EXISTS pc;
CREATE TABLE pc (
    code INT NOT NULL,
    manufacturer VARCHAR(30) NOT NULL,
    model VARCHAR(30) NOT NULL,
    price REAL DEFAULT NULL
);
INSERT INTO pc (code, manufacturer, model, price) VALUES
    (421, 'Intel', 'Feller',  145),
    (784, 'Intel', 'Falcon',  215),
    (289, 'Intel', 'Amost',   138),
    (274, 'Intel', 'Imoles',  174),
    (384, 'Intel', 'Boosil',  251),
    (587, 'AMD',   'Jeremy',  185),
    (197, 'AMD',   'Ontares', 204),
    (272, 'AMD',   'Ikimuzi', 187),
    (367, 'AMD',   'Ospel',   129),
    (917, 'AMD',   'Ritak',   171),
    (381, 'AMD',   'Pooler',  213),
    (784, 'Azure', 'Garned',  194),
    (382, 'Azure', 'Lampent', 167),
    (974, 'Azure', 'Okama',   159),
    (154, 'Azure', 'Filler',  202),
    (741, 'Azure', 'Giant',   178);

DROP TABLE IF EXISTS pc_param;
CREATE TABLE pc_param (
    code INT NOT NULL,
    speed SMALLINT DEFAULT NULL,
    core SMALLINT NOT NULL,
    hd SMALLINT NOT NULL,
    ram SMALLINT NOT NULL
);
INSERT INTO pc_param (code, speed, core, hd, ram) VALUES
    (421, 700,  2, 1024, 4096),
    (784, 900,  2, 256,  2048),
    (289, 820,  2, 512,  2048),
    (274, 450,  3, 256,  512),
    (384, 1100, 1, 512,  4096),
    (587, 950,  2, 256,  512),
    (197, 710,  3, 1024, 2048),
    (272, 820,  3, 512,  4096),
    (367, 650,  6, 256,  512),
    (917, 590,  8, 256,  4096),
    (381, 740,  5, 512,  8192),
    (784, 700,  3, 1024, 1024),
    (382, 590,  3, 256,  512),
    (974, 1100, 1, 2048, 2048),
    (284, 820,  2, 256,  8192),
    (741, 650,  3, 512,  1024);