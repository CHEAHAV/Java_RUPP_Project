-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Jun 08, 2024 at 01:27 AM
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
(2, 'Wonder women', 'Female', 'Years 2', 'Mathematics', 'Semester 2', 'A2', 'Afternoon', 'Building A', 'Monday - Saturdat', '2024-06-03', '2024-09-29', '099933187', '350', 'C:\\Photos\\Wonder momen.jpg', '2024-06-07 01:27:17', '0000-00-00 00:00:00'),
(3, 'Iron man', 'Male', 'Years 4', 'Chemistry', 'Semester 1', 'E3', 'Evening', 'Building T', 'Monday - Saturdat', '2024-08-06', '2024-11-20', '0887123456', '400', 'C:\\Photos\\Iron man.jpg', '2024-06-07 01:28:45', '0000-00-00 00:00:00'),
(4, 'Batman', 'Male', 'Years 3', 'Informations technology engineering', 'Semester 2', 'E5', 'Evening', 'STEM Building', 'Monday - Friday', '2023-10-01', '2024-06-30', '071765456', '600', 'C:\\Photos\\Batman.jpg', '2024-06-07 01:30:17', '0000-00-00 00:00:00'),
(5, 'Spiderman', 'Male', 'Years 1', 'Physics', 'Semester 1', 'M1', 'Morning', 'Building C', 'Monday - Saturdat', '2023-12-01', '2024-05-31', '087123765', '450', 'C:\\Photos\\Spiderman.jpg', '2024-06-07 01:32:35', '0000-00-00 00:00:00'),
(1, 'Superman', 'Male', 'Years 1', 'Computer Science', 'Semester 1', 'M1', 'Morning', 'Building B', 'Monday - Friday', '2024-06-01', '2024-10-31', '09872344', '500', 'C:\\Photos\\Superman.jpg', '2024-06-07 01:24:30', '0000-00-00 00:00:00'),
(6, 'kk', 'Male', 'Years 2', 'Informations technology engineering', 'Semester 1', 'M3', 'Afternoon', 'Building B', 'Monday - Friday', '2024-06-13', '2024-06-15', '098655', '600', 'E:\\Pictures\\Screenshots\\2023-04-25 (9).png', '2024-06-13', '2024-06-08 08:23:35');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
