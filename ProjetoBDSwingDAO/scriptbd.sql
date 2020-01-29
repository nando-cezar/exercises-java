create database bdlp1;

use bdlp1;

CREATE TABLE `categoria` (
  `codigocat` int(11) NOT NULL AUTO_INCREMENT,
  `nomecat` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`codigocat`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

CREATE TABLE `cliente` (
  `codigo` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(150) DEFAULT NULL,
  `endereco` varchar(200) DEFAULT NULL,
  `codigocat` int(11) DEFAULT NULL,
  PRIMARY KEY (`codigo`),
  KEY `codigocat` (`codigocat`),
  CONSTRAINT `cliente_ibfk_1` FOREIGN KEY (`codigocat`) REFERENCES `categoria` (`codigocat`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

INSERT categoria(`nomecat`) VALUES ('Bronze');
INSERT categoria(`nomecat`) VALUES ('Prata');
INSERT categoria(`nomecat`) VALUES ('Ouro');
