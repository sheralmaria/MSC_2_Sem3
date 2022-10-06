

CREATE TABLE `cardata` (
  `Company Name` varchar(20) NOT NULL,
  `Model` varchar(10) NOT NULL,
  `Price` int(10) NOT NULL,
  `Year` int(4) NOT NULL,
  PRIMARY KEY (`Model`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;


INSERT INTO cardata VALUES
("Mercedes","Benz R","8000000","2022"),
("Ferrari","GT 5","10000000","2019"),
("BMW","GTR3","7500000","2020");


