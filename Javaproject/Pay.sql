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
alter table pay add constraint pay_userUid_fk
foreign key (userUid) references customer (userUid);

alater table pay
drop column payMethod;

alter table pay 
modify (payDate date); 
 
alter table pay
add movieName varchar2(40);

alter table pay
add userUid number;
alter table pay
add seatUid number ;


alter table pay
add constraint pay_userUid_fk foreign key 
(userUid) references customer(userUid);
alter table pay 
add constraint pay_seatUid_fk foreign key 
(seatUid) references seat(seatUid);



alter table pay add cardNumber varchar2(40) null;

create sequence pay_UId start with 1 increment by 1;
select * from pay;