Conceptos teóricos: Conocimiento entre objetos, colaboradores, ventajas del ocultamiento de información
Consignas: En cada ejercicio deberá
a) Crear el código JAVA correspondiente a los diagramas de Clase.
b) Aunque no se indique explícitamente, debe implementar los constructores y accessors
c) Agregar documentación utilizando la herramienta provista por java (javadoc)
d) Crear una clase ejecutable, en la que se instancien varios objetos de las clases creadas y se utilicen los distintos
métodos para verificar su funcionamiento.
e) Para ejercitar el ingreso de datos:
o En el ejercicio 1 ingresar como constantes en el ejecutable
o En el ejercicio 2 ingresar como argumentos del método main().
o Ejercicios restantes: ingresar los datos por teclado, utilizando la clase Scanner
f) Implementar al menos 1 ejercicio con menú para selección de opciones

Para garantizar el dominio equivalente de los conceptos de **conocimiento entre objetos**, **colaboradores**, **instanciación compleja** y **ocultamiento de información**, los 12 ejercicios del Práctico N° 3 se estructuran en dos bloques de trabajo equilibrados en complejidad técnica y requisitos de implementación.

| Ejercicio | Integrante Asignado | Concepto Dominante de POO | Forma de Ingreso de Datos |
| --- | --- | --- | --- |
| **Ej. 1: Producto / Laboratorio** | Integrante 1 | Colaboración básica (1 a 1) y modificación de estado. | **Constantes** en el ejecutable. |
| **Ej. 2: Punto** | Integrante 2 | Paso de objetos colaboradores como parámetros (`distanciaA`). | **Argumentos `String[] args**` del `main()`. |
| **Ej. 3: Circulo / Punto** | Integrante 1 | Objetos compuestos + uso de números aleatorios (`Random`). | `Scanner` por teclado. |
| **Ej. 4: Rectangulo / Punto** | Integrante 2 | Objetos compuestos + traslación de colaborador `Punto`. | `Scanner` por teclado. |
| **Ej. 5: CuentaBancaria / Persona** | Integrante 2 | Colaboración de negocio y formato de salida tabulado. | `Scanner` por teclado. |
| **Ej. 6: Escuela / Docente** | Integrante 2 | Colaboración por recepción de parámetro en métodos de emisión. | `Scanner` por teclado. |
| **Ej. 7: CajaDeAhorro / CuentaCorriente** | Integrante 1 | Múltiples clases asociadas a `Persona` + Reglas de extracción. | `Scanner` con **Menú interactivo** (Consigna f). |
| **Ej. 8: Paciente / Localidad / Hospital** | Integrante 1 | **Doble asociación unidireccional** con la misma clase (`nacido` y `vive`). | `Scanner` por teclado. |
| **Ej. 9: Persona (Refactorización)** | Integrante 1 | Encapsulamiento de estructura (`Calendar` reemplaza a `int`). | `Scanner` por teclado. |
| **Ej. 10: Mujer / Hombre** | Integrante 2 | **Asociación bidireccional** (conocimiento mutuo 0..1). | `Scanner` con **Menú interactivo** (Consigna f). |
| **Ej. 11: Empleado (Refactorización)** | Integrante 2 | Encapsulamiento de estructura (`Calendar` reemplaza a `int`). | `Scanner` por teclado. |
| **Ej. 12: EmpleadoConJefe** | Integrante 1 | **Asociación reflexiva / Autoreferencia** (`jefe` de tipo `EmpleadoConJefe`). | `Scanner` por teclado. |

---

**Criterios de Paridad Aplicados en la Distribución**

* **Estrategias de Entrada (Consigna e):** El Integrante 1 resuelve el requerimiento de datos por constantes (Ej. 1), mientras que el Integrante 2 ejercita el paso por línea de comandos (Ej. 2). Ambos abordan la lectura mediante `Scanner` en los ejercicios restantes.
* **Interfaz de Usuario (Consigna f):** Se propone incorporar el menú de opciones interactivo con `do-whle` y `switch` en el Ejercicio 7 para el Integrante 1 (`GestionBancaria`), y en el Ejercicio 10 para el Integrante 2 (`RegistroCivil`), asegurando que ambos adquieran dicha práctica.
* **Encapsulamiento y Variación de Estructura (Tema 4):** La refactorización de atributos primarios a objetos `Calendar` manteniendo la interfaz invariable se reparte simétricamente entre el Ejercicio 9 (`Persona`) y el Ejercicio 11 (`Empleado`).
* **Complejidad de Conocimiento:** Se balancea la asociación de **doble conocimiento** (`Paciente` conoce 2 instancias de `Localidad`) y la **autoreferencia** (`EmpleadoConJefe`) asignadas al Integrante 1, con la **asociación bidireccional** (`Mujer` $\leftrightarrow$ `Hombre`) asignada al Integrante 2.
