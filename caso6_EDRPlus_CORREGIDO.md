```python
md_content = """# Documentación del Modelo Relacional

Este documento contiene las tablas de la estructura relacional organizadas en formato Markdown y el script SQL corregido para su creación en base de datos.

---

## 1. Tablas del Modelo Relacional

### MEDICO
| Columna | Tipo de dato | Restricciones / Claves |
| :--- | :--- | :--- |
| `ID_medico` | `INT` | PRIMARY KEY, NOT NULL |
| `Nombre` | `VARCHAR(50)` | NOT NULL |
| `Apellido` | `VARCHAR(50)` | NOT NULL |

### Provincia
| Columna | Tipo de dato | Restricciones / Claves |
| :--- | :--- | :--- |
| `id_provincia` | `INT` | PRIMARY KEY, NOT NULL |
| `nombre_provincia` | `VARCHAR(50)` | NOT NULL |

### CIUDAD
| Columna | Tipo de dato | Restricciones / Claves |
| :--- | :--- | :--- |
| `codigo_postal` | `INT` | PRIMARY KEY (Compuesta), NOT NULL |
| `id_provincia` | `INT` | PRIMARY KEY (Compuesta), FOREIGN KEY (`Provincia`), NOT NULL |
| `nombre_ciudad` | `VARCHAR(50)` | NOT NULL |

### PACIENTE
| Columna | Tipo de dato | Restricciones / Claves |
| :--- | :--- | :--- |
| `ID_paciente` | `INT` | PRIMARY KEY, NOT NULL |
| `Nombre` | `VARCHAR(50)` | NOT NULL |
| `Apellido` | `VARCHAR(50)` | NOT NULL |
| `Fecha_de_Nacimiento` | `DATE` | NOT NULL |
| `codigo_postal` | `INT` | FOREIGN KEY (`CIUDAD`), NOT NULL |
| `id_provincia` | `INT` | FOREIGN KEY (`CIUDAD`), NOT NULL |

### ESPECIALIDAD
| Columna | Tipo de dato | Restricciones / Claves |
| :--- | :--- | :--- |
| `ID_especialidad` | `INT` | PRIMARY KEY, NOT NULL |
| `Denominacion` | `VARCHAR(100)` | NOT NULL |

### MEDICO_ESPECIALIDAD
| Columna | Tipo de dato | Restricciones / Claves |
| :--- | :--- | :--- |
| `ID_medico` | `INT` | PRIMARY KEY (Compuesta), FOREIGN KEY (`MEDICO`), NOT NULL |
| `ID_especialidad` | `INT` | PRIMARY KEY (Compuesta), FOREIGN KEY (`ESPECIALIDAD`), NOT NULL |

### ATENCION
| Columna | Tipo de dato | Restricciones / Claves |
| :--- | :--- | :--- |
| `ID_atencion` | `INT` | PRIMARY KEY (Compuesta), NOT NULL |
| `Fecha` | `DATE` | NOT NULL |
| `ID_medico` | `INT` | PRIMARY KEY (Compuesta), FOREIGN KEY (`MEDICO_ESPECIALIDAD`), NOT NULL |
| `ID_especialidad` | `INT` | PRIMARY KEY (Compuesta), FOREIGN KEY (`MEDICO_ESPECIALIDAD`), NOT NULL |
| `ID_paciente` | `INT` | PRIMARY KEY (Compuesta), FOREIGN KEY (`PACIENTE`), NOT NULL |

### MEDICO_TELEFONO
| Columna | Tipo de dato | Restricciones / Claves |
| :--- | :--- | :--- |
| `Telefono` | `VARCHAR(20)` | PRIMARY KEY (Compuesta), NOT NULL |
| `ID_medico` | `INT` | PRIMARY KEY (Compuesta), FOREIGN KEY (`MEDICO`), NOT NULL |

### PACIENTE_TELEFONO
| Columna | Tipo de dato | Restricciones / Claves |
| :--- | :--- | :--- |
| `Telefono` | `VARCHAR(20)` | PRIMARY KEY (Compuesta), NOT NULL |
| `ID_paciente` | `INT` | PRIMARY KEY (Compuesta), FOREIGN KEY (`PACIENTE`), NOT NULL |

---

## 2. Script SQL Corregido

```sql
CREATE TABLE MEDICO
(
  ID_medico INT NOT NULL,
  Nombre VARCHAR(50) NOT NULL,
  Apellido VARCHAR(50) NOT NULL,
  PRIMARY KEY (ID_medico)
);

CREATE TABLE Provincia
(
  id_provincia INT NOT NULL,
  nombre_provincia VARCHAR(50) NOT NULL,
  PRIMARY KEY (id_provincia)
);

CREATE TABLE CIUDAD
(
  codigo_postal INT NOT NULL,
  nombre_ciudad VARCHAR(50) NOT NULL,
  id_provincia INT NOT NULL,
  PRIMARY KEY (codigo_postal, id_provincia),
  FOREIGN KEY (id_provincia) REFERENCES Provincia(id_provincia)
);

