# Product Backend API

API REST desarrollada con Spring Boot para la gestión de productos.

## Tecnologías

- **Java 21**
- **Spring Boot 3.5.7**
- **Spring Data JPA**
- **PostgreSQL**
- **Hibernate**

## Requisitos Previos

- Java 21 o superior
- Maven 3.6+
- PostgreSQL 12+ instalado y corriendo
- Base de datos `product_db_g6` creada

## Configuración

### Base de Datos

1. Asegúrate de que PostgreSQL esté corriendo en el puerto 5432
2. Crea la base de datos:
   ```sql
   CREATE DATABASE product_db_g6;
   ```

### Configuración de la Aplicación

La configuración de la base de datos se encuentra en `src/main/resources/application.properties`:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/product_db_g6
spring.datasource.username=postgres
spring.datasource.password=1004682068
```

## Ejecución

### Usando Maven Wrapper

```bash
./mvnw spring-boot:run
```

### Usando Maven

```bash
mvn spring-boot:run
```

### Compilar y Ejecutar

```bash
mvn clean package
java -jar target/product-backend-0.0.1-SNAPSHOT.jar
```

La aplicación se ejecutará en `http://localhost:8081`

## Endpoints API

### Obtener todos los productos
```
GET /api/productos
```

### Obtener un producto por ID
```
GET /api/productos/{id}
```

### Crear un producto
```
POST /api/productos
Content-Type: application/json

{
  "nombre": "Producto Ejemplo",
  "precio": 99.99
}
```

### Actualizar un producto
```
PUT /api/productos/{id}
Content-Type: application/json

{
  "nombre": "Producto Actualizado",
  "precio": 149.99
}
```

### Eliminar un producto
```
DELETE /api/productos/{id}
```

## Estructura del Proyecto

```
src/main/java/com/devsenior/caren/product_backend/
├── config/
│   └── DatabaseConnectionVerifier.java    # Verificador de conexión
├── controller/
│   └── ProductoController.java            # Controlador REST
├── entity/
│   └── Producto.java                     # Entidad JPA
├── repository/
│   └── ProductoRepository.java            # Repositorio Spring Data JPA
├── service/
│   └── ProductoService.java               # Lógica de negocio
└── ProductBackendApplication.java         # Clase principal
```

## Características

- ✅ Creación automática de tablas con Hibernate
- ✅ Visualización de consultas SQL en consola
- ✅ Validación de conexión a base de datos al iniciar
- ✅ API REST completa con operaciones CRUD
- ✅ Manejo de respuestas HTTP apropiadas

## Modelo de Datos

### Producto

| Campo | Tipo    | Descripción           |
|-------|---------|-----------------------|
| id    | Long    | ID autogenerado       |
| nombre| String  | Nombre del producto   |
| precio| Double  | Precio del producto   |

## Desarrollo

### Compilar

```bash
mvn clean compile
```

### Ejecutar Tests

```bash
mvn test
```

### Empaquetar

```bash
mvn clean package
```

## Autor

Desarrollado por DevSenior Caren

