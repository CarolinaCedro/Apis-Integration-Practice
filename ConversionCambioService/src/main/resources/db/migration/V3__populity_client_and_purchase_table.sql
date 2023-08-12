-- Populando a tabela Client
INSERT INTO Client (name, email, cpf, address, phone, dtBorn, limitCredit, dtCreated, status)
VALUES ('Cliente 1', 'cliente1@example.com', '12345678901', 'Endereço 1', '111-1111', '2000-01-01', 1000.00,
        '2023-08-10', 'ATIVO'),
       ('Cliente 2', 'cliente2@example.com', '98765432101', 'Endereço 2', '222-2222', '1995-05-15', 1500.00,
        '2023-08-10', 'ATIVO'),
       ('Cliente 3', 'cliente3@example.com', '98765432101', 'Endereço 3', '222-2222', '1995-05-15', 1500.00,
        '2023-08-10', 'INATIVO');
    ;

-- Populando a tabela PurchaseHistory
INSERT INTO PurchaseHistory (purchaseDate, amount, client_id)
VALUES ('2023-08-10', 500.00, 1),
       ('2023-08-09', 700.00, 1),
       ('2023-08-10', 300.00, 2);