CREATE TABLE PACIENTE
(
  ID_paciente INT NOT NULL,
  Nombre VARCHAR(50) NOT NULL,
  Apellido VARCHAR(50) NOT NULL,
  Fecha_de_Nacimiento DATE NOT NULL,
  codigo_postal INT NOT NULL,
  id_provincia INT NOT NULL,
  PRIMARY KEY (ID_paciente),
  FOREIGN KEY (codigo_postal, id_provincia) REFERENCES CIUDAD(codigo_postal, id_provincia)
);

CREATE TABLE ESPECIALIDAD
(
  ID_especialidad INT NOT NULL,
  Denominacion VARCHAR(100) NOT NULL,
  PRIMARY KEY (ID_especialidad)
);

CREATE TABLE MEDICO_ESPECIALIDAD
(
  ID_medico INT NOT NULL,
  ID_especialidad INT NOT NULL,
  PRIMARY KEY (ID_medico, ID_especialidad),
  FOREIGN KEY (ID_medico) REFERENCES MEDICO(ID_medico),
  FOREIGN KEY (ID_especialidad) REFERENCES ESPECIALIDAD(ID_especialidad)
);

CREATE TABLE ATENCION
(
  ID_atencion INT NOT NULL,
  Fecha DATE NOT NULL,
  ID_medico INT NOT NULL,
  ID_especialidad INT NOT NULL,
  ID_paciente INT NOT NULL,
  PRIMARY KEY (ID_atencion, ID_medico, ID_especialidad, ID_paciente),
  FOREIGN KEY (ID_medico, ID_especialidad) REFERENCES MEDICO_ESPECIALIDAD(ID_medico, ID_especialidad),
  FOREIGN KEY (ID_paciente) REFERENCES PACIENTE(ID_paciente)
);

CREATE TABLE MEDICO_TELEFONO
(
  Telefono VARCHAR(20) NOT NULL,
  ID_medico INT NOT NULL,
  PRIMARY KEY (ID_medico, Telefono),
  FOREIGN KEY (ID_medico) REFERENCES MEDICO(ID_medico)
);

CREATE TABLE PACIENTE_TELEFONO
(
  Telefono VARCHAR(20) NOT NULL,
  ID_paciente INT NOT NULL,
  PRIMARY KEY (Telefono, ID_paciente),
  FOREIGN KEY (ID_paciente) REFERENCES PACIENTE(ID_paciente)
);

```

"""

file_path = "modelo_relacional.md"
with open(file_path, "w", encoding="utf-8") as f:
f.write(md_content)

print(f"File created: {file_path}")

```

```text?code_stdout&code_event_index=1
File created: modelo_relacional.md


```

Your Markdown file is ready


A continuación también tienes el contenido completo en texto plano por si prefieres copiarlo y pegarlo directamente en tu editor de texto:

```markdown
# Documentación del Modelo Relacional

Este documento contiene las tablas de la estructura relacional organizadas en formato Markdown y el script SQL corregido para su creación en base de datos.

---

## 1. Tablas del Modelo Relacional

### MEDICO
| Columna | Tipo de dato | Restricciones / Claves |
| :--- | :--- | :--- |
| `ID_medico` | `INT` | PRIMARY KEY, NOT NULL |
| `Nombre` | `VARCHAR(50)` | NOT NULL |
| `Apellido` | `VARCHAR(50)` | NOT NULL |

### Provincia
| Columna | Tipo de dato | Restricciones / Claves |
| :--- | :--- | :--- |
| `id_provincia` | `INT` | PRIMARY KEY, NOT NULL |
| `nombre_provincia` | `VARCHAR(50)` | NOT NULL |

### CIUDAD
| Columna | Tipo de dato | Restricciones / Claves |
| :--- | :--- | :--- |
| `codigo_postal` | `INT` | PRIMARY KEY (Compuesta), NOT NULL |
| `id_provincia` | `INT` | PRIMARY KEY (Compuesta), FOREIGN KEY (`Provincia`), NOT NULL |
| `nombre_ciudad` | `VARCHAR(50)` | NOT NULL |

### PACIENTE
| Columna | Tipo de dato | Restricciones / Claves |
| :--- | :--- | :--- |
| `ID_paciente` | `INT` | PRIMARY KEY, NOT NULL |
| `Nombre` | `VARCHAR(50)` | NOT NULL |
| `Apellido` | `VARCHAR(50)` | NOT NULL |
| `Fecha_de_Nacimiento` | `DATE` | NOT NULL |
| `codigo_postal` | `INT` | FOREIGN KEY (`CIUDAD`), NOT NULL |
| `id_provincia` | `INT` | FOREIGN KEY (`CIUDAD`), NOT NULL |

### ESPECIALIDAD
| Columna | Tipo de dato | Restricciones / Claves |
| :--- | :--- | :--- |
| `ID_especialidad` | `INT` | PRIMARY KEY, NOT NULL |
| `Denominacion` | `VARCHAR(100)` | NOT NULL |

### MEDICO_ESPECIALIDAD
| Columna | Tipo de dato | Restricciones / Claves |
| :--- | :--- | :--- |
| `ID_medico` | `INT` | PRIMARY KEY (Compuesta), FOREIGN KEY (`MEDICO`), NOT NULL |
| `ID_especialidad` | `INT` | PRIMARY KEY (Compuesta), FOREIGN KEY (`ESPECIALIDAD`), NOT NULL |

### ATENCION
| Columna | Tipo de dato | Restricciones / Claves |
| :--- | :--- | :--- |
| `ID_atencion` | `INT` | PRIMARY KEY (Compuesta), NOT NULL |
| `Fecha` | `DATE` | NOT NULL |
| `ID_medico` | `INT` | PRIMARY KEY (Compuesta), FOREIGN KEY (`MEDICO_ESPECIALIDAD`), NOT NULL |
| `ID_especialidad` | `INT` | PRIMARY KEY (Compuesta), FOREIGN KEY (`MEDICO_ESPECIALIDAD`), NOT NULL |
| `ID_paciente` | `INT` | PRIMARY KEY (Compuesta), FOREIGN KEY (`PACIENTE`), NOT NULL |

### MEDICO_TELEFONO
| Columna | Tipo de dato | Restricciones / Claves |
| :--- | :--- | :--- |
| `Telefono` | `VARCHAR(20)` | PRIMARY KEY (Compuesta), NOT NULL |
| `ID_medico` | `INT` | PRIMARY KEY (Compuesta), FOREIGN KEY (`MEDICO`), NOT NULL |

### PACIENTE_TELEFONO
| Columna | Tipo de dato | Restricciones / Claves |
| :--- | :--- | :--- |
| `Telefono` | `VARCHAR(20)` | PRIMARY KEY (Compuesta), NOT NULL |
| `ID_paciente` | `INT` | PRIMARY KEY (Compuesta), FOREIGN KEY (`PACIENTE`), NOT NULL |

---

## 2. Script SQL Corregido

```sql
CREATE TABLE MEDICO
(
  ID_medico INT NOT NULL,
  Nombre VARCHAR(50) NOT NULL,
  Apellido VARCHAR(50) NOT NULL,
  PRIMARY KEY (ID_medico)
);

