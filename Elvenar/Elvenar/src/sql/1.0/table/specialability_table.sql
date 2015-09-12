CREATE TABLE `specialability` (
  `id` int(11) NOT NULL,
  `name` varchar(20) NOT NULL,
  `value` double NOT NULL,
  `description` varchar(75) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8