ALTER TABLE `online_shope`.`user` 
CHANGE COLUMN `name` `password` VARCHAR(45) NOT NULL ,
ADD COLUMN `login` VARCHAR(45) NOT NULL AFTER `password`;
