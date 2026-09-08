# Falabella Store - App de Escritorio

Aplicación de escritorio desarrollada para la asignatura de POO, replicando la interfaz de usuario diseñada en Figma.

## 🛠️ Tecnologías Utilizadas
* **Lenguaje:** Java 21
* **Framework GUI:** JavaFX 21.0.6
* **Gestor de Dependencias:** Maven 3.13

## 📐 Arquitectura del Proyecto (MVC)
El proyecto utiliza el patrón de diseño **Modelo-Vista-Controlador** con maquetación 100% por código Java:

* `src/main/java/vallegrande/edu/pe/falabellastore/Launcher.java`: Clase principal y punto de entrada.
* `src/main/java/vallegrande/edu/pe/falabellastore/controller/FalabellaController.java`: Controlador y construcción dinámica de la vista gráfica.

## 🚀 Instalación y Ejecución
1. Clonar el repositorio.
2. Abrir el proyecto en IntelliJ IDEA.
3. Asegurarse de tener configurado el **JDK 21** en la estructura del proyecto.
4. Ejecutar la clase `Launcher.java`.