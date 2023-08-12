
CREATE TABLE bank (
                       id BIGINT AUTO_INCREMENT PRIMARY KEY,
                       name VARCHAR(255) NOT NULL,
                       country_code VARCHAR(10) NOT NULL,
                       bic VARCHAR(50) NOT NULL,
                       address VARCHAR(255) NOT NULL
);

INSERT INTO bank (name, country_code, bic, address) VALUES
                                                         ('Bank A', 'US', 'BIC123', '123 Main St'),
                                                         ('Bank B', 'UK', 'BIC456', '456 High St'),
                                                         ('Bank C', 'DE', 'BIC789', '789 Market St'),
                                                         ('Bank D', 'FR', 'BIC101', '101 Rue de Paris'),
                                                         ('Bank E', 'JP', 'BIC202', '202 Tokyo St'),
                                                         ('Bank F', 'AU', 'BIC303', '303 Sydney St'),
                                                         ('Bank G', 'CA', 'BIC404', '404 Maple St'),
                                                         ('Bank H', 'BR', 'BIC505', '505 Rio St'),
                                                         ('Bank I', 'IT', 'BIC606', '606 Roma St'),
                                                         ('Bank J', 'ES', 'BIC707', '707 Madrid St');
