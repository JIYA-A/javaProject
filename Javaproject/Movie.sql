delete from movie;
create table movie
(movieUid number primary key,
movieTitle varchar2(40),
movieTime varchar2(80)
);

create sequence movie_UId start with 1 increment by 1;

INSERT INTO movie 
VALUES (movie_Uid.NEXTVAL,'¸í·®', '9:30');
INSERT INTO movie 
VALUES (movie_Uid.NEXTVAL,'¸í·®', '13:30');


INSERT INTO movie 
VALUES (movie_Uid.NEXTVAL,'±ØÇÑÁ÷¾÷', '10:30');

INSERT INTO movie 
VALUES (movie_Uid.NEXTVAL,'±ØÇÑÁ÷¾÷', '14:30');


INSERT INTO movie 
VALUES (movie_Uid.NEXTVAL,'½Å°úÇÔ²²-ÁË¿Í¹ú', '11:00');

INSERT INTO movie 
VALUES (movie_Uid.NEXTVAL,'½Å°úÇÔ²²-ÁË¿Í¹ú', '12:30');

select movieUid from movie where movieTitle ='¸í·®' and movieTime='9:30'

select * from movie;
