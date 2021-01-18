create table movie
(movieUid number primary key,
movieTitle varchar2(40),
movieTime varchar2(80)
);

create sequence movie_UId start with 1 increment by 1;

INSERT INTO movie 
VALUES (movie_Uid.NEXTVAL,'��', '9:30');
INSERT INTO movie 
VALUES (movie_Uid.NEXTVAL,'��', '11:30');
INSERT INTO movie 
VALUES (movie_Uid.NEXTVAL,'��', '13:45');
INSERT INTO movie 
VALUES (movie_Uid.NEXTVAL,'��', '16:30');

INSERT INTO movie 
VALUES (movie_Uid.NEXTVAL,'��������', '10:30');
INSERT INTO movie 
VALUES (movie_Uid.NEXTVAL,'��������', '11:30');
INSERT INTO movie 
VALUES (movie_Uid.NEXTVAL,'��������', '14:45');
INSERT INTO movie 
VALUES (movie_Uid.NEXTVAL,'��������', '17:30');

INSERT INTO movie 
VALUES (movie_Uid.NEXTVAL,'�Ű��Բ�-�˿͹�', '11:20');
INSERT INTO movie 
VALUES (movie_Uid.NEXTVAL,'�Ű��Բ�-�˿͹�', '13:30');
INSERT INTO movie 
VALUES (movie_Uid.NEXTVAL,'�Ű��Բ�-�˿͹�', '15:45');
INSERT INTO movie 
VALUES (movie_Uid.NEXTVAL,'�Ű��Բ�-�˿͹�', '17:30');


select * from movie;