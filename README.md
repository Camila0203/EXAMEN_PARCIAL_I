El Sistema de Gestión de Reservas de Hotel permite a los empleados de un hotel gestionar habitaciones, clientes, reservas y facturas de manera eficiente. El sistema está diseñado siguiendo los principios de la Programación Orientada a Objetos (POO) y ofrece una estructura clara para manejar diferentes operaciones, como la creación de nuevas reservas, el registro de habitaciones y clientes, y la generación de facturas.

Funcionalidades Principales

Gestión de Habitaciones:
Registro de nuevas habitaciones con atributos como número, tipo, precio por noche y estado.
Actualización del estado de las habitaciones (disponible, ocupada,etc

Gestión de Clientes:
Registro de nuevos clientes con un nombre y un ID único.
Seguimiento de las reservas y facturas

Gestión de Reservas:
Creación de nuevas reservas especificando la habitación, el cliente y las fechas de entrada y salida.
Cálculo automático del costo total de la reserva basado en el tiempo de estancia.

Gestión de Facturas:
Generación de facturas para los clientes basadas en sus reservas.
Visualización del monto total a pagar.

Consultas:
Consulta de la lista de habitaciones, reservas activas y facturas generadas.

Principios de POO Implementados

Encapsulamiento: Los datos y métodos de las clases están encapsulados, proporcionando métodos de acceso específicos.
Herencia: La clase Cliente hereda de la clase base Persona.
Polimorfismo y Abstracción: Se utilizan para manejar diferentes tipos de datos y operaciones.
Manejo de Excepciones
El sistema maneja errores comunes como intentar reservar una habitación que no está disponible o registrar una reserva con fechas inválidas mediante excepciones personalizadas como HabitacionNoDisponibleException y ClienteNoEncontradoException.
