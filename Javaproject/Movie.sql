create table movie
(movieUid number primary key,
movieTitle varchar2(40),
movieTime varchar2(80)
);

create sequence movie_UId start with 1 increment by 1;

INSERT INTO movie 
VALUES (movie_Uid.NEXTVAL,'��', '13:00');
INSERT INTO movie 
VALUES (movie_Uid.NEXTVAL,'��', '17:00');
INSERT INTO movie 
VALUES (movie_Uid.NEXTVAL,'��������', '14:00');
INSERT INTO movie 
VALUES (movie_Uid.NEXTVAL,'��������', '18:00');
INSERT INTO movie 
VALUES (movie_Uid.NEXTVAL,'�Ű��Բ�-�˿͹�', '13:00');

INSERT INTO movie 
VALUES (movie_Uid.NEXTVAL,'�Ű��Բ�-�˿͹�', '18:00');
select * from movie;