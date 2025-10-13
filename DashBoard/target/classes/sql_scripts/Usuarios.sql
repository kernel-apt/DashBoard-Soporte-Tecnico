USE db_tech_support;

DROP TABLE IF EXISTS usuarios;

CREATE TABLE usuarios (
    nombre_usuario VARCHAR(50) PRIMARY KEY,
    contrasena VARCHAR(100) NOT NULL
);