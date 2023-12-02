create table book
(
	id int not null AUTO_INCREMENT,
	book_name varchar2(255) not null,
	book_type varchar2(255) not null,
	book_author varchar2(255) not null,
	no_of_pages int not null,
	primary key(id)
);