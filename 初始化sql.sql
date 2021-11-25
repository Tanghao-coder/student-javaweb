create database student_javaweb CHARACTER SET UTF8;
use student_javaweb;
CREATE TABLE `admin` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `user_name` varchar(50) NOT NULL COMMENT '用户名',
  `pwd` varchar(50) NOT NULL COMMENT '密码',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 comment '管理员表';
insert into admin(user_name,pwd) values ('admin','123456');
CREATE TABLE `student` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(50) NOT NULL COMMENT '学生姓名',
  `no` varchar(50) NOT NULL COMMENT '学号',
  `birth_day` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '生日',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 comment '学生表';
CREATE TABLE `score` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `cn_score` decimal(5,2) NOT NULL DEFAULT '0.00' COMMENT '语文成绩',
  `en_score` decimal(5,2) NOT NULL DEFAULT '0.00' COMMENT '英语成绩',
  `math_score` decimal(5,2) NOT NULL DEFAULT '0.00' COMMENT '数学成绩',
  `student_id` bigint(20) NOT NULL COMMENT '外键:student表的id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 comment '成绩表';