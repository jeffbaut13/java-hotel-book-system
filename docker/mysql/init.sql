DROP DATABASE IF EXISTS hotel_sistema;
CREATE DATABASE hotel_sistema;
USE hotel_sistema;

-- Cliente
CREATE TABLE cliente (
  cedula INT NOT NULL,
  nombre VARCHAR(50) NOT NULL,
  tipo_identificacion VARCHAR(10),
  PRIMARY KEY (cedula)
);

-- Huesped
CREATE TABLE huesped (
  cedula INT NOT NULL,
  nombre VARCHAR(30) NOT NULL,
  apellido VARCHAR(30) NOT NULL,
  tipo_identificacion VARCHAR(10),
  edad INT,
  genero VARCHAR(10),
  PRIMARY KEY (cedula)
);

-- Factura
CREATE TABLE factura (
  id_factura BIGINT NOT NULL AUTO_INCREMENT,
  total DOUBLE NOT NULL,
  subtotal DOUBLE NOT NULL,
  iva DOUBLE NOT NULL,
  inc DOUBLE NOT NULL,
  descuento DOUBLE NOT NULL,
  categoria VARCHAR(20) NOT NULL,
  fecha_hora DATE NOT NULL,
  PRIMARY KEY (id_factura)
) DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- Reserva
CREATE TABLE reserva (
  id_reserva BIGINT AUTO_INCREMENT PRIMARY KEY,
  fecha_reserva DATE NOT NULL,
  estado VARCHAR(10),
  fecha_inicio DATE NOT NULL,
  fecha_fin DATE NOT NULL,
  id_cliente INT NOT NULL,
  id_factura BIGINT NOT NULL,
  FOREIGN KEY (id_cliente) REFERENCES cliente (cedula),
  FOREIGN KEY (id_factura) REFERENCES factura (id_factura)
);

-- Asociación reserva - huesped
CREATE TABLE reserva_huesped (
  id_reserva BIGINT NOT NULL,
  id_huesped INT NOT NULL,
  fecha_reserva DATE NOT NULL,
  PRIMARY KEY (id_reserva, id_huesped),
  FOREIGN KEY (id_reserva) REFERENCES reserva(id_reserva),
  FOREIGN KEY (id_huesped) REFERENCES huesped(cedula)
) DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- Categoria cama
CREATE TABLE categoria_cama (
  id_categoria_cama INT NOT NULL AUTO_INCREMENT,
  tipo VARCHAR(10) NOT NULL,
  medidas VARCHAR(50) NOT NULL,
  foto_url VARCHAR(200) NOT NULL,
  color VARCHAR(30) NOT NULL,
  PRIMARY KEY(id_categoria_cama)
) DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- Cama
CREATE TABLE cama (
  id_cama INT NOT NULL AUTO_INCREMENT,
  serial VARCHAR(100) NOT NULL,
  fecha_cama DATE NOT NULL,
  id_categoriacama INT NOT NULL,
  PRIMARY KEY(id_cama),
  FOREIGN KEY(id_categoriacama) REFERENCES categoria_cama(id_categoria_cama)
) DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- Categoría de habitación
CREATE TABLE categoria_habitacion (
  id_categoria_habitacion INT NOT NULL AUTO_INCREMENT,
  nombre VARCHAR(30) NOT NULL,
  precio_noche DOUBLE NOT NULL,
  foto_url VARCHAR(100) NOT NULL,
  descripcion VARCHAR(250) NOT NULL,
  tv BOOLEAN NOT NULL,
  aire_acondicionado BOOLEAN NOT NULL,
  cobertura_noctura BOOLEAN NOT NULL,
  veinticuatro_horas BOOLEAN NOT NULL,
  cafetera BOOLEAN NOT NULL,
  minibar BOOLEAN NOT NULL,
  caja_seguridad BOOLEAN NOT NULL,
  leed_automatizada BOOLEAN NOT NULL,
  servicio_huesped BOOLEAN NOT NULL,
  despertador BOOLEAN NOT NULL,
  portatil BOOLEAN NOT NULL,
  secador BOOLEAN NOT NULL,
  telefono BOOLEAN NOT NULL,
  vista_almar BOOLEAN NOT NULL,
  PRIMARY KEY (id_categoria_habitacion)
) DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- Asociación categoría cama - habitación
CREATE TABLE categoria_cama_habitacion (
  codigo_categoriacama INT NOT NULL,
  codigo_categoriahabitacion INT NOT NULL,
  cantidad SMALLINT NOT NULL,
  PRIMARY KEY (codigo_categoriacama, codigo_categoriahabitacion),
  FOREIGN KEY (codigo_categoriacama) REFERENCES categoria_cama(id_categoria_cama),
  FOREIGN KEY (codigo_categoriahabitacion) REFERENCES categoria_habitacion(id_categoria_habitacion)
) DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- Habitación
CREATE TABLE habitacion (
  id_habitacion INT NOT NULL AUTO_INCREMENT,
  nombre VARCHAR(30),
  piso INT NOT NULL,
  telefono VARCHAR(30),
  id_categoria INT NOT NULL,
  PRIMARY KEY(id_habitacion),
  FOREIGN KEY(id_categoria) REFERENCES categoria_habitacion(id_categoria_habitacion)
) DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- Asociación cama - habitación
CREATE TABLE cama_habitacion (
  id_cama INT NOT NULL,
  id_habitacion INT NOT NULL,
  estado VARCHAR(10),
  PRIMARY KEY(id_cama, id_habitacion),
  FOREIGN KEY(id_cama) REFERENCES cama(id_cama),
  FOREIGN KEY(id_habitacion) REFERENCES habitacion(id_habitacion) ON DELETE CASCADE
) DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;


