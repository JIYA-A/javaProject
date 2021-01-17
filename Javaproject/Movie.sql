create table movie
(movieUid number primary key,
movieTitle varchar2(40),
movieTime varchar2(80)
);

create sequence movie_UId start with 1 increment by 1;

INSERT INTO movie 
VALUES (movie_Uid.NEXTVAL,'疙樊', '13:00');
INSERT INTO movie 
VALUES (movie_Uid.NEXTVAL,'疙樊', '17:00');
INSERT INTO movie 
VALUES (movie_Uid.NEXTVAL,'必茄流诀', '14:00');
INSERT INTO movie 
VALUES (movie_Uid.NEXTVAL,'必茄流诀', '18:00');
INSERT INTO movie 
VALUES (movie_Uid.NEXTVAL,'脚苞窃膊-了客国', '13:00');

INSERT INTO movie 
VALUES (movie_Uid.NEXTVAL,'脚苞窃膊-了客国', '18:00');
select * from movie;