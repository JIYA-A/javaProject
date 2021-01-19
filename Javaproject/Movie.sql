delete from movie;
create table movie
(movieUid number primary key,
movieTitle varchar2(40),
movieTime varchar2(80)
);

create sequence movie_UId start with 1 increment by 1;




INSERT INTO movie 
VALUES (movie_Uid.NEXTVAL,'극한직업', '10:30');

INSERT INTO movie 
VALUES (movie_Uid.NEXTVAL,'극한직업', '14:30');


INSERT INTO movie 
VALUES (movie_Uid.NEXTVAL,'신과함께-죄와벌', '11:00');

INSERT INTO movie 
VALUES (movie_Uid.NEXTVAL,'신과함께-죄와벌', '12:30');
INSERT INTO movie 
VALUES (movie_Uid.NEXTVAL,'명량', '9:30');
INSERT INTO movie 
VALUES (movie_Uid.NEXTVAL,'명량', '13:30');
INSERT INTO movie 
VALUES (movie_Uid.NEXTVAL,'조커', '11:40');
INSERT INTO movie 
VALUES (movie_Uid.NEXTVAL,'조커', '15:45');

select movieUid from movie where movieTitle ='명량' and movieTime='9:30'

select * from movie;
