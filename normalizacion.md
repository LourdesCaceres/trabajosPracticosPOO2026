CREATE TABLE PERSONA

(

direccion VARCHAR(50) NOT NULL,

nombre VARCHAR(50) NOT NULL,

DNI INT NOT NULL,

email VARCHAR(50) NOT NULL,

apellido VARCHAR(50) NOT NULL,

telefono INT NOT NULL,

PRIMARY KEY (DNI)

);

CREATE TABLE CLIENTE

(

fecha\_alta DATE NOT NULL,

DNI\_cliente INT NOT NULL,

PRIMARY KEY (DNI\_cliente),

FOREIGN KEY (DNI\_cliente) REFERENCES PERSONA(DNI)

);

CREATE TABLE VENDEDOR

(

cod\_vendedor INT NOT NULL,

fecha\_ingreso DATE NOT NULL,

DNI\_vendedor INT NOT NULL,

PRIMARY KEY (DNI\_vendedor),

FOREIGN KEY (DNI\_vendedor) REFERENCES PERSONA(DNI),

UNIQUE (cod\_vendedor)

);

CREATE TABLE MED\_DE\_PAGO

(

cod\_pago INT NOT NULL,

detalle ('Efectivo',' Transferencia', 'Débito', 'Crédito') NOT NULL,

PRIMARY KEY (cod\_pago)

);

CREATE TABLE VENTAS

(

numero\_com INT NOT NULL,

fecha DATE NOT NULL,

cant\_cuotas ('1', '2', '3') NOT NULL,

cod\_pago INT NOT NULL,

DNI\_cliente INT NOT NULL,

DNI\_vendedor INT NOT NULL,

PRIMARY KEY (numero\_com),

FOREIGN KEY (cod\_pago) REFERENCES MED\_DE\_PAGO(cod\_pago),

FOREIGN KEY (DNI\_cliente) REFERENCES CLIENTE(),

FOREIGN KEY (DNI\_vendedor) REFERENCES VENDEDOR()

);

CREATE TABLE CATEGORIA

(

descripcion VARCHAR(100) NOT NULL,

cod\_categoria INT NOT NULL,

PRIMARY KEY (cod\_categoria)

);

CREATE TABLE PRODUCTO

(

precio\_actual INT NOT NULL,

cod\_producto INT NOT NULL,

cant\_disponible INT NOT NULL,

cod\_categoria INT NOT NULL,

PRIMARY KEY (cod\_producto),

FOREIGN KEY (cod\_categoria) REFERENCES CATEGORIA(cod\_categoria)

);

CREATE TABLE PROVEEDOR

(

CUIT INT NOT NULL,

razon\_social VARCHAR(50) NOT NULL,

Direccion VARCHAR(50) NOT NULL,

telefono INT NOT NULL,

PRIMARY KEY (CUIT)

);

CREATE TABLE DETALLE\_VENTA

(

precio\_unit INT NOT NULL,

cantidad INT NOT NULL,

cod\_producto INT NOT NULL,

numero\_com INT NOT NULL,

PRIMARY KEY (cod\_producto, numero\_com),

FOREIGN KEY (cod\_producto) REFERENCES PRODUCTO(cod\_producto),

FOREIGN KEY (numero\_com) REFERENCES VENTAS(numero\_com)

);

CREATE TABLE PROVEEDOR\_PRODUCTO

(

CUIT INT NOT NULL,

cod\_producto INT NOT NULL,

FOREIGN KEY (CUIT) REFERENCES PROVEEDOR(CUIT),

FOREIGN KEY (cod\_producto) REFERENCES PRODUCTO(cod\_producto)

);