CREATE TABLE Provincia
(
  id_provincia INT NOT NULL,
  nombre_provincia VARCHAR(50) NOT NULL,
  PRIMARY KEY (id_provincia)
);

CREATE TABLE CIUDAD
(
  codigo_postal INT NOT NULL,
  nombre_ciudad VARCHAR(50) NOT NULL,
  id_provincia INT NOT NULL,
  PRIMARY KEY (codigo_postal, id_provincia),
  FOREIGN KEY (id_provincia) REFERENCES Provincia(id_provincia)
);

CREATE TABLE PACIENTE
(
  ID_paciente INT NOT NULL,
  Nombre VARCHAR(50) NOT NULL,
  Apellido VARCHAR(50) NOT NULL,
  Fecha_de_Nacimiento DATE NOT NULL,
  codigo_postal INT NOT NULL,
  id_provincia INT NOT NULL,
  PRIMARY KEY (ID_paciente),
  FOREIGN KEY (codigo_postal, id_provincia) REFERENCES CIUDAD(codigo_postal, id_provincia)
);

CREATE TABLE ESPECIALIDAD
(
  ID_especialidad INT NOT NULL,
  Denominacion VARCHAR(100) NOT NULL,
  PRIMARY KEY (ID_especialidad)
);

CREATE TABLE MEDICO_ESPECIALIDAD
(
  ID_medico INT NOT NULL,
  ID_especialidad INT NOT NULL,
  PRIMARY KEY (ID_medico, ID_especialidad),
  FOREIGN KEY (ID_medico) REFERENCES MEDICO(ID_medico),
  FOREIGN KEY (ID_especialidad) REFERENCES ESPECIALIDAD(ID_especialidad)
);

CREATE TABLE ATENCION
(
  ID_atencion INT NOT NULL,
  Fecha DATE NOT NULL,
  ID_medico INT NOT NULL,
  ID_especialidad INT NOT NULL,
  ID_paciente INT NOT NULL,
  PRIMARY KEY (ID_atencion, ID_medico, ID_especialidad, ID_paciente),
  FOREIGN KEY (ID_medico, ID_especialidad) REFERENCES MEDICO_ESPECIALIDAD(ID_medico, ID_especialidad),
  FOREIGN KEY (ID_paciente) REFERENCES PACIENTE(ID_paciente)
);

CREATE TABLE MEDICO_TELEFONO
(
  Telefono VARCHAR(20) NOT NULL,
  ID_medico INT NOT NULL,
  PRIMARY KEY (ID_medico, Telefono),
  FOREIGN KEY (ID_medico) REFERENCES MEDICO(ID_medico)
);

CREATE TABLE PACIENTE_TELEFONO
(
  Telefono VARCHAR(20) NOT NULL,
  ID_paciente INT NOT NULL,
  PRIMARY KEY (Telefono, ID_paciente),
  FOREIGN KEY (ID_paciente) REFERENCES PACIENTE(ID_paciente)
);
```

```