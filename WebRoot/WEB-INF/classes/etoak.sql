/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50528
Source Host           : localhost:3306
Source Database       : etoak

Target Server Type    : MYSQL
Target Server Version : 50528
File Encoding         : 65001

Date: 2015-10-15 13:52:16
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `student`
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(30) DEFAULT NULL,
  `password` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES ('1', 'a', 'a');
INSERT INTO `student` VALUES ('2', 'a', 'a');
INSERT INTO `student` VALUES ('3', 'a', 'a1');
INSERT INTO `student` VALUES ('4', 'a', 'a1');
INSERT INTO `student` VALUES ('6', 'aaa', 'aaa');
INSERT INTO `student` VALUES ('7', 'aaa', 'aaa');
INSERT INTO `student` VALUES ('8', 'aaa', 'aaa');
INSERT INTO `student` VALUES ('9', 'aaa', 'aaa');
INSERT INTO `student` VALUES ('10', 'aaa', 'aaa');
INSERT INTO `student` VALUES ('11', 'aaa', 'aaa');
INSERT INTO `student` VALUES ('12', 'aaa', 'aaa');
INSERT INTO `student` VALUES ('13', 'aaa', 'aaa');
INSERT INTO `student` VALUES ('14', '', '');
INSERT INTO `student` VALUES ('15', 'aa', 'aa');
INSERT INTO `student` VALUES ('16', 'aa', 'aa');
INSERT INTO `student` VALUES ('17', 'aa', 'aa');
INSERT INTO `student` VALUES ('18', 'aa', 'aa');
INSERT INTO `student` VALUES ('19', 'aaa', 'aaaa');
INSERT INTO `student` VALUES ('20', 'aaa', 'aaaa');

-- ----------------------------
-- Table structure for `t_test`
-- ----------------------------
DROP TABLE IF EXISTS `t_test`;
CREATE TABLE `t_test` (
  `id` int(11) DEFAULT NULL,
  `name` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_test
-- ----------------------------
INSERT INTO `t_test` VALUES ('1', '12');
INSERT INTO `t_test` VALUES ('121', '21');
INSERT INTO `t_test` VALUES ('21', '212');
INSERT INTO `t_test` VALUES ('21', '21');
INSERT INTO `t_test` VALUES ('21', '212');
INSERT INTO `t_test` VALUES ('21', null);
INSERT INTO `t_test` VALUES ('21', '23');
INSERT INTO `t_test` VALUES ('1', '2');
INSERT INTO `t_test` VALUES ('2', '3');
INSERT INTO `t_test` VALUES ('3', '4');
INSERT INTO `t_test` VALUES ('4', '5');
INSERT INTO `t_test` VALUES ('5', '5');
INSERT INTO `t_test` VALUES ('5', '6');
INSERT INTO `t_test` VALUES ('1', 'fd');
INSERT INTO `t_test` VALUES ('2', '33');
