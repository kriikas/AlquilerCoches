
DROP TABLE coches IF EXISTS;
CREATE TABLE coches (
  matricula char(7) NOT NULL PRIMARY KEY,
  modelo varchar(50) default NULL,
  fechaMatriculacion date default NULL,
  km int default NULL,
  precio decimal(10,0) default NULL
);

INSERT INTO coches VALUES  ('1111JKG','Opel Corsa Cup','2009-10-05',22000,'21'),
 ('3333ABK','Seat Le—n TDI 220','2008-01-25',15200,'34');


