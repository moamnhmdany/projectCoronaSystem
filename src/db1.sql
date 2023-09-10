-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: 05 فبراير 2022 الساعة 20:01
-- إصدار الخادم: 10.1.37-MariaDB
-- PHP Version: 7.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db1`
--

-- --------------------------------------------------------

--
-- بنية الجدول `diseases_table`
--

CREATE TABLE `diseases_table` (
  `diseases_id` int(11) NOT NULL,
  `diseases_tpye` varchar(100) NOT NULL,
  `vaccine_recipint_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- بنية الجدول `emp`
--

CREATE TABLE `emp` (
  `emp_id` int(11) NOT NULL,
  `emp_name` varchar(100) NOT NULL,
  `emp_password` varchar(100) NOT NULL,
  `emp_station_name` varchar(100) NOT NULL,
  `emp_spcieliz` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- بنية الجدول `station`
--

CREATE TABLE `station` (
  `st_id` int(11) NOT NULL,
  `st_name` varchar(100) NOT NULL,
  `st_address` varchar(128) NOT NULL,
  `st_phon_number` int(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- بنية الجدول `users`
--

CREATE TABLE `users` (
  `id` int(11) NOT NULL,
  `name` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- إرجاع أو استيراد بيانات الجدول `users`
--

INSERT INTO `users` (`id`, `name`, `password`) VALUES
(1, 'admin', '123'),
(2, 'moamn', '2323'),
(3, 'fefew', 'reer'),
(4, 'moamn', '1234587'),
(5, 'moamn', '123'),
(6, 'moamn', '123'),
(7, 'qr', '12'),
(8, 'hi', '121'),
(9, 'uiza', '123'),
(10, 'yizza', '12345');

-- --------------------------------------------------------

--
-- بنية الجدول `vaccen_recipint_info`
--

CREATE TABLE `vaccen_recipint_info` (
  `vaccen_recipint_info_-id` int(11) NOT NULL,
  `vaccen_type` varchar(100) NOT NULL,
  `vaccen_taken_num` varchar(100) NOT NULL,
  `vaccen_date_user` date NOT NULL,
  `vaccen_num_run` varchar(100) NOT NULL,
  `vaccen_country` varchar(100) NOT NULL,
  `vaccen_recipint_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- بنية الجدول `vaccen_table`
--

CREATE TABLE `vaccen_table` (
  `vaccen_id` int(11) NOT NULL,
  `vaccen_name` varchar(100) NOT NULL,
  `vaccen_number_run` varchar(100) NOT NULL,
  `vaccen_date` date NOT NULL,
  `vaccen_numbers` int(100) NOT NULL,
  `vaccen_country` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- بنية الجدول `vaccine_recipint`
--

CREATE TABLE `vaccine_recipint` (
  `vaccine_recipin_id` int(11) NOT NULL,
  `recipint_name` varchar(100) NOT NULL,
  `recipint_addrerss` varchar(100) NOT NULL,
  `recipint_Nationalty` varchar(100) NOT NULL,
  `recipint_phone_number` int(100) NOT NULL,
  `recipint_date` date NOT NULL,
  `recipint_city` varchar(100) NOT NULL,
  `vaccen_natinality_number` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `diseases_table`
--
ALTER TABLE `diseases_table`
  ADD PRIMARY KEY (`diseases_id`);

--
-- Indexes for table `emp`
--
ALTER TABLE `emp`
  ADD PRIMARY KEY (`emp_id`);

--
-- Indexes for table `station`
--
ALTER TABLE `station`
  ADD PRIMARY KEY (`st_id`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `vaccen_recipint_info`
--
ALTER TABLE `vaccen_recipint_info`
  ADD PRIMARY KEY (`vaccen_recipint_info_-id`);

--
-- Indexes for table `vaccen_table`
--
ALTER TABLE `vaccen_table`
  ADD PRIMARY KEY (`vaccen_id`);

--
-- Indexes for table `vaccine_recipint`
--
ALTER TABLE `vaccine_recipint`
  ADD PRIMARY KEY (`vaccine_recipin_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `diseases_table`
--
ALTER TABLE `diseases_table`
  MODIFY `diseases_id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `emp`
--
ALTER TABLE `emp`
  MODIFY `emp_id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `station`
--
ALTER TABLE `station`
  MODIFY `st_id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT for table `vaccen_recipint_info`
--
ALTER TABLE `vaccen_recipint_info`
  MODIFY `vaccen_recipint_info_-id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `vaccen_table`
--
ALTER TABLE `vaccen_table`
  MODIFY `vaccen_id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `vaccine_recipint`
--
ALTER TABLE `vaccine_recipint`
  MODIFY `vaccine_recipin_id` int(11) NOT NULL AUTO_INCREMENT;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
