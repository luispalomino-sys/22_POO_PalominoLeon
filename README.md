# Proyecto de Gestión de Cuyes - JavaFX + MySQL

Aplicación de escritorio desarrollada en **Java 17** implementando el patrón de diseño **MVC (Modelo - Vista - Controlador)** para la gestión y visualización de datos desde una base de datos MySQL.

## 🛠️ Tecnologías Utilizadas

* **Lenguaje:** Java 17
* **Framework GUI:** JavaFX
* **Base de Datos:** MySQL (Docker)
* **Gestor de Dependencias:** Maven
* **Patrón de Arquitectura:** MVC (Model - View - Controller / DAO)

## 📁 Estructura del Proyecto

* `model/`: Contiene la clase `Cuy.java` (Entidad).
* `dao/`: Contiene la clase de conexión a la base de datos `Conexion.java` y `CuyDAO.java` para el acceso a datos.
* `controller/`: Contiene `CuyController.java` encargada de gestionar la lógica entre la vista y el modelo.
* `views/`: Contiene la vista con el componente `TableView` para listar la información.

## 🗄️ Base de Datos

* **Nombre de la BD:** `bd_proyectocuy`
* **Tabla:** `cuyes`
* **Campos:** `id_cuy`, `raza`, `sexo`, `peso_kg`, `estado`

## 🚀 Instrucciones de Ejecución

1. Clonar el repositorio.
2. Levantar la base de datos MySQL en el puerto `3307` y ejecutar el script de creación del esquema `bd_proyectocuy`.
3. Ejecutar el proyecto mediante Maven:
   ```bash
   mvn clean javafx:run