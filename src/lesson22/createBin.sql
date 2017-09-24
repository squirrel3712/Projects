CREATE TABLE `shop_DB`.`bin` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `user_id` INT NOT NULL,
  `good_id` INT NULL,
  `amount` INT NULL,
  `date` DATETIME NULL,
  PRIMARY KEY (`id`));