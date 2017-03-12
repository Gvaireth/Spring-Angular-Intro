CREATE DATABASE Library;
CREATE USER 'librarian'@'localhost' IDENTIFIED BY 'Mellon';
GRANT ALL ON Library.* TO 'librarian'@'localhost';

CREATE TABLE books (
id int not null auto_increment,
name varchar(100) not null,
published date,
primary key (id)
)

select * from books;
insert into books (name,published) values ("The Hobbit", STR_TO_DATE('21/09/1937', '%d/%m/%Y'));