CREATE DATABASE IF NOT EXISTS associations;

USE associations;

CREATE TABLE IF NOT EXISTS association (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL,
    phone_number VARCHAR(20),
    city VARCHAR(100),
    zip_code VARCHAR(20)
);
