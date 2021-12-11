CREATE TABLE
    employee
(
    id BIGINT NOT NULL,
    name VARCHAR,
    email VARCHAR,
    phone VARCHAR,
    hire_date DATETIME,
    dfk BIGINT,
    PRIMARY KEY (id)
);
CREATE TABLE
    department
(
    id BIGINT NOT NULL,
    depname VARCHAR,
    PRIMARY KEY (id)
);

CREATE TABLE
    hibernate_sequence
(
    next_val BIGINT
);

INSERT INTO employee (id, name, email, phone, hire_date, dfk)
VALUES (1, 'marv dean', 'mdean@hotmial.com', '328-443-5555', 4419619200000, 1);

INSERT INTO department (id, depname)
VALUES (1, 'Development');
VALUES (2, 'HR');

INSERT INTO hibernate_sequence (next_val) VALUES (2);