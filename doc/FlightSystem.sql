/****************
*航班信息查询系统
*author:weilizong
*date:2017-08-14
*version:0.0.1
*soft:oracle 12c
*****************/
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

--创建用户
create user flight identified by flight;
grant dba to flight;

--创建表空间
create tablespace tp_filght
datafile '/app/oracle/oradata/anywhere/flight.dbf'
size 10M
autoextend on;

--授权表空间
alter user flight quota unlimited on tp_flight;

--切换到flight用户/not working
connect flight/flight;

--创建航班信息表flights
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

--创建机场表airports
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

--创建机票信息表flight_tickets
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

--创建序列
create sequence SEQ_flights_ID  
start with 1   
increment by 1   
minvalue 1   
nomaxvalue  
nocycle;

create sequence SEQ_ftickets_ID  
start with 1   
increment by 1   
minvalue 1   
nomaxvalue  
nocycle;

create sequence SEQ_airport_ID  
start with 1   
increment by 1   
minvalue 1   
nomaxvalue  
nocycle;

--插入数据

commit;
exit;