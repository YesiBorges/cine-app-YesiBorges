[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/wa4vvGtc)
# 🏁 Desafío

### **Instrucciones para el Ejercicio "CineDescuentos":**

1. **Abrir IntelliJ IDEA:**
    - Abre tu entorno de desarrollo IntelliJ IDEA.
2. **Crear Proyecto:**
    - Crea un nuevo proyecto llamado "CineDescuentos".
3. **Crear Clase "CineApp":**
    - Dentro del proyecto, crea una nueva clase llamada **`CineApp`**.
4. **Implementar Código de la Aplicación del Cine:**
    - En la clase **`CineApp`**, escribe el código para determinar el precio del boleto según la edad del cliente.
    - Pide al usuario que ingrese su edad.
    - Utiliza estructuras condicionales (**`if`**, **`else if`**, **`else`**) para evaluar la edad y determinar el precio del boleto según las siguientes condiciones:
        - "3.500$" como valor normal.
        - "60% de descuento" para edades por debajo de 5 años.
        - "55% de descuento" para edades mayores a 60 años.
    - Imprime el precio del boleto correspondiente.
5. **Manejo de Entrada Inválida:**
    - Agrega validación para manejar el caso en que el usuario ingrese una edad negativa o fuera del rango razonable.
    - Muestra un mensaje indicando que la entrada es inválida en estos casos.
6. **Desafío adicional, funcionalidades extra**:
    - **Implementar Descuento por Cantidad de Boletos:**
        - Dentro de la clase **`CineApp`**, agrega la funcionalidad adicional para preguntar a los compradores de boletos normales cuántos boletos desean comprar.
        - Después de obtener la edad del cliente, agrega una nueva solicitud para ingresar la cantidad de boletos deseados.
        - Utiliza una nueva condición para aplicar un descuento del 30% si la cantidad de boletos es igual o superior a dos.
    - **Actualizar Cálculo de Precio del Boleto:**
        - Ajusta el cálculo del precio del boleto para incluir el descuento por cantidad de boletos si se cumple la condición.
