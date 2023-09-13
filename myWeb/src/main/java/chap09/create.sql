create table user_info(
	username varchar2(15)
,	email varchar2(20)
);

insert into user_info values ('박찬호', 'chpark@naver.com');
insert into user_info values ('손흥민', 'hmson@daum.net');
insert into user_info values ('김민재', 'mjkim@gmail.com');

commit;

select * from user_info;