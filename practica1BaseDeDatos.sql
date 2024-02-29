drop schema if exists arbolesSA;
drop user if exists usuario_practica;
CREATE SCHEMA arbolesSA ;

create user 'usuario_practica'@'%' identified by 'la_Clave.';

grant all privileges on arbolesSA.* to 'usuario_practica'@'%';
flush privileges;

create table arbolesSA.arbol (
  id_arbol INT NOT NULL AUTO_INCREMENT,
  nombre_comun VARCHAR(30) NOT NULL,
  nombre_cientifico VARCHAR(30) NOT NULL,
  dureza_madera VARCHAR(10) NOT NULL,
  descripcion VARCHAR(30) NOT NULL,
  tipo_flor VARCHAR(40) NOT NULL,
  ruta_imagen varchar(1024),
  
  PRIMARY KEY (id_arbol))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4;

INSERT INTO  arbolesSA.arbol (id_arbol,nombre_comun,nombre_cientifico,dureza_madera,descripcion,tipo_flor,ruta_imagen) VALUES 
('1','Abeto','Abies alba' , 'suave', 'arbol de clima humedo','hojas cortas', 
'https://img.freepik.com/foto-gratis/arbol-vivo-esponjoso-area-abierta-contra-fondo-cielo_169016-11141.jpg?size=626&ext=jpg&ga=GA1.1.1488620777.1708041600&semt=ais' ),
('2','roble','Quercus robur' , 'fuerte', 'arbol de clima humedo','hojas grandes', 'https://mejorconsalud.as.com/wp-content/uploads/2022/03/arbol-roble.jpg'),
('3','árbol de Josué ','Yucca brevifolia' , 'media', 'arbol de clima muy seco','flores amarillas', 'https://upload.wikimedia.org/wikipedia/commons/thumb/1/1a/Joshua_Tree_Nationalpark_P4130402.jpg/280px-Joshua_Tree_Nationalpark_P4130402.jpg'),
('4','Fagus crenata', 'haya japonesa' ,'suave', 'arbol de clima humedo','fruto hayuco ', 'https://upload.wikimedia.org/wikipedia/commons/thumb/e/e5/Inubuna-ouyou.JPG/250px-Inubuna-ouyou.JPG'),
('5','Fagus crenata', 'haya japonesa' ,'suave', 'arbol de clima humedo','fruto hayuco ', 'https://upload.wikimedia.org/wikipedia/commons/thumb/e/e5/Inubuna-ouyou.JPG/250px-Inubuna-ouyou.JPG');
