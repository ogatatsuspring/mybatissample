-- Create table Books
create table books (
	id int primary key auto_increment,
	title varchar( 255 ) not null,
	author varchar( 255 ) not null
);

-- Create Publishers Table
create table publishers (
	id int primary key auto_increment,
	name varchar( 255 ) not null
);

-- Create Books2 Table
create table books2 (
	id int primary key auto_increment,
	title varchar( 255 ) not null,
	author varchar( 255 ) not null,
	publisher_id int,
	foreign key ( publisher_id ) references publishers( id )
);

-- Create Reviews Table
create table reviews (
	id int primary key auto_increment,
	book_id int not null,
	review_text text,
	foreign key ( book_id ) references books2( id )
);
