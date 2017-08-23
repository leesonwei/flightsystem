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

Date: 2017-08-22 11:25:42
*/


-- ----------------------------
-- Table structure for FLIGHT_TICKETS
-- ----------------------------
DROP TABLE "FLIGHT"."FLIGHT_TICKETS";
CREATE TABLE "FLIGHT"."FLIGHT_TICKETS" (
"ID" NUMBER(10) DEFAULT "FLIGHT"."ISEQ$$_95454".nextval  NOT NULL ,
"FLIGHT_ID" NUMBER(10) NOT NULL ,
"FLIGHT_DATE" DATE NOT NULL ,
"TICKET_PRICE" NUMBER(10,2) NOT NULL ,
"SELL_COMPANY" VARCHAR2(50 BYTE) NOT NULL 
)
LOGGING
NOCOMPRESS
NOCACHE

;

-- ----------------------------
-- Records of FLIGHT_TICKETS
-- ----------------------------
INSERT INTO "FLIGHT"."FLIGHT_TICKETS" VALUES ('1', '3', TO_DATE('2014-03-18 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), '1209', '亚洲航空');
INSERT INTO "FLIGHT"."FLIGHT_TICKETS" VALUES ('4', '3', TO_DATE('2014-03-18 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), '1224', '祥和航空');
INSERT INTO "FLIGHT"."FLIGHT_TICKETS" VALUES ('7', '3', TO_DATE('2014-03-18 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), '1520', '中提代购');

-- ----------------------------
-- Checks structure for table FLIGHT_TICKETS
-- ----------------------------
ALTER TABLE "FLIGHT"."FLIGHT_TICKETS" ADD CHECK ("ID" IS NOT NULL);
ALTER TABLE "FLIGHT"."FLIGHT_TICKETS" ADD CHECK ("FLIGHT_ID" IS NOT NULL);
ALTER TABLE "FLIGHT"."FLIGHT_TICKETS" ADD CHECK ("FLIGHT_DATE" IS NOT NULL);
ALTER TABLE "FLIGHT"."FLIGHT_TICKETS" ADD CHECK ("TICKET_PRICE" IS NOT NULL);
ALTER TABLE "FLIGHT"."FLIGHT_TICKETS" ADD CHECK ("SELL_COMPANY" IS NOT NULL);
