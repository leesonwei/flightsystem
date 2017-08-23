/*
Navicat Oracle Data Transfer
Oracle Client Version : 12.2.0.1.0

Source Server         : Oracle
Source Server Version : 120100
Source Host           : 192.168.80.131:1521
Source Schema         : FLIGHT

Target Server Type    : ORACLE
Target Server Version : 120100
File Encoding         : 65001

Date: 2017-08-22 11:27:04
*/


-- ----------------------------
-- Table structure for AIRPORTS
-- ----------------------------
DROP TABLE "FLIGHT"."AIRPORTS";
CREATE TABLE "FLIGHT"."AIRPORTS" (
"ID" NUMBER(10) DEFAULT "FLIGHT"."ISEQ$$_95451".nextval  NOT NULL ,
"AIRPORT_NAME" VARCHAR2(50 BYTE) NOT NULL ,
"CITY_NAME" VARCHAR2(50 BYTE) NOT NULL 
)
LOGGING
NOCOMPRESS
NOCACHE

;

-- ----------------------------
-- Records of AIRPORTS
-- ----------------------------
INSERT INTO "FLIGHT"."AIRPORTS" VALUES ('1', '首都机场', '北京');
INSERT INTO "FLIGHT"."AIRPORTS" VALUES ('2', '吉隆波国际机场', '吉隆波');

-- ----------------------------
-- Indexes structure for table AIRPORTS
-- ----------------------------

-- ----------------------------
-- Checks structure for table AIRPORTS
-- ----------------------------
ALTER TABLE "FLIGHT"."AIRPORTS" ADD CHECK ("ID" IS NOT NULL);
ALTER TABLE "FLIGHT"."AIRPORTS" ADD CHECK ("AIRPORT_NAME" IS NOT NULL);
ALTER TABLE "FLIGHT"."AIRPORTS" ADD CHECK ("CITY_NAME" IS NOT NULL);

-- ----------------------------
-- Primary Key structure for table AIRPORTS
-- ----------------------------
ALTER TABLE "FLIGHT"."AIRPORTS" ADD PRIMARY KEY ("ID");
