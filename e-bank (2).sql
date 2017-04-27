-- phpMyAdmin SQL Dump
-- version 4.6.5.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 17, 2017 at 08:48 AM
-- Server version: 10.1.21-MariaDB
-- PHP Version: 5.6.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `e-bank`
--

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE `customer` (
  `Id` int(11) NOT NULL,
  `Name` varchar(200) NOT NULL,
  `DoB` date NOT NULL,
  `Address` varchar(200) NOT NULL,
  `Mobile` varchar(11) NOT NULL,
  `Email` varchar(100) NOT NULL,
  `AccountType` varchar(50) NOT NULL,
  `AccountNumber` varchar(10) NOT NULL,
  `SortCode` int(6) NOT NULL,
  `Balance` double NOT NULL,
  `Card` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`Id`, `Name`, `DoB`, `Address`, `Mobile`, `Email`, `AccountType`, `AccountNumber`, `SortCode`, `Balance`, `Card`) VALUES
(5, 'Robert Adams', '1969-10-03', '134A King Street Whakatane, Bay of Plenty', '011-64-077', 'robertadams@yahoo.com', 'Basic Checking Accounts', '1326549871', 258369, 3500, 'ATM Card'),
(6, 'James Ann', '1968-04-17', '147K James Road, Sydney', '044-99-899', 'james@gmail.com', 'Basic Checking Accounts', '1472583697', 214325, 36888, 'ATM Card');

-- --------------------------------------------------------

--
-- Table structure for table `employee`
--

CREATE TABLE `employee` (
  `Id` int(11) NOT NULL,
  `Name` varchar(200) NOT NULL DEFAULT '0',
  `Position` varchar(50) NOT NULL DEFAULT '0',
  `Username` varchar(15) NOT NULL DEFAULT '0',
  `Password` varchar(15) NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `employee`
--

INSERT INTO `employee` (`Id`, `Name`, `Position`, `Username`, `Password`) VALUES
(13, 'Nois Jog', 'Manager', 'manager', 'admin'),
(14, 'Andrew James', 'Assitant Manager', 'assmanager', 'assmanager'),
(15, 'Jhon Kerl', 'Line Manager', 'linemanager', 'linemanager'),
(16, 'Micheal', 'Bank Teller', 'teller', 'teller'),
(17, 'Rosy Kelly', 'Assitant Bank Teller', 'assbankteller', 'assbankteller'),
(18, 'George ', 'Security', 'securityGate', 'security');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `customer`
--
ALTER TABLE `customer`
  ADD PRIMARY KEY (`Id`),
  ADD UNIQUE KEY `AccountNumber` (`AccountNumber`);

--
-- Indexes for table `employee`
--
ALTER TABLE `employee`
  ADD PRIMARY KEY (`Id`),
  ADD UNIQUE KEY `Username` (`Username`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `customer`
--
ALTER TABLE `customer`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
--
-- AUTO_INCREMENT for table `employee`
--
ALTER TABLE `employee`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
