CREATE SCHEMA TESTDB;
USE  TESTDB;
-- spring.jpa.hibernate.ddl-auto=create 
-- OPTIONAL as it is using spring.jpa.hibernate.ddl-auto=update 
-- CREATE TABLE `user` (
--   `user_id` bigint NOT NULL,
--   `user_name` varchar(255) DEFAULT NULL,
--   `account_type` varchar(255) DEFAULT NULL,
--   `account_number` bigint NOT NULL,
--   PRIMARY KEY (`user_id`)
-- );
-- 	@GeneratedValue(strategy = GenerationType.AUTO)
--	private Long productId;
-- OPTIONAL as we use @GeneratedValue(strategy = GenerationType.AUTO)
-- CREATE TABLE `hibernate_sequence` (
--   `next_val` bigint DEFAULT NULL
-- ) ENGINE=InnoDB;INSERT INTO `indlivedb`.`products`

INSERT INTO `testdb`.`user`
(`user_id`,
`user_name`,
`account_type`,
`account_number`)
VALUES
(100,
'Divya',
'Savings',
1000234);
COMMIT;
