DROP TABLE IF EXISTS authorities;

CREATE TABLE authorities
(
    id        SMALLSERIAL,
    authority VARCHAR(128) NOT NULL,
    PRIMARY KEY (id)
);