-- Criação da tabela Client
CREATE TABLE Client
(
    id          BIGINT PRIMARY KEY AUTO_INCREMENT,
    name        VARCHAR(255)   NOT NULL,
    email       VARCHAR(255)   NOT NULL,
    cpf         VARCHAR(20)    NOT NULL,
    address     VARCHAR(255)   NOT NULL,
    phone       VARCHAR(20)    NOT NULL,
    dtborn      DATE           NOT NULL,
    limitcredit DECIMAL(10, 2) NOT NULL,
    dtcreated   DATE           NOT NULL,
    status      VARCHAR(20)    NOT NULL
);

-- Criação da tabela PurchaseHistory
CREATE TABLE PurchaseHistory
(
    id           BIGINT PRIMARY KEY AUTO_INCREMENT,
    purchasedate DATE           NOT NULL,
    amount       DECIMAL(10, 2) NOT NULL,
    client_id    BIGINT         NOT NULL,
    FOREIGN KEY (client_id) REFERENCES Client (id)
);
