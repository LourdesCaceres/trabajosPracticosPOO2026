Conceptos teóricos: Conocimiento entre objetos, colaboradores, ventajas del ocultamiento de información
Consignas: En cada ejercicio deberá
- a) Crear el código JAVA correspondiente a los diagramas de Clase.
- b) Aunque no se indique explícitamente, debe implementar los constructores y accessors
- c) Agregar documentación utilizando la herramienta provista por java (javadoc)
- d) Crear una clase ejecutable, en la que se instancien varios objetos de las clases creadas y se utilicen los distintos
métodos para verificar su funcionamiento.
- e) Para ejercitar el ingreso de datos:
- - En el ejercicio 1 ingresar como constantes en el ejecutable
  - En el ejercicio 2 ingresar como argumentos del método main().
  - Ejercicios restantes: ingresar los datos por teclado, utilizando la clase Scanner
- f) Implementar al menos 1 ejercicio con menú para selección de opciones

Para garantizar el dominio equivalente de los conceptos de _conocimiento entre objetos_, _colaboradores_, _instanciación compleja_ y _ocultamiento de información_, los 12 ejercicios del Práctico N° 3 se estructuran en dos bloques de trabajo equilibrados en complejidad técnica y requisitos de implementación.

| Ejercicio | Integrante Asignado | Concepto Dominante de POO | Forma de Ingreso de Datos |
| --- | --- | --- | --- |
| _Ej. 1: Producto / Laboratorio_ | Tobías  | Colaboración básica (1 a 1) y modificación de estado. | **Constantes** en el ejecutable. |
| _Ej. 2: Punto_ | Lourdes | Paso de objetos colaboradores como parámetros (`distanciaA`). | **Argumentos `String[] args**` del `main()`. |
| _Ej. 3: Circulo / Punto_ | Tobías | Objetos compuestos + uso de números aleatorios (`Random`). | `Scanner` por teclado. |
| _Ej. 4: Rectángulo / Punto_ | Lourdes | Objetos compuestos + traslación de colaborador `Punto`. | `Scanner` por teclado. |
| **Ej. 5: CuentaBancaria / Persona** | Lourdes | Colaboración de negocio y formato de salida tabulado. | `Scanner` por teclado. |
| **Ej. 6: Escuela / Docente** | Lourdes | Colaboración por recepción de parámetro en métodos de emisión. | `Scanner` por teclado. |
| **Ej. 7: CajaDeAhorro / CuentaCorriente** | Tobías | Múltiples clases asociadas a `Persona` + Reglas de extracción. | `Scanner` con **Menú interactivo** (Consigna f). |
| **Ej. 8: Paciente / Localidad / Hospital** | Tobías | **Doble asociación unidireccional** con la misma clase (`nacido` y `vive`). | `Scanner` por teclado. |
| **Ej. 9: Persona (Refactorización)** | Tobías | Encapsulamiento de estructura (`Calendar` reemplaza a `int`). | `Scanner` por teclado. |
| **Ej. 10: Mujer / Hombre** | Lourdes | **Asociación bidireccional** (conocimiento mutuo 0..1). | `Scanner` con **Menú interactivo** (Consigna f). |
| **Ej. 11: Empleado (Refactorización)** | Lourdes | Encapsulamiento de estructura (`Calendar` reemplaza a `int`). | `Scanner` por teclado. |
| **Ej. 12: EmpleadoConJefe** | Tobías | **Asociación reflexiva / Autoreferencia** (`jefe` de tipo `EmpleadoConJefe`). | `Scanner` por teclado. |

---

_*Criterios de Paridad Aplicados en la Distribución*_

- _Estrategias de Entrada (Consigna e):_ Tobías resuelve el requerimiento de datos por constantes (Ej. 1), mientras que Lourdes ejercita el paso por línea de comandos (Ej. 2). Ambos abordan la lectura mediante `Scanner` en los ejercicios restantes.
- _Interfaz de Usuario (Consigna f):_ Se propone incorporar el menú de opciones interactivo con `do-whle` y `switch` en el Ejercicio 7 para Tobías (`GestionBancaria`), y en el Ejercicio 10 para Lourdes (`RegistroCivil`), asegurando que ambos adquieran dicha práctica.
- _Encapsulamiento y Variación de Estructura (Tema 4):_ La refactorización de atributos primarios a objetos `Calendar` manteniendo la interfaz invariable se reparte simétricamente entre el Ejercicio 9 (`Persona`) y el Ejercicio 11 (`Empleado`).
- _Complejidad de Conocimiento:_ Se balancea la asociación de **doble conocimiento** (`Paciente` conoce 2 instancias de `Localidad`) y la _autoreferencia_ (`EmpleadoConJefe`) asignadas a Tobías, con la **asociación bidireccional** (`Mujer` $\leftrightarrow$ `Hombre`) asignada a Lourdes.
