-- phpMyAdmin SQL Dump
-- version 4.0.4.2
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tiempo de generación: 05-04-2019 a las 11:45:04
-- Versión del servidor: 5.6.13
-- Versión de PHP: 5.4.17

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `abogado`
--
CREATE DATABASE IF NOT EXISTS `abogado` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `abogado`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `abogado`
--

CREATE TABLE IF NOT EXISTS `abogado` (
  `DNI` varchar(9) NOT NULL,
  `nombre` varchar(15) NOT NULL,
  `apellido1` varchar(15) NOT NULL,
  `apellido2` varchar(15) NOT NULL,
  `direccion` varchar(40) NOT NULL,
  PRIMARY KEY (`DNI`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `abogadocaso`
--

CREATE TABLE IF NOT EXISTS `abogadocaso` (
  `DNIabogado` varchar(9) NOT NULL,
  `numCaso` int(15) NOT NULL,
  PRIMARY KEY (`DNIabogado`,`numCaso`),
  KEY `fk_numcaso` (`numCaso`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `caso`
--

CREATE TABLE IF NOT EXISTS `caso` (
  `numExp` int(15) NOT NULL,
  `cliente` varchar(9) NOT NULL,
  `fechaInicio` date NOT NULL,
  `fechaFin` date NOT NULL,
  `estado` varchar(15) NOT NULL,
  PRIMARY KEY (`numExp`),
  KEY `cliente` (`cliente`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

CREATE TABLE IF NOT EXISTS `cliente` (
  `DNI` varchar(9) NOT NULL,
  `nombre` varchar(15) NOT NULL,
  `apellido1` varchar(15) NOT NULL,
  `apellido2` varchar(15) NOT NULL,
  `direccion` varchar(40) NOT NULL,
  `telefono` int(9) NOT NULL,
  `casos` int(15) NOT NULL,
  PRIMARY KEY (`DNI`),
  KEY `casosindice` (`casos`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `abogadocaso`
--
ALTER TABLE `abogadocaso`
  ADD CONSTRAINT `fk_numcaso` FOREIGN KEY (`numCaso`) REFERENCES `caso` (`numExp`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `fk_dniabogado` FOREIGN KEY (`DNIabogado`) REFERENCES `abogado` (`DNI`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `caso`
--
ALTER TABLE `caso`
  ADD CONSTRAINT `fk_clienteDNI` FOREIGN KEY (`cliente`) REFERENCES `cliente` (`DNI`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD CONSTRAINT `fk_casosnum` FOREIGN KEY (`casos`) REFERENCES `caso` (`numExp`) ON DELETE CASCADE ON UPDATE CASCADE;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
