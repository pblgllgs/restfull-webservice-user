
DROP TABLE IF EXISTS users;

CREATE TABLE users (
                       id bigint not null auto_increment,
                       email varchar(255) not null,
                       first_name varchar(255) not null,
                       last_name varchar(255) not null,
                       primary key (id)
);

ALTER TABLE users
    ADD CONSTRAINT email_UK UNIQUE (email);

INSERT INTO users ( id, first_name, last_name, email)
VALUES
(1, 'alfa', 'alfa','alfa@gmail.com'),
(2, 'beta', 'beta','beta@gmail.com'),
(3, 'alfa', 'alfa','gama@gmail.com'),
(4, 'delta', 'delta','delta@gmail.com'),
(5, 'epsilon', 'epsilon','epsilon@gmail.com'),
(6, 'dseta', 'dseta','dseta@gmail.com'),
(7, 'eta', 'eta','eta@gmail.com'),
(8, 'theta', 'theta','theta@gmail.com'),
(9, 'iota', 'iota','iota@gmail.com'),
(10, 'kappa', 'kappa','kappa@gmail.com');

