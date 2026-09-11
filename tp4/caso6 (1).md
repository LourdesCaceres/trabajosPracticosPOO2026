CREATE TABLE MEDICO

(

ID\_medico INT NOT NULL,

Nombre INT NOT NULL,

Apellido INT NOT NULL,

PRIMARY KEY (ID\_medico)

);

CREATE TABLE Provincia

(

id\_provincia INT NOT NULL,

nombre\_provincia VARCHAR(50) NOT NULL,

PRIMARY KEY (id\_provincia)

);

CREATE TABLE CIUDAD

(

codigo\_postal INT NOT NULL,

nombre\_ciudad VARCHAR(50) NOT NULL,

id\_provincia INT NOT NULL,

PRIMARY KEY (codigo\_postal, id\_provincia),

FOREIGN KEY (id\_provincia) REFERENCES Provincia(id\_provincia)

);

CREATE TABLE PACIENTE

(

ID\_paciente INT NOT NULL,

Nombre INT NOT NULL,

Apellido INT NOT NULL,

Fecha\_de\_Nacimiento INT NOT NULL,

codigo\_postal INT NOT NULL,

id\_provincia INT NOT NULL,

PRIMARY KEY (ID\_paciente),

FOREIGN KEY (codigo\_postal, id\_provincia) REFERENCES CIUDAD(codigo\_postal, )

);

CREATE TABLE ESPECIALIDAD/ES

(

ID\_especialidad INT NOT NULL,

Denominación INT NOT NULL,

PRIMARY KEY (ID\_especialidad)

);

CREATE TABLE MEDICO\_ESPECIALIDAD

(

ID\_medico INT NOT NULL,

ID\_especialidad INT NOT NULL,

PRIMARY KEY (ID\_medico, ID\_especialidad),

FOREIGN KEY (ID\_medico) REFERENCES MEDICO(ID\_medico),

FOREIGN KEY (ID\_especialidad) REFERENCES ESPECIALIDAD/ES(ID\_especialidad)

);

CREATE TABLE ATENCIóN

(

ID\_atencion INT NOT NULL,

Fecha INT NOT NULL,

ID\_medico INT NOT NULL,

ID\_especialidad INT NOT NULL,

ID\_paciente INT NOT NULL,

PRIMARY KEY (ID\_atencion, ID\_medico, ID\_especialidad, ID\_paciente),

FOREIGN KEY (ID\_medico, ID\_especialidad) REFERENCES MEDICO\_ESPECIALIDAD(, ),

FOREIGN KEY (ID\_paciente) REFERENCES PACIENTE(ID\_paciente)

);

CREATE TABLE MEDICO\_TELéFONO\_

(

Teléfono\_ INT NOT NULL,

ID\_medico INT NOT NULL,

PRIMARY KEY (ID\_medico, Teléfono\_),

FOREIGN KEY (ID\_medico) REFERENCES MEDICO(ID\_medico)

);

CREATE TABLE PACIENTE\_TELEFONO\_

(

Telefono\_ INT NOT NULL,

Cod.\_ID INT NOT NULL,

PRIMARY KEY (Telefono\_, Cod.\_ID),

FOREIGN KEY (Cod.\_ID) REFERENCES PACIENTE(ID\_paciente)

);
