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

;

update seat set isSeatRsv = 1 where seatName = 'A1'and movieUid =23;
alter table seat 
modify (isSeatRsv number); 

INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'A1', 0, 23);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'A2', 0, 23);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'A3', 0, 23);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'A4', 0, 23);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'A5', 0, 23);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'A6', 0, 23);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'B1', 0, 23);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'B2', 0, 23);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'B3', 0, 23);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'B4', 0, 23);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'B5', 0, 23);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'B6', 0, 23);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'C1', 0, 23);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'C2', 0, 23);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'C3', 0, ¤¤23);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'C4', 0, 23);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'C5', 0, 23);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'C6', 0, 23);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'D1', 0, 23);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'D2', 0, 23);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'D3', 0, 23);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'D4', 0, 23);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'D5', 0, 23);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'D6', 0, 23);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'E1', 0, 23);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'E2', 0, 23);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'E3', 0, 23);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'E4', 0, 23);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'E5', 0, 23);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'E6', 0, 23);

INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'A1', 0, 24);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'A2', 0, 24);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'A3', 0, 24);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'A4', 0, 24);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'A5', 0, 24);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'A6', 0, 24);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'B1', 0, 24);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'B2', 0, 24);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'B3', 0, 24);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'B4', 0, 24);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'B5', 0, 24);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'B6', 0, 24);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'C1', 0, 24);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'C2', 0, 24);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'C3', 0, 24);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'C4', 0, 24);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'C5', 0, 24);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'C6', 0, 24);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'D1', 0, 24);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'D2', 0, 24);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'D3', 0, 24);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'D4', 0, 24);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'D5', 0, 24);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'D6', 0, 24);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'E1', 0, 24);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'E2', 0, 24);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'E3', 0, 24);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'E4', 0, 24);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'E5', 0, 24);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'E6', 0, 24);

INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'A1', 0, 25);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'A2', 0, 25);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'A3', 0, 25);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'A4', 0, 25);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'A5', 0, 25);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'A6', 0, 25);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'B1', 0, 25);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'B2', 0, 25);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'B3', 0, 25);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'B4', 0, 25);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'B5', 0, 25);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'B6', 0, 25);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'C1', 0, 25);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'C2', 0, 25);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'C3', 0, 25);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'C4', 0, 25);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'C5', 0, 25);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'C6', 0, 25);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'D1', 0, 25);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'D2', 0, 25);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'D3', 0, 25);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'D4', 0, 25);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'D5', 0, 25);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'D6', 0, 25);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'E1', 0, 25);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'E2', 0, 25);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'E3', 0, 25);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'E4', 0, 25);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'E5', 0, 25);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'E6', 0, 25);

INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'A1', 0, 26);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'A2', 0, 26);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'A3', 0, 26);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'A4', 0, 26);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'A5', 0, 26);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'A6', 0, 26);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'B1', 0, 26);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'B2', 0, 26);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'B3', 0, 26);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'B4', 0, 26);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'B5', 0, 26);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'B6', 0, 26);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'C1', 0, 26);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'C2', 0, 26);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'C3', 0, 26);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'C4', 0, 26);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'C5', 0, 26);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'C6', 0, 26);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'D1', 0, 26);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'D2', 0, 26);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'D3', 0, 26);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'D4', 0, 26);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'D5', 0, 26);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'D6', 0, 26);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'E1', 0, 26);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'E2', 0, 26);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'E3', 0, 26);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'E4', 0, 26);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'E5', 0, 26);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'E6', 0, 26);

INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'A1', 0, 27);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'A2', 0, 27);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'A3', 0, 27);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'A4', 0, 27);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'A5', 0, 27);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'A6', 0, 27);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'B1', 0, 27);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'B2', 0, 27);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'B3', 0, 27);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'B4', 0, 27);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'B5', 0, 27);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'B6', 0, 27);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'C1', 0, 27);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'C2', 0, 27);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'C3', 0, 27);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'C4', 0, 27);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'C5', 0, 27);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'C6', 0, 27);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'D1', 0, 27);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'D2', 0, 27);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'D3', 0, 27);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'D4', 0, 27);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'D5', 0, 27);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'D6', 0, 27);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'E1', 0, 27);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'E2', 0, 27);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'E3', 0, 27);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'E4', 0, 27);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'E5', 0, 27);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'E6', 0, 27);

INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'A1', 0, 28);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'A2', 0, 28);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'A3', 0, 28);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'A4', 0, 28);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'A5', 0, 28);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'A6', 0, 28);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'B1', 0, 28);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'B2', 0, 28);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'B3', 0, 28);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'B4', 0, 28);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'B5', 0, 28);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'B6', 0, 28);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'C1', 0, 28);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'C2', 0, 28);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'C3', 0, 28);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'C4', 0, 28);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'C5', 0, 28);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'C6', 0, 28);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'D1', 0, 28);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'D2', 0, 28);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'D3', 0, 28);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'D4', 0, 28);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'D5', 0, 28);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'D6', 0, 28);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'E1', 0, 28);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'E2', 0, 28);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'E3', 0, 28);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'E4', 0, 28);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'E5', 0, 28);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'E6', 0, 28);
select count(isSeatRsv) from seat where isSeatRsv = 1;
select * from seat;