create table pay (
payUid number primary key,
payMethod varchar2(40),
totalPrice number,
payDate varchar2(80),
userUid number,
seatUid number 
);

alter table pay add constraint pay_seatUid_fk
foreign key (seatUid) references seat (seatUid);