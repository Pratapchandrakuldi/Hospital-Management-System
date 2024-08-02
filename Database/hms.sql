-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3307
-- Generation Time: Aug 02, 2024 at 08:09 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `hms`
--

-- --------------------------------------------------------

--
-- Table structure for table `doctor`
--

CREATE TABLE `doctor` (
  `Doctor ID` int(11) NOT NULL,
  `Full Name` varchar(255) NOT NULL,
  `Email ID` varchar(255) NOT NULL,
  `Contact no` varchar(10) NOT NULL,
  `Address` varchar(200) NOT NULL,
  `Qualification` varchar(100) NOT NULL,
  `Gender` varchar(50) NOT NULL,
  `Blood Group` varchar(30) NOT NULL,
  `Date of Joining` varchar(50) NOT NULL,
  `Availability` varchar(300) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `doctor`
--

INSERT INTO `doctor` (`Doctor ID`, `Full Name`, `Email ID`, `Contact no`, `Address`, `Qualification`, `Gender`, `Blood Group`, `Date of Joining`, `Availability`) VALUES
(1, 'Gopinath Behera', 'gopinath@gmail.com', '9348756496', 'Nuabeda', 'BCA', 'Male', 'O +ve', '0000-00-00', 'Monday: 10:30 AM to 12:30 PM'),
(2, 'Subhu', 'SubhuFather', '9631245879', 'Balasore', 'MBBS', 'Male', 'O+', '07-05-2024', 'Take rest'),
(3, 'Pratap', 'Trilochan', '8456044278', 'Raruan', 'MCA', 'Male', 'B+ve', '07-05-2024', 'Drink More water and Tke rest.'),
(4, 'Satyajit Samantaray', 'satya@gmail.com', '8144883148', 'Nachipada', 'MBBS', 'Male', 'B+', '07-05-2024', 'Monday: 1:00 pm to 5:00 pm , Saturday:  1:00 pm to 5:00 pm'),
(5, 'Ganesh Purty', 'ganesh@gmail.com', '9348756496', 'Jamnali', '12th', 'Male', 'O+', '3/05/2024', '10:30');

-- --------------------------------------------------------

--
-- Table structure for table `nurse`
--

CREATE TABLE `nurse` (
  `Nurse ID` int(11) NOT NULL,
  `Full Name` varchar(255) NOT NULL,
  `Email ID` varchar(255) NOT NULL,
  `Contact no` varchar(255) NOT NULL,
  `Address` varchar(255) NOT NULL,
  `Qualification` varchar(100) NOT NULL,
  `Gender` varchar(20) NOT NULL,
  `Blood Group` varchar(30) NOT NULL,
  `Date of Joining` varchar(20) NOT NULL,
  `Schedule` varchar(500) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `nurse`
--

INSERT INTO `nurse` (`Nurse ID`, `Full Name`, `Email ID`, `Contact no`, `Address`, `Qualification`, `Gender`, `Blood Group`, `Date of Joining`, `Schedule`) VALUES
(1, 'Sushree Jena', 'sushree12@gmail.com', '9337682903', 'Jaydev Bihar', 'nurshing', 'female', 'o+ve', '17-12-2023', 'all day 9:00am to 3:00pm');

-- --------------------------------------------------------

--
-- Table structure for table `p`
--

CREATE TABLE `p` (
  `id` int(11) NOT NULL,
  `name` varchar(255) NOT NULL,
  `f_name` varchar(255) NOT NULL,
  `address` varchar(255) NOT NULL,
  `contact` varchar(12) NOT NULL,
  `age` int(11) NOT NULL,
  `gender` varchar(50) NOT NULL,
  `days` varchar(50) NOT NULL,
  `blood` varchar(20) NOT NULL,
  `instructions` varchar(500) NOT NULL,
  `cost` varchar(100) NOT NULL,
  `room` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `p`
--

INSERT INTO `p` (`id`, `name`, `f_name`, `address`, `contact`, `age`, `gender`, `days`, `blood`, `instructions`, `cost`, `room`) VALUES
(1, 'Pratap Chandra Kuldi', 'Trilochan kuldi', 'Nuabeda', '9348756496', 23, 'Male', '5', 'O+', 'Take Exercise', '2500.0', '1'),
(2, 'Gopi', 'Gopinath', 'Bolangir', '9348756496', 22, 'Male', '3', 'O+', 'Exercise', '', NULL);

-- --------------------------------------------------------

--
-- Table structure for table `pharmacy`
--

CREATE TABLE `pharmacy` (
  `medid` int(11) NOT NULL,
  `medname` varchar(255) NOT NULL,
  `medprice` varchar(100) NOT NULL,
  `medquantity` varchar(255) NOT NULL,
  `medmfgdate` varchar(255) NOT NULL,
  `medexpdate` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `pharmacy`
--

INSERT INTO `pharmacy` (`medid`, `medname`, `medprice`, `medquantity`, `medmfgdate`, `medexpdate`) VALUES
(1, 'Namcol', '20', '2', '20-02-2022', '20-02-2025');

-- --------------------------------------------------------

--
-- Table structure for table `pharmacybilling`
--

CREATE TABLE `pharmacybilling` (
  `medid` int(11) NOT NULL,
  `medname` varchar(255) NOT NULL,
  `medprice` varchar(255) NOT NULL,
  `buyername` varchar(255) NOT NULL,
  `buyerno` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `pharmacybilling`
--

INSERT INTO `pharmacybilling` (`medid`, `medname`, `medprice`, `buyername`, `buyerno`) VALUES
(1, 'Namcol', '20', 'Pratap', '9348756496'),
(2, 'Namcol', '20', 'Satyajit', '9348756496');

-- --------------------------------------------------------

--
-- Table structure for table `room`
--

CREATE TABLE `room` (
  `roomno` int(11) NOT NULL,
  `availability` varchar(255) NOT NULL,
  `cost` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `room`
--

INSERT INTO `room` (`roomno`, `availability`, `cost`) VALUES
(1, 'yes', '500');

-- --------------------------------------------------------

--
-- Table structure for table `roombilling`
--

CREATE TABLE `roombilling` (
  `pid` int(11) NOT NULL,
  `pname` varchar(255) NOT NULL,
  `cost` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `roombilling`
--

INSERT INTO `roombilling` (`pid`, `pname`, `cost`) VALUES
(1, 'Pratap Chandra Kuldi', '2500.0');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `doctor`
--
ALTER TABLE `doctor`
  ADD PRIMARY KEY (`Doctor ID`);

--
-- Indexes for table `nurse`
--
ALTER TABLE `nurse`
  ADD PRIMARY KEY (`Nurse ID`);

--
-- Indexes for table `p`
--
ALTER TABLE `p`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `room` (`room`);

--
-- Indexes for table `pharmacy`
--
ALTER TABLE `pharmacy`
  ADD PRIMARY KEY (`medid`);

--
-- Indexes for table `pharmacybilling`
--
ALTER TABLE `pharmacybilling`
  ADD PRIMARY KEY (`medid`);

--
-- Indexes for table `room`
--
ALTER TABLE `room`
  ADD PRIMARY KEY (`roomno`);

--
-- Indexes for table `roombilling`
--
ALTER TABLE `roombilling`
  ADD PRIMARY KEY (`pid`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `doctor`
--
ALTER TABLE `doctor`
  MODIFY `Doctor ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `nurse`
--
ALTER TABLE `nurse`
  MODIFY `Nurse ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `p`
--
ALTER TABLE `p`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `pharmacy`
--
ALTER TABLE `pharmacy`
  MODIFY `medid` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `pharmacybilling`
--
ALTER TABLE `pharmacybilling`
  MODIFY `medid` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `room`
--
ALTER TABLE `room`
  MODIFY `roomno` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `roombilling`
--
ALTER TABLE `roombilling`
  MODIFY `pid` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
