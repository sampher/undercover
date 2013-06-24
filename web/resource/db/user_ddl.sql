create table user_account
(
	id int auto_increment comment '账户编号',
	user_name varchar(24) comment '用户名',
	nick_name varchar(24) comment '昵称、显示名称',
	password varchar(24) comment '密码',
	e_mail varchar(50) comment '邮箱',
	create_time datetime comment '记录创建时间',
	modify_time datetime comment '记录修改时间',
	primary key (id)
)