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

Date: 2017-08-22 11:22:50
*/


-- ----------------------------
-- Table structure for FLIGHTS
-- ----------------------------
DROP TABLE "FLIGHT"."FLIGHTS";
CREATE TABLE "FLIGHT"."FLIGHTS" (
"ID" NUMBER(10) NOT NULL ,
"FLIGHT_CODE" VARCHAR2(20 BYTE) NOT NULL ,
"FLIGHT_DATE" DATE NOT NULL ,
"AIRLINE" VARCHAR2(50 BYTE) NOT NULL ,
"TYPE" VARCHAR2(20 BYTE) NOT NULL ,
"TAKE_AIRPORT_ID" NUMBER(10) NOT NULL ,
"LANDING_AIRPORT_ID" NUMBER(10) NOT NULL ,
"TAKE_TIME" DATE NOT NULL ,
"LANDING_TIME" DATE NOT NULL ,
"FLIGHT_TIME" VARCHAR2(20 BYTE) NOT NULL ,
"STOP_AIRPORT" VARCHAR2(50 BYTE) NULL ,
"REFERENCE_PRICE" NUMBER(10,2) NOT NULL 
)
LOGGING
NOCOMPRESS
NOCACHE

;

-- ----------------------------
-- Records of FLIGHTS
-- ----------------------------
INSERT INTO "FLIGHT"."FLIGHTS" VALUES ('4', 'MH361', TO_DATE('2014-03-18 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), '马来西亚航空', '空客330(宽体机)', '1', '2', TO_DATE('2014-03-18 01:30:00', 'YYYY-MM-DD HH24:MI:SS'), TO_DATE('2014-03-18 08:00:00', 'YYYY-MM-DD HH24:MI:SS'), '6小时30分钟', null, '2300');
INSERT INTO "FLIGHT"."FLIGHTS" VALUES ('5', 'D7317', TO_DATE('2014-03-18 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), '亚洲航空', '空客330(宽体机)', '1', '2', TO_DATE('2014-03-18 02:30:00', 'YYYY-MM-DD HH24:MI:SS'), TO_DATE('2014-03-18 08:55:00', 'YYYY-MM-DD HH24:MI:SS'), '6小时25分钟', null, '1209');
INSERT INTO "FLIGHT"."FLIGHTS" VALUES ('3', 'CZ4051', TO_DATE('2014-03-18 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), '南方航空', '空客330(宽体机)', '1', '2', TO_DATE('2014-03-18 01:30:00', 'YYYY-MM-DD HH24:MI:SS'), TO_DATE('2014-03-18 08:00:00', 'YYYY-MM-DD HH24:MI:SS'), '6小时30分钟', null, '1840');

-- ----------------------------
-- Indexes structure for table FLIGHTS
-- ----------------------------

-- ----------------------------
-- Checks structure for table FLIGHTS
-- ----------------------------
ALTER TABLE "FLIGHT"."FLIGHTS" ADD CHECK ("FLIGHT_CODE" IS NOT NULL);
ALTER TABLE "FLIGHT"."FLIGHTS" ADD CHECK ("FLIGHT_DATE" IS NOT NULL);
ALTER TABLE "FLIGHT"."FLIGHTS" ADD CHECK ("AIRLINE" IS NOT NULL);
ALTER TABLE "FLIGHT"."FLIGHTS" ADD CHECK ("TYPE" IS NOT NULL);
ALTER TABLE "FLIGHT"."FLIGHTS" ADD CHECK ("TAKE_AIRPORT_ID" IS NOT NULL);
ALTER TABLE "FLIGHT"."FLIGHTS" ADD CHECK ("LANDING_AIRPORT_ID" IS NOT NULL);
ALTER TABLE "FLIGHT"."FLIGHTS" ADD CHECK ("TAKE_TIME" IS NOT NULL);
ALTER TABLE "FLIGHT"."FLIGHTS" ADD CHECK ("LANDING_TIME" IS NOT NULL);
ALTER TABLE "FLIGHT"."FLIGHTS" ADD CHECK ("FLIGHT_TIME" IS NOT NULL);
ALTER TABLE "FLIGHT"."FLIGHTS" ADD CHECK ("REFERENCE_PRICE" IS NOT NULL);

-- ----------------------------
-- Primary Key structure for table FLIGHTS
-- ----------------------------
ALTER TABLE "FLIGHT"."FLIGHTS" ADD PRIMARY KEY ("ID");
