



INSERT INTO book (bookid, title, author, isbn, subject, language)
VALUES
(1, 'The Catcher in the Rye', 'J.D. Salinger', '978-0316769488', 'FICTION', 'ENGLISH'),
(2, 'The Great Gatsby', 'F. Scott Fitzgerald', '978-0743273565', 'FICTION', 'ENGLISH'),
(3, '1984', 'George Orwell', '978-0451524935', 'FICTION', 'ENGLISH'),
(4, 'The Art of War', 'Sun Tzu', '978-1590302255', 'PHILOSOPHY', 'GERMAN'),
(5, 'Sapiens: A Brief History of Humankind', 'Yuval Noah Harari', '978-0062316097', 'HISTORY', 'FRENCH'),
(6, 'Think and Grow Rich', 'Napoleon Hill', '978-1937879504', 'SELF_HELP', 'ENGLISH'),
(7, 'The Diary of a Young Girl', 'Anne Frank', '978-0553296983', 'BIOGRAPHY', 'ENGLISH'),
(8, 'The Alchemist', 'Paulo Coelho', '978-0061122415', 'FICTION', 'SPANISH'),
(9, 'The Hitchhikers Guide to the Galaxy', 'Douglas Adams', '978-0345391803', 'FICTION', 'ENGLISH'),
(10, 'The Philosophy Book', 'DK', '978-1465430573', 'PHILOSOPHY', 'ENGLISH');



INSERT INTO customer (customerid, firstname, lastname, telephone, email)
VALUES
(1, 'John', 'Doe', '123-456-7890', 'john.doe@example.com'),
(2, 'Jane', 'Smith', '234-567-8901', 'jane.smith@example.com'),
(3, 'James', 'Johnson', '345-678-9012', 'james.johnson@example.com'),
(4, 'Emily', 'Williams', '456-789-0123', 'emily.williams@example.com'),
(5, 'Michael', 'Brown', '567-890-1234', 'michael.brown@example.com'),
(6, 'Sarah', 'Jones', '678-901-2345', 'sarah.jones@example.com'),
(7, 'David', 'Garcia', '789-012-3456', 'david.garcia@example.com'),
(8, 'Jessica', 'Martinez', '890-123-4567', 'jessica.martinez@example.com'),
(9, 'Daniel', 'Rodriguez', '901-234-5678', 'daniel.rodriguez@example.com'),
(10, 'Sophia', 'Lopez', '012-345-6789', 'sophia.lopez@example.com');

-- Book 1 Copies
INSERT INTO bookCopy (bookcopyid, bookid, status, customerid)
VALUES
(1, 1, 'AVAILABLE', NULL),
(2, 1, 'AVAILABLE', NULL),
(3, 1, 'BORROWED', 1);

-- Book 2 Copies
INSERT INTO bookCopy (bookcopyid, bookid, status, customerid)
VALUES
(4, 2, 'AVAILABLE', NULL),
(5, 2, 'BORROWED', 2),
(6, 2, 'AVAILABLE', NULL);

-- Book 3 Copies
INSERT INTO bookCopy (bookcopyid, bookid, status, customerid)
VALUES
(7, 3, 'AVAILABLE', NULL),
(8, 3, 'AVAILABLE', NULL),
(9, 3, 'BORROWED', 3);

-- Book 4 Copies
INSERT INTO bookCopy (bookcopyid, bookid, status, customerid)
VALUES
(10, 4, 'DAMAGED', NULL),
(11, 4, 'AVAILABLE', NULL),
(12, 4, 'BORROWED', 4);

-- Book 5 Copies
INSERT INTO bookCopy (bookcopyid, bookid, status, customerid)
VALUES
(13, 5, 'AVAILABLE', NULL),
(14, 5, 'AVAILABLE', NULL),
(15, 5, 'BORROWED', 5);

-- Book 6 Copies
INSERT INTO bookCopy (bookcopyid, bookid, status, customerid)
VALUES
(16, 6, 'AVAILABLE', NULL),
(17, 6, 'BORROWED', 6),
(18, 6, 'AVAILABLE', NULL);

-- Book 7 Copies
INSERT INTO bookCopy (bookcopyid, bookid, status, customerid)
VALUES
(19, 7, 'AVAILABLE', NULL),
(20, 7, 'AVAILABLE', NULL),
(21, 7, 'BORROWED', 7);

-- Book 8 Copies
INSERT INTO bookCopy (bookcopyid, bookid, status, customerid)
VALUES
(22, 8, 'DAMAGED', NULL),
(23, 8, 'AVAILABLE', NULL),
(24, 8, 'BORROWED', 8);

-- Book 9 Copies
INSERT INTO bookCopy (bookcopyid, bookid, status, customerid)
VALUES
(25, 9, 'AVAILABLE', NULL),
(26, 9, 'AVAILABLE', NULL),
(27, 9, 'BORROWED', 9);

-- Book 10 Copies
INSERT INTO bookCopy (bookcopyid, bookid, status, customerid)
VALUES
(28, 10, 'AVAILABLE', NULL),
(29, 10, 'BORROWED', 10),
(30, 10, 'AVAILABLE', NULL);