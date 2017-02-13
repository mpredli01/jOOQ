-- MySQL dump 10.13  Distrib 5.6.17, for osx10.7 (x86_64)
--
-- Host: localhost    Database: pubs
-- ------------------------------------------------------
-- Server version	5.6.17

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
-- Table structure for table `authors`
--

DROP TABLE IF EXISTS `authors`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `authors` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `version` bigint(20) NOT NULL,
  `last_name` varchar(50) NOT NULL,
  `first_name` varchar(50) NOT NULL,
  `state_id` bigint(20) NOT NULL,
  `zip_code` varchar(15) NOT NULL,
  `home_email` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKD9771048E2C4D1AB` (`state_id`),
  CONSTRAINT `FKD9771048E2C4D1AB` FOREIGN KEY (`state_id`) REFERENCES `states` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `authors`
--

LOCK TABLES `authors` WRITE;
/*!40000 ALTER TABLE `authors` DISABLE KEYS */;
INSERT INTO `authors` VALUES (1,0,'Redlich','Michael',35,'08822','mike@redlich.net'),(2,0,'Burd','Barry',35,'07940','barry@burd.org');
/*!40000 ALTER TABLE `authors` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `publications`
--

DROP TABLE IF EXISTS `publications`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `publications` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `version` bigint(20) NOT NULL,
  `type_id` bigint(20) NOT NULL,
  `title` varchar(200) NOT NULL,
  `author_id` bigint(20) NOT NULL,
  `publisher_id` bigint(20) NOT NULL,
  `publish_date` datetime DEFAULT NULL,
  `url` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK37B8A3C77A7F3855` (`publisher_id`),
  KEY `FK37B8A3C794A38877` (`author_id`),
  KEY `FK37B8A3C7D1FF4899` (`type_id`),
  CONSTRAINT `FK37B8A3C77A7F3855` FOREIGN KEY (`publisher_id`) REFERENCES `publishers` (`id`),
  CONSTRAINT `FK37B8A3C794A38877` FOREIGN KEY (`author_id`) REFERENCES `authors` (`id`),
  CONSTRAINT `FK37B8A3C7D1FF4899` FOREIGN KEY (`type_id`) REFERENCES `types` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=36 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `publications`
--

