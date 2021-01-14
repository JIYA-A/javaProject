create table customer
(userUid number primary key,
userName varchar2(40),
userId varchar2(40),
userPw varchar2(80),
userPhoneNum varchar2(80)
);
create sequence user_Uid start with 1 increment by 1;