-- MySQL dump 10.13  Distrib 5.7.12, for osx10.9 (x86_64)
--
-- Host: 127.0.0.1    Database: ny_cab_data
-- ------------------------------------------------------
-- Server version	5.7.18

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `cab_trip_data`
--

DROP TABLE IF EXISTS `cab_trip_data`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cab_trip_data` (
  `id` bigint(20),
  `medallion` text,
  `hack_license` text,
  `vendor_id` text,
  `rate_code` int(11) DEFAULT NULL,
  `store_and_fwd_flag` text,
  `pickup_datetime` datetime DEFAULT NULL,
  `dropoff_datetime` datetime DEFAULT NULL,
  `passenger_count` int(11) DEFAULT NULL,
  `trip_time_in_secs` int(11) DEFAULT NULL,
  `trip_distance` double DEFAULT NULL,
  `pickup_longitude` double DEFAULT NULL,
  `pickup_latitude` double DEFAULT NULL,
  `dropoff_longitude` double DEFAULT NULL,
  `dropoff_latitude` double DEFAULT NULL
);
--ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;