LOCK TABLES `publications` WRITE;
/*!40000 ALTER TABLE `publications` DISABLE KEYS */;
INSERT INTO `publications` VALUES (1,0,1,'James: The Java Apache Mail Enterprise Server',1,1,'2005-09-30 00:00:00','http://javaboutique.internet.com/reviews/james/'),(2,0,1,'James: The Java Apache Mail Enterprise Server',2,1,'2005-09-30 00:00:00','http://javaboutique.internet.com/reviews/james/'),(3,0,1,'Avoid Excessive Subclassing with the Decorator Design Pattern',1,1,'2006-01-27 00:00:00','http://javaboutique.internet.com/tutorials/decorator/'),(4,0,1,'Avoid Excessive Subclassing with the Decorator Design Pattern',2,1,'2006-01-27 00:00:00','http://javaboutique.internet.com/tutorials/decorator/'),(5,0,1,'Keeping Your Java Objects Informed with the Observer Design Pattern',1,1,'2006-06-19 00:00:00','http://javaboutique.internet.com/tutorials/observer/'),(6,0,1,'Keeping Your Java Objects Informed with the Observer Design Pattern',2,1,'2006-06-19 00:00:00','http://javaboutique.internet.com/tutorials/observer/'),(7,0,1,'Manufacturing Java Objects with the Factory Method Design Pattern',1,1,'2006-08-14 00:00:00','http://javaboutique.internet.com/tutorials/factory/'),(8,0,1,'Manufacturing Java Objects with the Factory Method Design Pattern',2,1,'2006-08-14 00:00:00','http://javaboutique.internet.com/tutorials/factory/'),(9,0,1,'Resistance is Futile - How to Make Your Java Objects Conform with the Adapter Pattern',1,1,'2006-09-25 00:00:00','http://javaboutique.internet.com/tutorials/adapter/'),(10,0,1,'Resistance is Futile - How to Make Your Java Objects Conform with the Adapter Pattern',2,1,'2006-09-25 00:00:00','http://javaboutique.internet.com/tutorials/adapter/'),(11,0,1,'Get to Know Your Java Object\'s State of Mind with the State Design Pattern',1,1,'2006-12-14 00:00:00','http://javaboutique.internet.com/tutorials/state/'),(12,0,1,'Get to Know Your Java Object\'s State of Mind with the State Design Pattern',2,1,'2006-12-14 00:00:00','http://javaboutique.internet.com/tutorials/state/'),(13,0,1,'Encapsulating Algorithms with the Template Method Design Pattern',1,1,'2007-02-09 00:00:00','http://javaboutique.internet.com/tutorials/template/'),(14,0,1,'Encapsulating Algorithms with the Template Method Design Pattern',2,1,'2007-02-09 00:00:00','http://javaboutique.internet.com/tutorials/template/'),(15,0,1,'Controlling Global Access to Your Java Objects with the Singleton Design Pattern',1,1,'2007-11-20 00:00:00','http://javaboutique.internet.com/tutorials/single/'),(16,0,1,'Controlling Global Access to Your Java Objects with the Singleton Design Pattern',2,1,'2007-11-20 00:00:00','http://javaboutique.internet.com/tutorials/single/'),(17,1,1,'Access Your Stored Java Objects with the Iterator Design Pattern',1,1,'2008-06-30 00:00:00','http://javaboutique.internet.com/tutorials/iterator/'),(18,1,1,'Access Your Stored Java Objects with the Iterator Design Pattern',2,1,'2008-06-30 00:00:00','http://javaboutique.internet.com/tutorials/iterator/'),(19,0,1,'Twitter Releases Pants 1.0 Polyglot Build Tool',1,2,'2016-05-28 00:00:00','https://www.infoq.com/news/2016/05/twitter-release-pants-build-tool'),(20,0,1,'Spring Releases Version 1.1 Statemachine Framework',1,2,'2016-06-05 00:00:00','https://www.infoq.com/news/2016/06/Spring-Releases-Statemachine'),(21,0,1,'Test Well and Prosper: The Great Java Unit-Testing Frameworks Debate',1,2,'2016-06-20 00:00:00','https://www.infoq.com/news/2016/06/Junit-vs-Spock'),(22,0,1,'Stagnation with Java EE 8: Can the Java Community Make a Difference?',1,2,'2016-07-09 00:00:00','https://www.infoq.com/news/2016/07/Java-EE-8-Stagnating'),(23,0,1,'After a Quiet 2015 Martin Odersky Outlined Significant Plans for Scala at Scala Days New York',1,2,'2016-08-02 00:00:00','https://www.infoq.com/news/2016/08/scala-development-is-heating-up'),(24,0,1,'The New Scala Center Focuses on Education and the Scala Community',1,2,'2016-08-16 00:00:00','https://www.infoq.com/news/2016/08/the-new-scala-center'),(25,0,1,'Dropwizard Java REST Framework Version 1.0.0 Features Updated Library Support, Scala, and Java 8',1,2,'2016-08-30 00:00:00','https://www.infoq.com/news/2016/08/dropwizard-milestone-release'),(26,0,1,'Spring Releases Versions 2.3.1 and 2.4.0 Web Services',1,2,'2016-09-21 00:00:00','https://www.infoq.com/news/2016/09/spring-releases-web-services'),(27,0,1,'Gradle Releases Version 3.0 of Their Polyglot Build Tool',1,2,'2016-09-24 00:00:00','https://www.infoq.com/news/2016/09/gradle-releases-version-3'),(28,0,1,'Red Hat Releases WildFly Application Server Version 10.1',1,2,'2016-10-04 00:00:00','https://www.infoq.com/news/2016/10/red-hat-releases-wildfly-10-1'),(29,0,1,'Pivotal Releases Versions 1.3.8 and 1.4.1 of Spring Boot',1,2,'2016-10-10 00:00:00','https://www.infoq.com/news/2016/10/spring-releases-boot'),(30,0,1,'Proposed Consolidation of JDK 10 OpenJDK Mercurial Repositories',1,2,'2016-10-21 00:00:00','https://www.infoq.com/news/2016/10/proposed-consol-of-jdk-repos'),(31,0,1,'Enterprise Development Trends 2016: A Survey of JVM Developers by Lightbend',1,2,'2016-11-08 00:00:00','https://www.infoq.com/news/2016/11/lightbend-enterprise-survey-2016'),(32,0,1,'The Road to Javaslang 3.0',1,2,'2016-11-12 00:00:00','https://www.infoq.com/news/2016/11/the-road-to-javaslang-3'),(33,0,1,'Lawyer.com: Early Adopter of HTTP/2, Speaks to InfoQ',1,2,'2016-11-30 00:00:00','https://www.infoq.com/news/2016/11/lawyer-com-adopts-http-2'),(34,0,1,'Speedment Releases Stream ORM Version 3.0.1',1,2,'2016-12-16 00:00:00','https://www.infoq.com/news/2016/12/speedment-releases-version-3'),(35,0,1,'Introducing Gradle Build Scans',1,2,'2016-12-23 14:59:03','https://www.infoq.com/news/2016/12/gradle-build-scans');
/*!40000 ALTER TABLE `publications` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `publishers`
--

DROP TABLE IF EXISTS `publishers`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `publishers` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `version` bigint(20) NOT NULL,
  `publisher` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `publishers`
--

LOCK TABLES `publishers` WRITE;
/*!40000 ALTER TABLE `publishers` DISABLE KEYS */;
INSERT INTO `publishers` VALUES (1,1,'Jupiter Media'),(2,0,'C4Media');
/*!40000 ALTER TABLE `publishers` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `states`
--

DROP TABLE IF EXISTS `states`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `states` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `version` bigint(20) NOT NULL,
  `state` varchar(50) NOT NULL,
  `mnemonic` varchar(2) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=60 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `states`
--

LOCK TABLES `states` WRITE;
/*!40000 ALTER TABLE `states` DISABLE KEYS */;
INSERT INTO `states` VALUES (1,0,'Alabama','AL'),(2,0,'Alaska','AK'),(3,0,'American Samoa','AS'),(4,0,'Arizona','AZ'),(5,0,'Arkansas','AR'),(6,0,'California','CA'),(7,0,'Colorado','CO'),(8,0,'Connecticut','CT'),(9,0,'Delaware','DE'),(10,0,'District of Columbia','DC'),(11,0,'Florida','FL'),(12,0,'Georgia','GA'),(13,0,'Guam','GU'),(14,0,'Hawaii','HI'),(15,0,'Idaho','ID'),(16,0,'Illinois','IL'),(17,0,'Indian Territory, Oklahoma','IT'),(18,0,'Indiana','IN'),(19,0,'Iowa','IA'),(20,0,'Kansas','KS'),(21,0,'Kentucky','KY'),(22,0,'Louisiana','LA'),(23,0,'Maine','ME'),(24,0,'Marshall Islands','MH'),(25,0,'Maryland','MD'),(26,0,'Massachusetts','MA'),(27,0,'Michigan','MI'),(28,0,'Minnesota','MN'),(29,0,'Mississippi','MS'),(30,0,'Missouri','MO'),(31,0,'Montana','MT'),(32,0,'Nebraska','NE'),(33,0,'Nevada','NV'),(34,0,'New Hampshire','NH'),(35,0,'New Jersey','NJ'),(36,0,'New Mexico','NM'),(37,0,'New York','NY'),(38,0,'North Carolina','NC'),(39,0,'North Dakota','ND'),(40,0,'Northern Mariana Island','MP'),(41,0,'Obsolete Code for Federated States of Micronesia','FM'),(42,0,'Ohio','OH'),(43,0,'Oklahoma','OK'),(44,0,'Oregon','OR'),(45,0,'Pennsylvania','PA'),(46,0,'Puerto Rico','PR'),(47,0,'Rhode Island','RI'),(48,0,'South Carolina','SC'),(49,0,'South Dakota','SD'),(50,0,'Tennessee','TN'),(51,0,'Texas','TX'),(52,0,'Utah','UT'),(53,0,'Vermont','VT'),(54,0,'Virgin Islands','VI'),(55,0,'Virginia','VA'),(56,0,'Washington','WA'),(57,0,'West Virginia','WV'),(58,0,'Wisconsin','WI'),(59,0,'Wyoming','WY');
/*!40000 ALTER TABLE `states` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `types`
--

DROP TABLE IF EXISTS `types`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `types` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `version` bigint(20) NOT NULL,
  `type` varchar(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `types`
--

LOCK TABLES `types` WRITE;
/*!40000 ALTER TABLE `types` DISABLE KEYS */;
INSERT INTO `types` VALUES (1,0,'Article'),(2,0,'Book');
/*!40000 ALTER TABLE `types` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-02-12 10:03:10
