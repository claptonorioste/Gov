-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Oct 02, 2019 at 05:45 PM
-- Server version: 10.4.6-MariaDB
-- PHP Version: 7.3.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `nlrc`
--

-- --------------------------------------------------------

--
-- Table structure for table `employee_info`
--

CREATE TABLE `employee_info` (
  `EID` int(11) NOT NULL,
  `Name` text NOT NULL,
  `Surename` text NOT NULL,
  `Username` text NOT NULL,
  `Password` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `employee_info`
--

INSERT INTO `employee_info` (`EID`, `Name`, `Surename`, `Username`, `Password`) VALUES
(1, 'John', 'Boner', 'editor', '123'),
(2, 'Nel', 'Joy', 'admin', '123'),
(3, 'hellen', 'lenlen', 'editorr', '123');

-- --------------------------------------------------------

--
-- Table structure for table `nlrc_data`
--

CREATE TABLE `nlrc_data` (
  `CNum` int(11) NOT NULL,
  `Title` text NOT NULL,
  `Date_app_nlrc` date NOT NULL,
  `Date_rec_oecc` date NOT NULL,
  `Date_rec_com` date NOT NULL,
  `Date_app_prom` date NOT NULL,
  `Date_mr_filed` date NOT NULL,
  `date_mr_prom` date NOT NULL,
  `ind_code` int(255) NOT NULL,
  `nature_case` varchar(255) NOT NULL,
  `nature_award` varchar(255) NOT NULL,
  `amm_award` int(255) NOT NULL,
  `com` varchar(255) NOT NULL,
  `gender` text NOT NULL,
  `la` varchar(255) NOT NULL,
  `date_mailed` date NOT NULL,
  `appeal_fee` int(255) NOT NULL,
  `bond` varchar(255) NOT NULL,
  `entry_judgment` varchar(255) NOT NULL,
  `date_entry_judg_issued` date NOT NULL,
  `date_forwarded` date NOT NULL,
  `courier_airbill_no` int(255) NOT NULL,
  `remarks` varchar(255) NOT NULL,
  `app_date_or` date NOT NULL,
  `bond_date_or` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `employee_info`
--
ALTER TABLE `employee_info`
  ADD PRIMARY KEY (`EID`);

--
-- Indexes for table `nlrc_data`
--
ALTER TABLE `nlrc_data`
  ADD PRIMARY KEY (`CNum`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `employee_info`
--
ALTER TABLE `employee_info`
  MODIFY `EID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `nlrc_data`
--
ALTER TABLE `nlrc_data`
  MODIFY `CNum` int(11) NOT NULL AUTO_INCREMENT;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
