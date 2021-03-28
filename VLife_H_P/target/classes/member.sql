--권한 을 설정할 때에
--	가입할 때 자율 -> 자율은...X
--	관리자가 부여해주는  -> 관리자 페이지가 필요
--
create table vzone_member(
	m_id varchar2(10 char) primary key,
	m_pw varchar2(15 char) not null,
	m_name varchar2(15 char) not null,
	m_addr varchar2(200 char) not null,
	m_photo varchar2(200 char) not  null,
	m_role char(1 char) not null
);

insert into vzone_member values('357thgus','ehsehs2','박소현','?','?','?');



drop table vzone_member;

select*from vzone_member; 