-- Asociación reserva - habitación
CREATE TABLE reserva_habitacion (
  id_reserva BIGINT NOT NULL,
  id_habitacion INT NOT NULL,
  cantidad INT NOT NULL,
  PRIMARY KEY(id_reserva, id_habitacion),
  FOREIGN KEY(id_reserva) REFERENCES reserva(id_reserva),
  FOREIGN KEY(id_habitacion) REFERENCES habitacion(id_habitacion)
) DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- Recepción habitación
CREATE TABLE recepcion_habitacion (
  codigo_recepcion_habitacion INT NOT NULL AUTO_INCREMENT,
  fecha DATE NOT NULL,
  id_habitacion INT NOT NULL,
  categoria VARCHAR(8) NOT NULL,
  PRIMARY KEY(codigo_recepcion_habitacion),
  FOREIGN KEY(id_habitacion) REFERENCES habitacion(id_habitacion)
) DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- Recepción huésped
CREATE TABLE recepcion_huesped (
  id_recepcion INT NOT NULL,
  id_huesped INT NOT NULL,
  fecha_recepcion DATE NOT NULL,
  PRIMARY KEY(id_recepcion, id_huesped),
  FOREIGN KEY(id_recepcion) REFERENCES recepcion_habitacion(codigo_recepcion_habitacion),
  FOREIGN KEY(id_huesped) REFERENCES huesped(cedula)
) DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- ========== SEED ==========

INSERT INTO cliente (cedula, nombre, tipo_identificacion) VALUES
(123456, 'Carlos Pérez', 'CC');

INSERT INTO factura (id_factura, total, subtotal, iva, inc, descuento, categoria, fecha_hora) VALUES
(1, 150000, 130000, 19000, 1000, 0, 'Estándar', '2025-05-28');

INSERT INTO reserva (id_reserva, fecha_reserva, estado, fecha_inicio, fecha_fin, id_cliente, id_factura) VALUES
(1, '2025-05-28', 'Activa', '2025-05-29', '2025-05-31', 123456, 1);

INSERT INTO huesped (cedula, nombre, apellido, tipo_identificacion, edad, genero) VALUES
(7891011, 'Laura', 'Martínez', 'CC', 30, 'F');

INSERT INTO reserva_huesped (id_reserva, id_huesped, fecha_reserva) VALUES
(1, 7891011, '2025-05-28');

INSERT INTO categoria_cama (tipo, medidas, foto_url, color) VALUES
('Queen', '160x200', 'http://img.com/queen.jpg', 'Blanco');

INSERT INTO cama (serial, fecha_cama, id_categoriacama) VALUES
('P1-01', '2025-05-28', 1);

INSERT INTO categoria_habitacion (nombre, precio_noche, foto_url, descripcion, tv, aire_acondicionado, cobertura_noctura, veinticuatro_horas, cafetera, minibar, caja_seguridad, leed_automatizada, servicio_huesped, despertador, portatil, secador, telefono, vista_almar) VALUES
('Suite Deluxe', 450000, 'http://img.com/suite.jpg', 'Habitación con vista al mar y todas las comodidades', true, true, true, true, true, true, true, true, true, true, true, true, true, true);

INSERT INTO habitacion (nombre, piso, telefono, id_categoria) VALUES
('A101', 1, "3057255248", 1);

INSERT INTO cama_habitacion (id_cama, id_habitacion, estado) VALUES
(1, 1, 'Libre');

INSERT INTO reserva_habitacion (id_reserva, id_habitacion, cantidad) VALUES
(1, 1, 1);

INSERT INTO recepcion_habitacion (fecha, id_habitacion, categoria) VALUES
('2025-05-28', 1, 'Checkin');

INSERT INTO recepcion_huesped (id_recepcion, id_huesped, fecha_recepcion) VALUES
(1, 7891011, '2025-05-28');
