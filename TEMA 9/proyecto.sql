-- phpMyAdmin SQL Dump
-- version 4.0.4.2
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tiempo de generación: 08-03-2019 a las 02:23:28
-- Versión del servidor: 5.6.13
-- Versión de PHP: 5.4.17

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `ejercicio2`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `proyecto`
--

CREATE TABLE IF NOT EXISTS `proyecto` (
  `NOMBRE` varchar(22) NOT NULL,
  `LUGAR` varchar(30) NOT NULL,
  `FECHA` date NOT NULL,
  `HORA_INICIO` time NOT NULL,
  `HORA_FIN` time NOT NULL,
  `NUM_PERSONAS` int(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `proyecto`
--

INSERT INTO `proyecto` (`NOMBRE`, `LUGAR`, `FECHA`, `HORA_INICIO`, `HORA_FIN`, `NUM_PERSONAS`) VALUES
('FOCOS', 'AFUERAS', '2019-03-08', '22:22:00', '23:00:00', 1500);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
