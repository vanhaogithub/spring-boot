use springboot01;

insert into role(id,name) values('1','ADMIN');
insert into role(id,name) values('2','USER');

insert into user(id,email,first_name,last_name,password)
values('1','admin@gmail.com','admin','Administrator','$2a$10$/RUbuT9KIqk6f8enaTQiLOXzhnUkiwEJRdtzdrMXXwU7dgnLKTCYG');
insert into user(id,email,first_name,last_name,password)
values('2','user01@gmail.com','user01','Employee01','$2a$10$/RUbuT9KIqk6f8enaTQiLOXzhnUkiwEJRdtzdrMXXwU7dgnLKTCYG');

insert into users_roles(user_id,role_id) values('1','1');
insert into users_roles(user_id,role_id) values('2','2');