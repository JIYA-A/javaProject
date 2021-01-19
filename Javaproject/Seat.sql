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



alter table seat 
modify (isSeatRsv number); 

INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'A1', 0, 1);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'A2', 0, 1);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'A3', 0, 1);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'A4', 0, 1);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'A5', 0, 1);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'A6', 0, 1);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'B1', 0, 1);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'B2', 0, 1);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'B3', 0, 1);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'B4', 0, 1);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'B5', 0, 1);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'B6', 0, 1);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'C1', 0, 1);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'C2', 0, 1);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'C3', 0, 1);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'C4', 0, 1);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'C5', 0, 1);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'C6', 0, 1);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'D1', 0, 1);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'D2', 0, 1);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'D3', 0, 1);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'D4', 0, 1);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'D5', 0, 1);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'D6', 0, 1);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'E1', 0, 1);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'E2', 0, 1);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'E3', 0, 1);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'E4', 0, 1);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'E5', 0, 1);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'E6', 0, 1);

INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'A1', 0, 2);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'A2', 0, 2);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'A3', 0, 2);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'A4', 0, 2);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'A5', 0, 2);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'A6', 0, 2);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'B1', 0, 2);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'B2', 0, 2);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'B3', 0, 2);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'B4', 0, 2);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'B5', 0, 2);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'B6', 0, 2);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'C1', 0, 2);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'C2', 0, 2);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'C3', 0, 2);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'C4', 0, 2);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'C5', 0, 2);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'C6', 0, 2);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'D1', 0, 2);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'D2', 0, 2);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'D3', 0, 2);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'D4', 0, 2);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'D5', 0, 2);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'D6', 0, 2);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'E1', 0, 2);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'E2', 0, 2);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'E3', 0, 2);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'E4', 0, 2);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'E5', 0, 2);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'E6', 0, 2);

INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'A1', 0, 3);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'A2', 0, 3);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'A3', 0, 3);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'A4', 0, 3);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'A5', 0, 3);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'A6', 0, 3);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'B1', 0, 3);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'B2', 0, 3);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'B3', 0, 3);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'B4', 0, 3);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'B5', 0, 3);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'B6', 0, 3);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'C1', 0, 3);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'C2', 0, 3);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'C3', 0, 3);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'C4', 0, 3);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'C5', 0, 3);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'C6', 0, 3);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'D1', 0, 3);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'D2', 0, 3);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'D3', 0, 3);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'D4', 0, 3);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'D5', 0, 3);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'D6', 0, 3);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'E1', 0, 3);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'E2', 0, 3);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'E3', 0, 3);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'E4', 0, 3);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'E5', 0, 3);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'E6', 0, 3);

INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'A1', 0, 4);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'A2', 0, 4);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'A3', 0, 4);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'A4', 0, 4);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'A5', 0, 4);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'A6', 0, 4);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'B1', 0, 4);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'B2', 0, 4);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'B3', 0, 4);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'B4', 0, 4);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'B5', 0, 4);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'B6', 0, 4);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'C1', 0, 4);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'C2', 0, 4);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'C3', 0, 4);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'C4', 0, 4);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'C5', 0, 4);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'C6', 0, 4);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'D1', 0, 4);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'D2', 0, 4);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'D3', 0, 4);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'D4', 0, 4);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'D5', 0, 4);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'D6', 0, 4);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'E1', 0, 4);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'E2', 0, 4);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'E3', 0, 4);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'E4', 0, 4);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'E5', 0, 4);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'E6', 0, 4);

INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'A1', 0, 5);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'A2', 0, 5);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'A3', 0, 5);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'A4', 0, 5);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'A5', 0, 5);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'A6', 0, 5);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'B1', 0, 5);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'B2', 0, 5);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'B3', 0, 5);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'B4', 0, 5);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'B5', 0, 5);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'B6', 0, 5);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'C1', 0, 5);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'C2', 0, 5);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'C3', 0, 5);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'C4', 0, 5);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'C5', 0, 5);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'C6', 0, 5);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'D1', 0, 5);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'D2', 0, 5);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'D3', 0, 5);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'D4', 0, 5);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'D5', 0, 5);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'D6', 0, 5);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'E1', 0, 5);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'E2', 0, 5);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'E3', 0, 5);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'E4', 0, 5);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'E5', 0, 5);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'E6', 0, 5);

INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'A1', 0, 6);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'A2', 0, 6);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'A3', 0, 6);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'A4', 0, 6);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'A5', 0, 6);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'A6', 0, 6);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'B1', 0, 6);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'B2', 0, 6);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'B3', 0, 6);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'B4', 0, 6);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'B5', 0, 6);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'B6', 0, 6);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'C1', 0, 6);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'C2', 0, 6);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'C3', 0, 6);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'C4', 0, 6);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'C5', 0, 6);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'C6', 0, 6);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'D1', 0, 6);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'D2', 0, 6);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'D3', 0, 6);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'D4', 0, 6);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'D5', 0, 6);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'D6', 0, 6);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'E1', 0, 6);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'E2', 0, 6);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'E3', 0, 6);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'E4', 0, 6);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'E5', 0, 6);
INSERT INTO seat
VALUES (seat_Uid.NEXTVAL,'E6', 0, 6);

select * from seat;