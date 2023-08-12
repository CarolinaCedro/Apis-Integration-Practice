CREATE TABLE product (
                         id BIGINT PRIMARY KEY AUTO_INCREMENT,
                         name_product VARCHAR(255) NOT NULL,
                         description VARCHAR(1000),
                         coins_available VARCHAR(50) NOT NULL,
                         prices_other_currency DECIMAL(19, 2),
                         category VARCHAR(50)
);
