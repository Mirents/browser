DROP TABLE IF EXISTS pc;
CREATE TABLE pc (
    code INT NOT NULL,
    speed VARCHAR(10) DEFAULT NULL
);
INSERT INTO pc (code speed) VALUES
    (10, 'WD'),
    (55, 'Fafa'),
    (123, 'Opa');