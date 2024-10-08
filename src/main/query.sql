CREATE TABLE BOOK (
                      ID BIGINT NOT NULL,
                      TITLE VARCHAR(255),
                      PRICE FLOAT,
                      DESCRIPTION VARCHAR(255),
                      ISBN VARCHAR(255),
                      NBOFPAGE INTEGER,
                      ILLUSTRATIONS SMALLINT DEFAULT 0,
                      PRIMARY KEY (ID)
);

INSERT INTO BOOK(ID, TITLE, DESCRIPTION, ILLUSTRATIONS, ISBN, NBOFPAGE, PRICE) values (1000, 'Beginning Java EE 6', 'Best Java EE book ever', true, '1234-5678', 450, 49);
INSERT INTO BOOK(ID, TITLE, DESCRIPTION, ILLUSTRATIONS, ISBN, NBOFPAGE, PRICE) values (1001, 'Beginning Java EE 7', 'No, this is the best ', true, '5678-9012', 550, 53);
INSERT INTO BOOK(ID, TITLE, DESCRIPTION, ILLUSTRATIONS, ISBN, NBOFPAGE, PRICE) values (1010, 'The Lord of the Rings', 'One ring to rule them all', false, '9012-3456', 222, 23);
-- use database;

