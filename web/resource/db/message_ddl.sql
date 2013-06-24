create table message
(
	code varchar(32) comment '消息编号',
	text varchar(200) comment '消息内容',
	sender int comment '发送者',
	receiver int comment '接收者',
	send_time datetime comment '发送时间',
	create_time datetime comment '记录创建时间',
	modify_time datetime comment '记录修改时间',
	primary key(code)
)