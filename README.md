# Llanquihue Tour - Sistema de Gestión

## Descripción del Sistema
Este proyecto es un sistema de gestión desarrollado en Java para la empresa "Llanquihue Tour". Permite el registro y administración de diferentes entidades involucradas en el turismo (Guías Turísticos, Empleados y Turistas). El sistema aplica los principios fundamentales de la Programación Orientada a Objetos (POO), incluyendo herencia, polimorfismo, interfaces y encapsulamiento, además de contar con una interfaz gráfica básica mediante la biblioteca `javax.swing`.

## Resumen de Clases y Arquitectura
El código está estructurado bajo un patrón de diseño de alta cohesión, dividido en los siguientes paquetes:

### Paquete `model`
*   **`Registrable` (Interfaz):** Define el contrato principal del sistema, obligando a implementar el método `mostrarResumen()`.
*   **`Persona` (Clase Abstracta):** Superclase base que implementa `Registrable`. Contiene atributos comunes como `nombre` y `rut`.
*   **`GuiaTuristico`, `Empleado`, `Turista` (Subclases):** Clases concretas que heredan de `Persona` y definen atributos específicos (ej. `especialidad`, `cargo`, `paisOrigen`). Sobreescriben el método `mostrarResumen()` con sus propios datos.

### Paquete `llanquihuetourf.data`
*   **`GestorEntidades`:** Motor lógico del sistema. Utiliza una colección genérica (`ArrayList<Registrable>`) para almacenar las entidades. Procesa los datos iterativamente aplicando polimorfismo y utiliza el escáner de seguridad `instanceof` para aplicar reglas de negocio específicas (ej. bonos para guías).

### Paquete `llanquihuetourf.ui`
*   **`VentanaPrincipal`:** Interfaz gráfica del programa. Utiliza `JOptionPane` para interactuar con el usuario, permitiendo el ingreso dinámico de datos y visualizando los resultados de los registros.

### Paquete `llanquihuetourf.app`
*   **`App`:** Clase principal que contiene el método `main`. Actúa como el punto de entrada para instanciar la ventana gráfica e iniciar la ejecución del sistema.

---

## Instrucciones para Clonar y Ejecutar el Proyecto

### Requisitos Previos
*   Tener instalado **Java Development Kit (JDK)** (versión 8 o superior).
*   Un IDE compatible para desarrollo en Java (se recomienda **Apache NetBeans**).
*   **Git** instalado en el equipo.

### Pasos para clonar el repositorio
1. Abre tu terminal o línea de comandos (CMD, PowerShell o Git Bash).
2. Ejecuta el siguiente comando para clonar el proyecto en tu máquina local:
   ```bash
   git clone [https://github.com/chriaraya/Llanquihue-Tourchriaraya]
