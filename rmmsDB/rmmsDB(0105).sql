/*
 Navicat Premium Data Transfer

 Source Server         : mysql8
 Source Server Type    : MySQL
 Source Server Version : 80011
 Source Host           : localhost:3306
 Source Schema         : rmmsDB

 Target Server Type    : MySQL
 Target Server Version : 80011
 File Encoding         : 65001

 Date: 05/01/2020 12:11:30
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for tbl_daily_inspect
-- ----------------------------
DROP TABLE IF EXISTS `tbl_daily_inspect`;
CREATE TABLE `tbl_daily_inspect` (
  `daily_inspect_no` int(11) NOT NULL AUTO_INCREMENT,
  `road_name` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `inspector_name` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `damage_type` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `daily_inspect_date` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `daily_inspect_desc` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `daily_inspector_ps` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  PRIMARY KEY (`daily_inspect_no`) USING BTREE,
  KEY `FK_Relationship_16` (`damage_type`) USING BTREE,
  KEY `FK_Relationship_6` (`road_name`) USING BTREE,
  KEY `FK_Relationship_7` (`inspector_name`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=67019 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of tbl_daily_inspect
-- ----------------------------
BEGIN;
INSERT INTO `tbl_daily_inspect` VALUES (67001, '人和大道', '王海涛', '泛油', '2019-12-11', '路边', '无');
INSERT INTO `tbl_daily_inspect` VALUES (67002, '红锦大道', '简自豪', '泛油', '2019-12-12', '路边', '无');
INSERT INTO `tbl_daily_inspect` VALUES (67003, '二塘路', '厂子7', '路面', '2019-12-13', '路面路面', '无');
INSERT INTO `tbl_daily_inspect` VALUES (67004, '二塘路', '厂子7', '路面', '2019-12-14', '路面路面', '无');
INSERT INTO `tbl_daily_inspect` VALUES (67005, '人和大道', '王海涛', '路面', '2019-12-15', '路面路面', '无');
INSERT INTO `tbl_daily_inspect` VALUES (67006, '二塘路', '厂子', '路面', '2019-12-16', '路面路面', '无');
INSERT INTO `tbl_daily_inspect` VALUES (67007, '红锦大道', '简自豪', '坑洞', '2019-12-17', '路边', '无');
INSERT INTO `tbl_daily_inspect` VALUES (67008, '建新北路', '高学成', '泛油', '2019-12-18', '路边', '无');
INSERT INTO `tbl_daily_inspect` VALUES (67009, '建新北路', '高学成', '泛油', '2019-12-19', '路边', '无');
INSERT INTO `tbl_daily_inspect` VALUES (67016, '二塘路 v23fsf', '高学成', '沉陷', '2020-01-08', '路面路面', '无');
COMMIT;

-- ----------------------------
-- Table structure for tbl_inspector
-- ----------------------------
DROP TABLE IF EXISTS `tbl_inspector`;
CREATE TABLE `tbl_inspector` (
  `inspector_no` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `inspector_name` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `inspector_tel` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `inspector_tab` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `inspector_pwd` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  PRIMARY KEY (`inspector_no`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of tbl_inspector
-- ----------------------------
BEGIN;
INSERT INTO `tbl_inspector` VALUES ('110001', '023110', '13812345678', '0', '123');
COMMIT;

-- ----------------------------
-- Table structure for tbl_regular_damage
-- ----------------------------
DROP TABLE IF EXISTS `tbl_regular_damage`;
CREATE TABLE `tbl_regular_damage` (
  `damage_no` int(100) NOT NULL AUTO_INCREMENT,
  `inspector_name` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `road_name` varchar(100) DEFAULT NULL,
  `damage_type` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `damage_date` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `damage_start` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `damage_all_longth` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `damage_all_width` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `damage_longth` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `damage_width` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `damage_height` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `damage_desc` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `damage_area` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `damage_ps` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  PRIMARY KEY (`damage_no`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=20322 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of tbl_regular_damage
-- ----------------------------
BEGIN;
INSERT INTO `tbl_regular_damage` VALUES (20301, '王海涛', '人和大道', '泛油', '2019-10-24', '05', '10', '33', '88', '78', '92', 'desc', '66', 'nt');
INSERT INTO `tbl_regular_damage` VALUES (20302, '厂子', '红锦大道', '线裂', '2019-11-04', '11', '11', '11', '78', '96', '56', 'd', '11', 'd');
INSERT INTO `tbl_regular_damage` VALUES (20303, '王海涛', '人和大道', '线裂', '2019-12-04', '11', '11', '11', '95', '45', '87', 'd', '11', 'd');
INSERT INTO `tbl_regular_damage` VALUES (20304, '厂子', '红锦大道', '坑洞', '2019-10-17', '11', '88', '43', '66', '88', '86', 'd', '55', 'd');
INSERT INTO `tbl_regular_damage` VALUES (20305, '王海涛', '人和大道', '车辙', '2019-11-04', '42', '43', '42', '72', '79', '96', '', '43', '');
INSERT INTO `tbl_regular_damage` VALUES (20306, '厂子', '红锦大道', '线裂', '2019-12-04', '11', '11', '11', '85', '91', '84', 'd', '16', 'd');
INSERT INTO `tbl_regular_damage` VALUES (20307, '简自豪', '建新北路', '沉陷', '2019-10-04', '11', '11', '11', '87', '92', '82', 'd', '15', 'd');
INSERT INTO `tbl_regular_damage` VALUES (20308, '简自豪', '建新北路', '坑洞', '2019-11-04', '11', '11', '11', '88', '90', '83', 'd', '11', 'd');
INSERT INTO `tbl_regular_damage` VALUES (20309, '简自豪', '建新北路', '泛油', '2019-12-04', '11', '11', '11', '86', '93', '88', 'd', '12', 'd');
INSERT INTO `tbl_regular_damage` VALUES (20310, '高学成', '二塘路', '线裂', '2019-10-04', '11', '11', '11', '85', '95', '85', 'd', '17', 'd');
INSERT INTO `tbl_regular_damage` VALUES (20311, '高学成', '二塘路', '车辙', '2019-11-04', '11', '11', '11', '83', '94', '89', 'd', '23', 'd');
INSERT INTO `tbl_regular_damage` VALUES (20312, '高学成', '二塘路', '坑洞', '2019-12-04', '11', '11', '11', '85', '98', '80', 'd', '19', 'd');
COMMIT;

-- ----------------------------
-- Table structure for tbl_regular_smooth
-- ----------------------------
DROP TABLE IF EXISTS `tbl_regular_smooth`;
CREATE TABLE `tbl_regular_smooth` (
  `smooth_no` int(11) NOT NULL AUTO_INCREMENT,
  `inspector_name` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `road_name` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `smooth_IRI` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `smooth_date` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `smooth_ps` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  PRIMARY KEY (`smooth_no`) USING BTREE,
  KEY `FK_Relationship_10` (`inspector_name`) USING BTREE,
  KEY `FK_Relationship_14` (`road_name`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=65018 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of tbl_regular_smooth
-- ----------------------------
BEGIN;
INSERT INTO `tbl_regular_smooth` VALUES (65001, '厂子 7', '红锦大道', '66', '2019-11-01', '世界聚焦于你');
INSERT INTO `tbl_regular_smooth` VALUES (65002, '王海涛', '红锦大道', '66', '2019-12-04', '世界聚焦于你');
INSERT INTO `tbl_regular_smooth` VALUES (65003, 'f2', '人和大道', '55', '2019-11-22', '无');
INSERT INTO `tbl_regular_smooth` VALUES (65004, '王海涛', '人和大道', '55', '2019-12-23', '无');
INSERT INTO `tbl_regular_smooth` VALUES (65005, '简自豪', '建新北路', '62', '2019-11-23', '无');
INSERT INTO `tbl_regular_smooth` VALUES (65006, '简自豪', '建新北路', '54', '2019-12-23', '无');
INSERT INTO `tbl_regular_smooth` VALUES (65007, '高学成', '二塘路', '63', '2019-11-23', '无');
INSERT INTO `tbl_regular_smooth` VALUES (65008, '高学成', '二塘路', '75', '2019-12-23', '无');
COMMIT;

-- ----------------------------
-- Table structure for tbl_road
-- ----------------------------
DROP TABLE IF EXISTS `tbl_road`;
CREATE TABLE `tbl_road` (
  `road_id` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `lmlx_lmlx` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `road_name` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `road_zx` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `road_qd` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `road_zd` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `road_sjdw` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `road_sgdw` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `road_dldj` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `road_lmdj` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `road_sjss` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `road_lfkdfw` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `road_dlcd` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `road_dlmj` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `road_AADT` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `road_jtldj` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `road_ssxz` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `road_glfl` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `road_gldw` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `road_yhdw` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `road_jzny` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `road_lmhd` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `road_jclx` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `road_jchd` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `road_cds` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `road_txfx` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `road_jdcdkdfw` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `road_zcfjdcdkdfw` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `road_ycfjdcdkdfw` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `road_cxdmj` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `road_ywgjczyd` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `road_cslx` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `road_cscd` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `road_pslx` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `road_pscd` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `road_jcjsl` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `road_ysksl` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `road_lmpsl` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `road_bzpsl` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `road_scmj` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `road_qt` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `road_dljd` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `road_dlwd` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `road_dlid` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `road_del` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`road_id`) USING BTREE,
  KEY `FK_Relationship_8` (`lmlx_lmlx`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of tbl_road
-- ----------------------------
BEGIN;
INSERT INTO `tbl_road` VALUES ('1', '1', '1', '1', '1', '1', '1', '1', '1', '\n1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', 1);
INSERT INTO `tbl_road` VALUES ('823110', '主干路', '红锦大', '南北', '红旗河沟', '江北机场', '重庆交通大学', '九建', '一级', '二级', '100km/h', '30-40m', '18km', '1234m2', 'AADT', '一级', '渝北区', '区政府', '区交通运输局', '市政集团', '2005-05-06', '30cm', '半刚性基层', '46cm', '双向8车道', '右侧行驶', '3.66m', '0', '0', '3456m2', '有', '圆角侧石', '50cm', '平缘石', '44cm', '26', '143', '89', '321', '678m2', '无', NULL, NULL, NULL, NULL);
INSERT INTO `tbl_road` VALUES ('823111', '主干路', '建新北路', '南北', '红旗河沟', '江北机场', '重庆交通大学', '九建', '一级', '二级', '100km/h', '30-40m', '18km', '1234m2', 'AADT', '一级', '渝北区', '区政府', '区交通运输局', '市政集团', '2005-05-06', '30cm', '半刚性基层', '46cm', '双向8车道', '右侧行驶', '3.66m', '0', '0', '3456m2', '有', '圆角侧石', '50cm', '平缘石', '44cm', '26', '143', '89', '321', '678m2', '无', '经度null', '纬度null', '道路id NULL', 1);
INSERT INTO `tbl_road` VALUES ('823112', '主干路', '人和大道', '南北', '红旗河沟', '江北机场', '重庆交通大学', '九建', '一级', '二级', '100km/h', '30-40m', '18km', '1234m2', 'AADT', '一级', '渝北区', '区政府', '区交通运输局', '市政集团', '2005-05-06', '30cm', '半刚性基层', '46cm', '双向8车道', '右侧行驶', '3.66m', '0', '0', '3456m2', '有', '圆角侧石', '50cm', '平缘石', '44cm', '26', '143', '89', '321', '678m2', '无', '经度null', '纬度null', '道路id NULL', 1);
INSERT INTO `tbl_road` VALUES ('823113', '主干路', '二塘路', '东西', '南坪', '鱼洞', '重庆交通大学', '九建', '一级', '二级', '100km/h', '30-40m', '18km', '1234m2', 'AADT', '一级', '南岸区', '区政府', '区交通运输局', '市政集团', '2002-12-21', '30cm', '半刚性基层', '42cm', '双向6车道', '右侧行驶', '3.82m', '0', '0', '5656m2', '有', '圆角侧石', '50cm', '平缘石', '44cm', '26', '143', '89', '321', '678m2', '无', '1', '纬度null', '道路id NULL', 1);
COMMIT;

-- ----------------------------
-- Table structure for tbl_road_damage
-- ----------------------------
DROP TABLE IF EXISTS `tbl_road_damage`;
CREATE TABLE `tbl_road_damage` (
  `damage_type` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `road_type` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `damage_shape` char(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `damage_calc` char(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  PRIMARY KEY (`damage_type`) USING BTREE,
  KEY `FK_Relationship_15` (`road_type`) USING BTREE,
  CONSTRAINT `FK_Relationship_15` FOREIGN KEY (`road_type`) REFERENCES `tbl_road_type` (`road_type`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of tbl_road_damage
-- ----------------------------
BEGIN;
INSERT INTO `tbl_road_damage` VALUES ('1', '1', '1', '1');
COMMIT;

-- ----------------------------
-- Table structure for tbl_road_points
-- ----------------------------
DROP TABLE IF EXISTS `tbl_road_points`;
CREATE TABLE `tbl_road_points` (
  `road_type` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `damage_density` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `points_items` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  PRIMARY KEY (`road_type`) USING BTREE,
  KEY `FK_Relationship_13` (`damage_density`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Table structure for tbl_road_type
-- ----------------------------
DROP TABLE IF EXISTS `tbl_road_type`;
CREATE TABLE `tbl_road_type` (
  `road_type` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  PRIMARY KEY (`road_type`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of tbl_road_type
-- ----------------------------
BEGIN;
INSERT INTO `tbl_road_type` VALUES ('1');
INSERT INTO `tbl_road_type` VALUES ('主干路');
INSERT INTO `tbl_road_type` VALUES ('商业繁华街道');
INSERT INTO `tbl_road_type` VALUES ('外事活动路线');
INSERT INTO `tbl_road_type` VALUES ('广场');
INSERT INTO `tbl_road_type` VALUES ('快速路');
INSERT INTO `tbl_road_type` VALUES ('游览路线');
INSERT INTO `tbl_road_type` VALUES ('重要生产区道路');
COMMIT;

-- ----------------------------
-- Table structure for tbl_users
-- ----------------------------
DROP TABLE IF EXISTS `tbl_users`;
CREATE TABLE `tbl_users` (
  `user_no` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户账号',
  `user_pwd` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '密码',
  `user_name` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '用户名称',
  PRIMARY KEY (`user_no`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of tbl_users
-- ----------------------------
BEGIN;
INSERT INTO `tbl_users` VALUES ('100101', '123456', '王海涛');
INSERT INTO `tbl_users` VALUES ('100102', '7777777', '高学成');
INSERT INTO `tbl_users` VALUES ('100103', '123456', '简自豪');
INSERT INTO `tbl_users` VALUES ('100104', '123456', '简自豪');
INSERT INTO `tbl_users` VALUES ('100107', '123456', '厂子7');
INSERT INTO `tbl_users` VALUES ('100108', '3234', '厂子7');
INSERT INTO `tbl_users` VALUES ('100109', 'clearlove7', '厂子7');
INSERT INTO `tbl_users` VALUES ('100110', '11', 'distin');
INSERT INTO `tbl_users` VALUES ('100111', '1231', '厂子');
COMMIT;

-- ----------------------------
-- Triggers structure for table tbl_road
-- ----------------------------
DROP TRIGGER IF EXISTS `addDaily`;
delimiter ;;
CREATE TRIGGER `addDaily` AFTER INSERT ON `tbl_road` FOR EACH ROW INSERT into tbl_daily_inspect(tbl_daily_inspect.road_name) VALUES(NEW.road_name),(NEW.road_name),(NEW.road_name)
;;
delimiter ;

-- ----------------------------
-- Triggers structure for table tbl_road
-- ----------------------------
DROP TRIGGER IF EXISTS `addDamage`;
delimiter ;;
CREATE TRIGGER `addDamage` AFTER INSERT ON `tbl_road` FOR EACH ROW INSERT into tbl_regular_damage(tbl_regular_damage.road_name) VALUES(NEW.road_name),(NEW.road_name),(NEW.road_name)
;;
delimiter ;

-- ----------------------------
-- Triggers structure for table tbl_road
-- ----------------------------
DROP TRIGGER IF EXISTS `addSmooth`;
delimiter ;;
CREATE TRIGGER `addSmooth` AFTER INSERT ON `tbl_road` FOR EACH ROW INSERT into tbl_regular_smooth(tbl_regular_smooth.road_name) VALUES(NEW.road_name),(NEW.road_name),(NEW.road_name)
;;
delimiter ;

-- ----------------------------
-- Triggers structure for table tbl_road
-- ----------------------------
DROP TRIGGER IF EXISTS `deleDaily`;
delimiter ;;
CREATE TRIGGER `deleDaily` AFTER DELETE ON `tbl_road` FOR EACH ROW DELETE FROM tbl_daily_inspect WHERE tbl_daily_inspect.road_name=old.road_name
;;
delimiter ;

-- ----------------------------
-- Triggers structure for table tbl_road
-- ----------------------------
DROP TRIGGER IF EXISTS `deleDamage`;
delimiter ;;
CREATE TRIGGER `deleDamage` AFTER DELETE ON `tbl_road` FOR EACH ROW DELETE FROM tbl_regular_damage WHERE tbl_regular_damage.road_name=old.road_name
;;
delimiter ;

-- ----------------------------
-- Triggers structure for table tbl_road
-- ----------------------------
DROP TRIGGER IF EXISTS `deleSmooth`;
delimiter ;;
CREATE TRIGGER `deleSmooth` AFTER DELETE ON `tbl_road` FOR EACH ROW DELETE FROM tbl_regular_smooth WHERE tbl_regular_smooth.road_name=old.road_name
;;
delimiter ;

SET FOREIGN_KEY_CHECKS = 1;
