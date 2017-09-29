
CREATE TABLE `user` (
  `id`              INT(11)    NOT NULL AUTO_INCREMENT
  COMMENT 'the unique id to identify the user',
  `name`            VARCHAR(45) COMMENT 'the users name',
  `phone_number`    VARCHAR(45) COMMENT ' the phone number of this user, it can be null,when using third part login',
  `password`        VARCHAR(45) COMMENT 'the password of the user, using sha1 and a salt string to encode',
  `wechat_union_id` VARCHAR(45) COMMENT 'the union id is the wechat to identify user',
  `wechat_open_id`  VARCHAR(45) COMMENT 'the open id is the wechat pb to identify user',
  `register_from`   VARCHAR(45) COMMENT 'which way the user register, e.g. wechat,phone or weibo',
  `register_time`   BIGINT(20) NOT NULL
  COMMENT 'the register time in unix timestamp by ms',
  `last_login_time` BIGINT(20) NOT NULL
  COMMENT 'the last login time in unix timestamp by ms',
  PRIMARY KEY (`id`)
)
  ENGINE = InnoDB
  DEFAULT CHARSET = utf8;


CREATE TABLE `production` (
  `id`               INT(11) NOT NULL AUTO_INCREMENT
  COMMENT 'the unique id to identify the production',
  `author_id`        INT(11) NOT NULL
  COMMENT 'the author of this production, relate to user.id',
  `cover_image_path` VARCHAR(100) COMMENT 'the path of the cover image ',
  `title`            VARCHAR(45) COMMENT 'the title of the production',
  `video_id` VARCHAR(45) COMMENT 'the video id in the ali cloud',
  `video_duration` INT(11) COMMENT 'the duration of the video in seconds',
  `comment_count` INT(11) COMMENT 'the comment times',
  `favorite_count` INT(11) COMMENT 'the favorite times',
  `share_count` INT(11) COMMENT 'the shared times',
  `upload_time` BIGINT(20) COMMENT 'the upload time in unix timstamp by ms',
  PRIMARY KEY (id),
  FOREIGN KEY (`author_id`) REFERENCES `user` (`id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE
)
  ENGINE = InnoDB
  DEFAULT CHARSET = utf8;
