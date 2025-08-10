-- Insert into Books
insert into books( title, author ) values( '新人研修あるある', '山田太郎' );
insert into books( title, author ) values( 'こんなDBエンジニアは嫌だ', '佐藤花子' );
insert into books( title, author ) values( '本当にあったIT業界トラブル', '鈴木一郎' );


-- Insert into Publishers
insert into publishers( name ) values( '技術評論社' );
insert into publishers( name ) values( 'Technology評論社' );

-- Insert into Books2
insert into books2( title, author, publisher_id ) values( '新人研修あるある', '山田太郎', 1 );
insert into books2( title, author, publisher_id ) values( 'こんなDBエンジニアは嫌だ', '佐藤花子', 2 );
insert into books2( title, author, publisher_id ) values( '本当にあったIT業界トラブル', '鈴木一郎', 1 );

-- Insert into Reviews
insert into reviews( book_id, review_text ) values( 1, '非常に役立つ本でした。' );
insert into reviews( book_id, review_text ) values( 2, 'こんなDBエンジニアがいることに驚愕しました。' );
insert into reviews( book_id, review_text ) values( 2, '自分の現場には来てほしくないです。' );
insert into reviews( book_id, review_text ) values( 2, '同じ様な方が、私の現場にいます。。。' );
insert into reviews( book_id, review_text ) values( 3, '業界の闇を知るにはいい本です。' );
