delete from movie;
create table movie
(movieUid number primary key,
movieTitle varchar2(40),
movieTime varchar2(80)
);

create sequence movie_UId start with 1 increment by 1;




INSERT INTO movie 
VALUES (movie_Uid.NEXTVAL,'��������', '10:30');

INSERT INTO movie 
VALUES (movie_Uid.NEXTVAL,'��������', '14:30');


INSERT INTO movie 
VALUES (movie_Uid.NEXTVAL,'�Ű��Բ�-�˿͹�', '11:00');

INSERT INTO movie 
VALUES (movie_Uid.NEXTVAL,'�Ű��Բ�-�˿͹�', '12:30');
INSERT INTO movie 
VALUES (movie_Uid.NEXTVAL,'����', '9:30');
INSERT INTO movie 
VALUES (movie_Uid.NEXTVAL,'����', '13:30');
INSERT INTO movie 
VALUES (movie_Uid.NEXTVAL,'��Ŀ', '11:40');
INSERT INTO movie 
VALUES (movie_Uid.NEXTVAL,'��Ŀ', '15:45');

select movieUid from movie where movieTitle ='����' and movieTime='9:30'

select * from movie;
