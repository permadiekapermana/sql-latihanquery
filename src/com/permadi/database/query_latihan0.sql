-- phpMyAdmin SQL Dump
-- version 4.9.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Feb 01, 2021 at 05:18 PM
-- Server version: 10.4.10-MariaDB
-- PHP Version: 7.1.33

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `query_latihan0`
--

-- --------------------------------------------------------

--
-- Table structure for table `station`
--

CREATE TABLE `station` (
  `ID` int(11) NOT NULL,
  `CITY` varchar(21) NOT NULL,
  `STATE` varchar(2) NOT NULL,
  `LAT_N` int(11) NOT NULL,
  `LAT_W` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `station`
--

INSERT INTO `station` (`ID`, `CITY`, `STATE`, `LAT_N`, `LAT_W`) VALUES
(1, 'Cirebon', 'ID', 1, 1),
(2, 'Palembang', 'ID', 2, 2),
(3, 'Brazil', 'US', 3, 3),
(4, 'Argentina', 'US', 4, 4),
(5, 'England', 'UK', 5, 5),
(6, 'Shanghai', 'CN', 6, 6),
(7, 'Cirebon', 'US', 7, 7);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `station`
--
ALTER TABLE `station`
  ADD PRIMARY KEY (`ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `station`
--
ALTER TABLE `station`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
