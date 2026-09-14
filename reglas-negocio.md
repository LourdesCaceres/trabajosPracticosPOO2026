# ****REGLAS DE NEGOCIO**** 

### ****_Explícitas_****

****RN.01:**** Un vendedor puede realizar muchas ventas. Cada venta es realizada por un único vendedor.

****RN.02:**** Un producto puede ser provisto por uno o varios proveedores, y un proveedor puede suministrar uno o varios productos.

****RN.03:**** Toda persona registrada debe ser cliente o vendedor. Una misma persona no puede desempeñar ambos roles a la vez.

****RN.04:**** Cada venta tiene asignada un único medio de pago. Un medio de pago puede utilizarse en varias ventas.

****RN.05:**** Un producto pertenece a una única categoría. Cada categoría posee muchos productos.

****RN.06:**** Un cliente puede realizar ninguna, una o varias compras. Cada venta corresponde a un único cliente.

****RN.07:**** Cada venta se compone de uno o varios renglones de detalle, cada uno asociado a un único producto, con su cantidad y precio unitario.

****RN.08:**** No se admite combinar más de un medio de pago en una misma venta (pago simple, no dividido).

****RN.09:**** El precio unitario registrado en cada renglón de venta es el vigente al momento de la operación y permanece fijo en el comprobante, independientemente de futuras modificaciones al precio de lista del producto.

### ****_Implícitas_****

****RN.10:**** Al confirmarse una venta, el sistema descuenta automáticamente del stock la cantidad vendida de cada producto.

****RN.11:**** No se permite confirmar una venta si la cantidad solicitada de un producto supera el stock disponible.

****RN.12:**** El interés del medio de pago es un atributo calculado en función de la cantidad de cuotas (1, 3 o 6) aplicadas sobre el monto de la venta.
