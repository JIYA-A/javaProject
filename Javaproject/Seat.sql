create table seat
(seatUid number primary key,
seatName varchar2(40),
isSeatRsv char(1),
movieUid number
);

alter table seat 
add constraint seat_movieUid_fk foreign key 
(movieUid) references movie(movieUid);

create sequence seat_UId start with 1 increment by 1;