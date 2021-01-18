create table movie
(movieUid number primary key,
movieTitle varchar2(40),
movieTime varchar2(80)
);

create sequence movie_UId start with 1 increment by 1;

INSERT INTO movie 
VALUES (movie_Uid.NEXTVAL,'疙樊', '9:30');
INSERT INTO movie 
VALUES (movie_Uid.NEXTVAL,'疙樊', '11:30');
INSERT INTO movie 
VALUES (movie_Uid.NEXTVAL,'疙樊', '13:45');
INSERT INTO movie 
VALUES (movie_Uid.NEXTVAL,'疙樊', '16:30');

INSERT INTO movie 
VALUES (movie_Uid.NEXTVAL,'必茄流诀', '10:30');
INSERT INTO movie 
VALUES (movie_Uid.NEXTVAL,'必茄流诀', '11:30');
INSERT INTO movie 
VALUES (movie_Uid.NEXTVAL,'必茄流诀', '14:45');
INSERT INTO movie 
VALUES (movie_Uid.NEXTVAL,'必茄流诀', '17:30');

INSERT INTO movie 
VALUES (movie_Uid.NEXTVAL,'脚苞窃膊-了客国', '11:20');
INSERT INTO movie 
VALUES (movie_Uid.NEXTVAL,'脚苞窃膊-了客国', '13:30');
INSERT INTO movie 
VALUES (movie_Uid.NEXTVAL,'脚苞窃膊-了客国', '15:45');
INSERT INTO movie 
VALUES (movie_Uid.NEXTVAL,'脚苞窃膊-了客国', '17:30');


select * from movie;