
drop table if exists `user`;

create table `user` 
(
	`id` int AUTO_INCREMENT COMMENT '主键' ,
	`name` varchar(32) not null  COMMENT '用户名',
	`logid` varchar(32) not null comment '登录名',
	`password` varchar(32) not null comment '密码',
	`lastdatetime` datetime default NULL comment '最近一次登录时间',
	`point` int(11) not null default 0 comment '分数',
	primary key(`id`)
) COMMENT='用户表';


drop table if exists `problembank`;

create table `problembank`
(
	`id` int AUTO_INCREMENT COMMENT '主键' ,
	`name` varchar(32) not null comment '题库名称',
	`pnums` int default 0 comment '问题数量',
	primary key (`id`)
) comment='题库表';


drop table if exists `problem`;

create table `problem`
(
	`id` int  AUTO_INCREMENT COMMENT '主键' ,
	`name` varchar(32) not null comment '问题名称',
	`pbid` int not null comment '所属题库id',
	`state` int not null default 1 comment '状态 0 未启用 1 启用',
	primary key (`id`)
) comment='问题表';


drop table if exists `option`;

create table `option`
(
	`id` int  AUTO_INCREMENT COMMENT '主键' ,
	`pid` int not null comment '所属问题id',
	`name` varchar(32) not null comment '选项描述',
	`yes_state` int default 0 comment '问题正向属性  0 非正确答案 1 正确答案',
	primary key(`id`)
) comment='问题选项表';


drop table if exists `wrongproblem`;

create table `wrongproblem`
(
	`id` int auto_increment comment '主键',
	`uid` int not null comment '所属用户id',
	`pid` int not null comment '所属问题id',
	primary key(`id`)
) comment='错误列表';

