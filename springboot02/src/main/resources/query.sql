use springboot02;

insert into role(id,name) values('1','ROLE_ADMIN');
insert into role(id,name) values('2','ROLE_NORMAL');

insert into user(id,username,password)
values('1','admin','$2a$10$/RUbuT9KIqk6f8enaTQiLOXzhnUkiwEJRdtzdrMXXwU7dgnLKTCYG');
insert into user(id,username,password)
values('2','user01','$2a$10$/RUbuT9KIqk6f8enaTQiLOXzhnUkiwEJRdtzdrMXXwU7dgnLKTCYG');

insert into user_roles(user_id,roles_id) values('1','1');
insert into user_roles(user_id,roles_id) values('2','2'); 