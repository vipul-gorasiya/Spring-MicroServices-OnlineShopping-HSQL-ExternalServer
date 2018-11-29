CREATE TABLE ITEM(
    ID INTEGER GENERATED BY DEFAULT AS IDENTITY,
    NAME VARCHAR(255) NOT NULL UNIQUE,
    DESCRIPTION VARCHAR(255),
    PRICE DOUBLE NOT NULL
);

