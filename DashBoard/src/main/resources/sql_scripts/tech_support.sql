-- crea la base de datos si no existe
CREATE DATABASE IF NOT EXISTS tech_support;

-- usa la base de datos recientemente creada
USE tech_support;

CREATE TABLE IF NOT EXISTS Users
(
    email VARCHAR(50) NOT NULL UNIQUE,
    employeeId INT NOT NULL UNIQUE AUTO_INCREMENT,  
    password VARCHAR(30) NOT NULL,
    rol VARCHAR(14) NOT NULL,
    PRIMARY KEY (email,employeeId)

) AUTO_INCREMENT = 15000000;

INSERT INTO Users(email, password, rol) VALUES('admin@estudiante.uacm.edu.mx', 'admin123456', 'administrator');
INSERT INTO Users(email, password, rol) VALUES('manager@uacm.edu.mx', 'manager123456', 'manager');
INSERT INTO Users(email, password, rol) VALUES('agent@uacm.edu.mx', 'agent123456', 'agent');

CREATE TABLE IF NOT EXISTS Account
(
    
);

CREATE TABLE IF NOT EXISTS Employee
(

);

CREATE TABLE IF NOT EXISTS Ip
(
    ip VARCHAR(15), 
    PRIMARY KEY(ip)  
);