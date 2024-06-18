-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Jun 18, 2024 at 05:59 PM
-- Server version: 8.2.0
-- PHP Version: 8.2.13

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_rupp`
--

-- --------------------------------------------------------

--
-- Table structure for table `rupp`
--

DROP TABLE IF EXISTS `rupp`;
CREATE TABLE IF NOT EXISTS `rupp` (
  `id` int NOT NULL,
  `name` varchar(255) NOT NULL,
  `gender` varchar(255) NOT NULL,
  `birth` varchar(255) NOT NULL,
  `years` varchar(255) NOT NULL,
  `department` varchar(255) NOT NULL,
  `semester` varchar(255) NOT NULL,
  `class` varchar(255) NOT NULL,
  `time` varchar(255) NOT NULL,
  `building` varchar(255) NOT NULL,
  `date` varchar(255) NOT NULL,
  `start` varchar(255) NOT NULL,
  `finish` varchar(255) NOT NULL,
  `phone` varchar(255) NOT NULL,
  `price` varchar(255) NOT NULL,
  `photos` varchar(255) NOT NULL,
  `create_at` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `rupp`
--

INSERT INTO `rupp` (`id`, `name`, `gender`, `birth`, `years`, `department`, `semester`, `class`, `time`, `building`, `date`, `start`, `finish`, `phone`, `price`, `photos`, `create_at`) VALUES
(3, 'ss', 'Female', '2024-06-21', 'Years 3', 'Informations technology engineering', 'Semester 1', 'M1', 'Morning', 'Building C', 'Monday - Saturdat', '2024-06-27', '2024-06-04', '088', '67776', 'C:\\Photos\\Pikachu.jpg', '2024-06-18 15:52:06'),
(2, 'Ban10', 'Female', '2024-06-07', 'Years 2', 'Informations technology engineering', 'Semester 1', 'M3', 'Afternoon', 'Building C', 'Monday - Friday', '2024-06-20', '2024-06-22', '', '500 $', 'C:\\Photos\\Ban10.jpg', '2024-06-18 01:19:39');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
