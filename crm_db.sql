/*
Navicat MySQL Data Transfer

Source Server         : yuan
Source Server Version : 50725
Source Host           : localhost:3306
Source Database       : crm_db

Target Server Type    : MYSQL
Target Server Version : 50725
File Encoding         : 65001

Date: 2020-03-15 22:10:24
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for admin
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin` (
  `admin_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '管理员ID',
  `admin_name` varchar(50) NOT NULL COMMENT '管理员名称',
  `password` varchar(250) DEFAULT NULL COMMENT '密码',
  `phone` bigint(20) DEFAULT NULL COMMENT '手机号',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  `update_time` datetime NOT NULL COMMENT '修改时间',
  `is_del` int(1) NOT NULL DEFAULT '0' COMMENT '状态（0：删除；1：未删除）',
  PRIMARY KEY (`admin_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of admin
-- ----------------------------
INSERT INTO `admin` VALUES ('1', 'zzy', '123456', '1372708957', '2020-03-10 15:59:35', '2020-03-15 11:34:52', '1');

-- ----------------------------
-- Table structure for customer
-- ----------------------------
DROP TABLE IF EXISTS `customer`;
CREATE TABLE `customer` (
  `customer_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '客户id',
  `customer_name` varchar(50) NOT NULL COMMENT '客户名称',
  `sex` varchar(250) DEFAULT NULL COMMENT '性别',
  `address` varchar(255) DEFAULT NULL COMMENT '地址',
  `telephone` bigint(20) NOT NULL COMMENT '办公电话',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  `update_time` datetime NOT NULL COMMENT '修改时间',
  `is_del` int(1) NOT NULL DEFAULT '0' COMMENT '状态（0：删除；1：未删除）',
  PRIMARY KEY (`customer_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=31 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of customer
-- ----------------------------
INSERT INTO `customer` VALUES ('18', '邹志远', '男', '广东', '324234', '2019-11-01 00:00:00', '2019-11-01 00:00:00', '0');
INSERT INTO `customer` VALUES ('19', '亚索', '女', '广东', '324234', '2019-11-01 00:00:00', '2019-11-01 00:00:00', '1');
INSERT INTO `customer` VALUES ('20', '火蝠', '女', '广东', '898989', '2019-11-01 00:00:00', '2019-11-01 00:00:00', '1');
INSERT INTO `customer` VALUES ('21', '紫福', '女', '广东', '324234', '2019-11-01 00:00:00', '2020-03-10 10:47:25', '0');
INSERT INTO `customer` VALUES ('22', '火蝠', '女', '广东', '898989', '2019-11-01 00:00:00', '2020-03-10 10:49:02', '0');
INSERT INTO `customer` VALUES ('25', '亚索', '男', '广东', '324234', '2019-11-01 00:00:00', '2019-11-01 00:00:00', '1');

-- ----------------------------
-- Table structure for orders
-- ----------------------------
DROP TABLE IF EXISTS `orders`;
CREATE TABLE `orders` (
  `orders_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '订单id',
  `order_time` datetime NOT NULL COMMENT '下单时间',
  `customer_id` int(11) DEFAULT NULL COMMENT '客户id',
  `price` decimal(10,0) DEFAULT NULL COMMENT '总价',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  `update_time` datetime NOT NULL COMMENT '修改时间',
  `is_del` int(1) NOT NULL DEFAULT '0' COMMENT '状态（0：删除；1：未删除）',
  PRIMARY KEY (`orders_id`) USING BTREE,
  KEY `fk_customer` (`customer_id`),
  CONSTRAINT `fk_customer` FOREIGN KEY (`customer_id`) REFERENCES `customer` (`customer_id`) ON DELETE SET NULL ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of orders
-- ----------------------------
INSERT INTO `orders` VALUES ('1', '2020-03-26 17:21:52', '18', '112', '2020-03-19 17:21:59', '2020-03-17 17:22:03', '1');
INSERT INTO `orders` VALUES ('2', '2020-03-07 20:19:51', '18', '21312', '2020-03-07 20:20:00', '2020-03-07 20:20:02', '1');
INSERT INTO `orders` VALUES ('3', '2020-03-15 14:27:41', '21', '212', '2020-03-15 14:27:50', '2020-03-15 14:27:52', '1');
INSERT INTO `orders` VALUES ('4', '2020-03-26 17:21:52', '20', '2122', '2019-11-01 00:00:00', '2019-11-01 00:00:00', '1');
INSERT INTO `orders` VALUES ('5', '2020-03-26 17:21:52', '18', '2122', '2019-11-01 00:00:00', '2019-11-01 00:00:00', '1');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `sex` varchar(255) DEFAULT NULL,
  `is_del` int(11) DEFAULT '0' COMMENT '0存在，1删除',
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('2', '二等分', '123123', 'man', '0');
INSERT INTO `user` VALUES ('3', '佛挡杀佛', '23213', 'man', '1');
INSERT INTO `user` VALUES ('4', 'fdg ', '123123', 'man', '0');
INSERT INTO `user` VALUES ('5', 'dfds', '12321412', 'man', '1');
INSERT INTO `user` VALUES ('6', '火蝠', '788887', '女', '0');
INSERT INTO `user` VALUES ('7', 'zouzhiy', '787878', '男', '0');
