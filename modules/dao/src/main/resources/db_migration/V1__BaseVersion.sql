CREATE TABLE `test_count` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `button_name` varchar(45) NOT NULL,
  `create_time` bigint(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7906 DEFAULT CHARSET=utf8;



CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'the unique id to identify the user',
  `phone_number` VARCHAR(45),
  `wechat_union_id` VARCHAR(45),
  `wechat_open_id` VARCHAR(45),
  `register_from` VARCHAR(45),
  `register_time` BIGINT(20) NOT NULL,
  PRIMARY KEY (`id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8