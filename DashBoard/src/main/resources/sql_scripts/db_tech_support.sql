--crea la base de datos si no existe
CREATE DATABASE IF NOT EXISTS db_tech_support;

--usa la base de datos recientemente creada
USE db_tech_support;

-- CREATE TABLE IF NOT EXISTS tickets (
--     ticket_id INT AUTO_INCREMENT PRIMARY KEY,
--     user_id INT NOT NULL,
--     issue_description TEXT NOT NULL,
--     status ENUM('open', 'in_progress', 'closed') DEFAULT 'open',
--     created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
--     updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
-- );

CREATE TABLE IF NOT EXISTS Users 
(
    username VARCHAR(50) NOT NULL UNIQUE,
    email VARCHAR(100) NOT NULL UNIQUE,
    password VARCHAR(255) NOT NULL,
    creation_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
    PRIMARY KEY (username, email)
);

INSERT INTO Users VALUES ('admin', 'manuel.cruz.sanchez@estudiante.uacm.edu.mx', 'xml123456', CURRENT_TIMESTAMP);