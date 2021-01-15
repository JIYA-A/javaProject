create table movie
(movieUid number primary key,
movieTitle varchar2(40),
movieTime varchar2(80)
);

create sequence movie_UId start with 1 increment by 1;