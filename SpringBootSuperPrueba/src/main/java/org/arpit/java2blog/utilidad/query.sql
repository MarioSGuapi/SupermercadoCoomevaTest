
--
-- Table structure for table `cliente`
--

DROP TABLE IF EXISTS coomeva.cliente;
CREATE TABLE coomeva.cliente (
  idCliente int(18) NOT NULL AUTO_INCREMENT,
  identifiacion int (18) NOT NULL,
  nombres varchar(100) NOT NULL,
  apellidos varchar(100) NOT NULL,
  direccion varchar(300) NOT NULL,
  telefono varchar(50),
  email varchar(100),
  PRIMARY KEY (`IdCliente`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cliente`
--

LOCK TABLES coomeva.cliente WRITE;
/*!40000 ALTER TABLE coomeva.cliente DISABLE KEYS */;
INSERT INTO coomeva.cliente(idCliente, identificacion, nombres, apellidos, direccion, telefono, email) VALUES (1, '11223344','CLIENTE','BAJO','CALLE 1 # 2-1','3210099','CL01@YAHOO.ES');
INSERT INTO coomeva.cliente(idCliente, identificacion, nombres, apellidos, direccion, telefono, email) VALUES (2, '789456','PETER','ROJO','CALLE 11 # 21-11',NULL,NULL);
INSERT INTO coomeva.cliente(idCliente, identificacion, nombres, apellidos, direccion, telefono, email) VALUES (3, '66995522','JAIR','RUIZ','CALLE 63 # 55-1','3669955','JAIR@YAHOO.ES');
INSERT INTO coomeva.cliente(idCliente, identificacion, nombres, apellidos, direccion, telefono, email) VALUES (4, '2255448','VICTOR','BARCO','CALLE 19 # 21','7410022','VICTOR@YAHOO.ES');
INSERT INTO coomeva.cliente(idCliente, identificacion, nombres, apellidos, direccion, telefono, email) VALUES (5, '123456789','MARIA','CALLE','CALLE 61 # 77D-96','6660005','CALLE@YAHOO.ES');
INSERT INTO coomeva.cliente(idCliente, identificacion, nombres, apellidos, direccion, telefono, email) VALUES (6, '41000333','LUIS','CORREO','CALLE 45 # 32-11','4444444','LCORREO@YAHOO.ES');
/*!40000 ALTER TABLE coomeva.cliente ENABLE KEYS */;
UNLOCK TABLES;


--
-- Table structure for table `producto`
--

DROP TABLE IF EXISTS coomeva.producto;
CREATE TABLE coomeva.producto (
  idProducto int(18) NOT NULL AUTO_INCREMENT,
  codigo varchar(100) NOT NULL,
  nombre varchar(100) NOT NULL,
  valorUnidad FLOAT(18,3) NOT NULL,
  stock int NOT NULL,
  PRIMARY KEY (`idProducto`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=latin1;


--
-- Dumping data for table `producto`
--

LOCK TABLES coomeva.producto WRITE;
/*!40000 ALTER TABLE coomeva.producto DISABLE KEYS */;
INSERT INTO coomeva.producto (idProducto, codigo, nombre, valorUnidad, stock) VALUES (1,'0001','TOSTACOS',950,15);
INSERT INTO coomeva.producto (idProducto, codigo, nombre, valorUnidad, stock) VALUES (2,'0002','LECHE',2350,40);
INSERT INTO coomeva.producto (idProducto, codigo, nombre, valorUnidad, stock) VALUES (3,'0003','PLATANO',1500,20);
INSERT INTO coomeva.producto (idProducto, codigo, nombre, valorUnidad, stock) VALUES (4,'0004','PAÑALES',36500,4);
INSERT INTO coomeva.producto (idProducto, codigo, nombre, valorUnidad, stock) VALUES (5,'0005','BULTO DE MANDARINAS',156800,9);
INSERT INTO coomeva.producto (idProducto, codigo, nombre, valorUnidad, stock) VALUES (6,'0006','ARROZ',6450,60);
INSERT INTO coomeva.producto (idProducto, codigo, nombre, valorUnidad, stock) VALUES (7,'0007','PESCADO',99000,45);
INSERT INTO coomeva.producto (idProducto, codigo, nombre, valorUnidad, stock) VALUES (8,'0008','HUEVOS',11500,20);
INSERT INTO coomeva.producto (idProducto, codigo, nombre, valorUnidad, stock) VALUES (9,'0009','PAPAS JAJAJAJA',6600,1);
INSERT INTO coomeva.producto (idProducto, codigo, nombre, valorUnidad, stock) VALUES (10,'0010','DETERGENTE',5001000,3);
/*!40000 ALTER TABLE coomeva.producto ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `factura`
--

DROP TABLE IF EXISTS coomeva.factura;
CREATE TABLE coomeva.factura (
  idFactura int(18) NOT NULL AUTO_INCREMENT,
  idCliente int(18) NOT NULL,
  fechaVenta DATE NOT NULL,
  valorTotal DECIMAL(18, 3) NOT NULL,  
  PRIMARY KEY (`idFactura`),
  CONSTRAINT `fk_factura_cliente` FOREIGN KEY (`idCliente`) REFERENCES coomeva.cliente (`idCliente`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=latin1;


--
-- Dumping data for table `factura`
--

LOCK TABLES coomeva.factura WRITE;
/*!40000 ALTER TABLE coomeva.factura DISABLE KEYS */;
INSERT INTO coomeva.factura (idFactura, idCliente, fechaVenta, valorTotal) VALUES (1, 1,'',950,15);
/*!40000 ALTER TABLE coomeva.factura ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `factura_detalle`
--

DROP TABLE IF EXISTS coomeva.factura_detalle;
CREATE TABLE coomeva.factura_detalle (
  idFacturaDetalle int(18) NOT NULL AUTO_INCREMENT,
  idFactura int(18) NOT NULL,
  idProducto int(18) NOT NULL,
  cantidad int NOT NULL,
  valorUnidad DECIMAL(18,3) not null,
  valorTotal DECIMAL(18,3) not null, 
  PRIMARY KEY (`idFacturaDetalle`),
  CONSTRAINT `fk_facturadetalle_factura` FOREIGN KEY (`idFactura`) REFERENCES coomeva.factura (`idFactura`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_facturadetalle_producto` FOREIGN KEY (`idProducto`) REFERENCES coomeva.producto (`idProducto`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

