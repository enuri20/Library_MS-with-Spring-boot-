CREATE TABLE book (
    bookid integer NOT NULL Primary Key,
    title character varying(255) NOT NULL,
    author character varying(255),
    isbn character varying(20) NOT NULL unique,
    subject character varying(20),
    language character varying(20)
);

CREATE TABLE customer (
    customerid integer NOT NULL primary key,
    firstname character varying(255),
    lastname character varying(255),
    telephone character varying(12),
    email character varying(255)
);





CREATE TABLE bookcopy (
    bookcopyid integer NOT NULL,
    bookid integer NOT NULL,
    status character varying(20),
    customerid integer,
	constraint fk_book
    FOREIGN key (bookid) REFERENCES book(bookid),
	constraint fk_customer
    FOREIGN key (customerid) REFERENCES customer(customerid)


);