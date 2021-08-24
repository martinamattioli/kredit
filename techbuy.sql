-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: localhost
-- Tiempo de generación: 24-08-2021 a las 07:14:13
-- Versión del servidor: 10.4.20-MariaDB
-- Versión de PHP: 8.0.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `techbuy`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Catalogo`
--

CREATE TABLE `Catalogo` (
  `id` bigint(20) NOT NULL,
  `nombre` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Cliente`
--

CREATE TABLE `Cliente` (
  `id` bigint(20) NOT NULL,
  `direccion` varchar(255) DEFAULT NULL,
  `mail` varchar(255) DEFAULT NULL,
  `nombreCompleto` varchar(255) DEFAULT NULL,
  `nroDeDocumento` varchar(255) DEFAULT NULL,
  `tipoDeDocumento` varchar(255) DEFAULT NULL,
  `ubicacion` varchar(255) DEFAULT NULL,
  `tarjeta_id` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `Cliente`
--

INSERT INTO `Cliente` (`id`, `direccion`, `mail`, `nombreCompleto`, `nroDeDocumento`, `tipoDeDocumento`, `ubicacion`, `tarjeta_id`) VALUES
(1, 'CASLA 123', 'Lorenzo@gmail.com', 'San', '12345', 'DNI', 'CABA', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Combo`
--

CREATE TABLE `Combo` (
  `id` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Componente`
--

CREATE TABLE `Componente` (
  `id` bigint(20) NOT NULL,
  `caracteristicasGenerales` varchar(255) DEFAULT NULL,
  `foto` varchar(255) DEFAULT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `idCatalogo` bigint(20) DEFAULT NULL,
  `idCombo` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `EstadoPedido`
--

CREATE TABLE `EstadoPedido` (
  `id` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Pedido`
--

CREATE TABLE `Pedido` (
  `id` bigint(20) NOT NULL,
  `fecha` tinyblob DEFAULT NULL,
  `cliente_id` bigint(20) DEFAULT NULL,
  `componente_id` bigint(20) DEFAULT NULL,
  `estadoPedido_id` bigint(20) DEFAULT NULL,
  `tipoDeEnvio_id` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Producto`
--

CREATE TABLE `Producto` (
  `peso` int(11) DEFAULT NULL,
  `precio` int(11) DEFAULT NULL,
  `id` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `TarjetaDeCredito`
--

CREATE TABLE `TarjetaDeCredito` (
  `id` bigint(20) NOT NULL,
  `codigoDeSeguridad` int(11) DEFAULT NULL,
  `fechaDeVencimiento` datetime DEFAULT NULL,
  `monto` int(11) DEFAULT NULL,
  `numero` varchar(255) DEFAULT NULL,
  `redAsociada` varchar(255) DEFAULT NULL,
  `titular` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `TarjetaDeCredito`
--

INSERT INTO `TarjetaDeCredito` (`id`, `codigoDeSeguridad`, `fechaDeVencimiento`, `monto`, `numero`, `redAsociada`, `titular`) VALUES
(1, 1234, '2021-08-24 02:12:05', 1000, '1234', 'VISA', 'Godzilla');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `TipoDeEnvio`
--

CREATE TABLE `TipoDeEnvio` (
  `id` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `Catalogo`
--
ALTER TABLE `Catalogo`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `Cliente`
--
ALTER TABLE `Cliente`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK_ogflyy1xf2tg4h54cyhfrcddv` (`tarjeta_id`);

--
-- Indices de la tabla `Combo`
--
ALTER TABLE `Combo`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `Componente`
--
ALTER TABLE `Componente`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK_ovpr5si90u7yll1c8p5hv1hyj` (`idCatalogo`),
  ADD KEY `FK_1qa2rrfb5kjqasllf8itni6lm` (`idCombo`);

--
-- Indices de la tabla `EstadoPedido`
--
ALTER TABLE `EstadoPedido`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `Pedido`
--
ALTER TABLE `Pedido`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK_nmx283i28kpfbnjwln34xu8lm` (`cliente_id`),
  ADD KEY `FK_65ef1en7q5pnskkwwque3lfq2` (`componente_id`),
  ADD KEY `FK_68mqn7icw454wo81l3898vrg1` (`estadoPedido_id`),
  ADD KEY `FK_k9226c4foal0f1tp1ka4qi2mh` (`tipoDeEnvio_id`);

--
-- Indices de la tabla `Producto`
--
ALTER TABLE `Producto`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `TarjetaDeCredito`
--
ALTER TABLE `TarjetaDeCredito`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `TipoDeEnvio`
--
ALTER TABLE `TipoDeEnvio`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `Catalogo`
--
ALTER TABLE `Catalogo`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `Cliente`
--
ALTER TABLE `Cliente`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `Componente`
--
ALTER TABLE `Componente`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `EstadoPedido`
--
ALTER TABLE `EstadoPedido`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `Pedido`
--
ALTER TABLE `Pedido`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `TarjetaDeCredito`
--
ALTER TABLE `TarjetaDeCredito`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `TipoDeEnvio`
--
ALTER TABLE `TipoDeEnvio`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `Cliente`
--
ALTER TABLE `Cliente`
  ADD CONSTRAINT `FK_ogflyy1xf2tg4h54cyhfrcddv` FOREIGN KEY (`tarjeta_id`) REFERENCES `TarjetaDeCredito` (`id`);

--
-- Filtros para la tabla `Combo`
--
ALTER TABLE `Combo`
  ADD CONSTRAINT `FK_2dw5v51k501y9qbjj3r4mef1e` FOREIGN KEY (`id`) REFERENCES `Componente` (`id`);

--
-- Filtros para la tabla `Componente`
--
ALTER TABLE `Componente`
  ADD CONSTRAINT `FK_1qa2rrfb5kjqasllf8itni6lm` FOREIGN KEY (`idCombo`) REFERENCES `Combo` (`id`),
  ADD CONSTRAINT `FK_ovpr5si90u7yll1c8p5hv1hyj` FOREIGN KEY (`idCatalogo`) REFERENCES `Catalogo` (`id`);

--
-- Filtros para la tabla `Pedido`
--
ALTER TABLE `Pedido`
  ADD CONSTRAINT `FK_65ef1en7q5pnskkwwque3lfq2` FOREIGN KEY (`componente_id`) REFERENCES `Componente` (`id`),
  ADD CONSTRAINT `FK_68mqn7icw454wo81l3898vrg1` FOREIGN KEY (`estadoPedido_id`) REFERENCES `EstadoPedido` (`id`),
  ADD CONSTRAINT `FK_k9226c4foal0f1tp1ka4qi2mh` FOREIGN KEY (`tipoDeEnvio_id`) REFERENCES `TipoDeEnvio` (`id`),
  ADD CONSTRAINT `FK_nmx283i28kpfbnjwln34xu8lm` FOREIGN KEY (`cliente_id`) REFERENCES `Cliente` (`id`);

--
-- Filtros para la tabla `Producto`
--
ALTER TABLE `Producto`
  ADD CONSTRAINT `FK_epbcxgr1omlfrv6jc1dj7k8kb` FOREIGN KEY (`id`) REFERENCES `Componente` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
