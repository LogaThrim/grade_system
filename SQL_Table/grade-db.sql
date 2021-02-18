-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Feb 18, 2021 at 03:09 PM
-- Server version: 8.0.18
-- PHP Version: 7.4.5

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `grade`
--

-- --------------------------------------------------------

--
-- Table structure for table `grade_props`
--

CREATE TABLE `grade_props` (
  `term` varchar(10) NOT NULL,
  `sec` varchar(3) NOT NULL,
  `subject_id` varchar(10) NOT NULL,
  `subject_name` varchar(100) NOT NULL,
  `credit` varchar(10) NOT NULL,
  `grade` varchar(2) NOT NULL,
  `subject_group` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `grade_props`
--

INSERT INTO `grade_props` (`term`, `sec`, `subject_id`, `subject_name`, `credit`, `grade`, `subject_group`) VALUES
('1/2563', '02', 'COMP456', 'Coding outside', '3(2-2-4)', 'A', 'd Science'),
('2/2562', '01', 'COMP123', 'Design pattern', '2(2-2-5)', 'B+', 'e Main'),
('2/2563', '01', 'COMPP234', 'programming', '3(2-2-5)', 'B', 'e only');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `grade_props`
--
ALTER TABLE `grade_props`
  ADD PRIMARY KEY (`term`,`subject_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
