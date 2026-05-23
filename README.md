# InkuManga API REST

Proyecto académico desarrollado con Spring Boot para la gestión de mangas, autores, usuarios y reseñas.

La aplicación implementa una arquitectura por capas utilizando Spring Boot + JPA + MySQL, permitiendo realizar operaciones CRUD mediante endpoints REST.

---

# Tecnologías utilizadas

* Java 17
* Spring Boot
* Spring Web MVC
* Spring Data JPA
* Spring Validation
* MySQL
* Lombok
* Maven
* WebFlux

---

# Arquitectura del proyecto

El proyecto está organizado siguiendo una arquitectura por capas:

```bash
src/main/java/com/duoc/inkumanga
│
├── controller     → Endpoints REST
├── service        → Lógica de negocio
├── repository     → Acceso a datos con JPA
├── model          → Entidades de la base de datos
├── dto            → Objetos de transferencia de datos
├── exception      → Manejo global de errores
└── config         → Configuraciones del sistema
```

---

# Requisitos

Antes de ejecutar el proyecto necesitas tener instalado:

* Java 17
* Maven
* MySQL Server
* IDE compatible (IntelliJ, VS Code, Eclipse o Spring Tool Suite)

---

# Configuración de la base de datos

Crear una base de datos en MySQL:

```sql
CREATE DATABASE inkumanga;
```

Configurar el archivo:

```properties
src/main/resources/application.properties
```

Ejemplo:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/inkumanga
spring.datasource.username=root
spring.datasource.password=

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
```

---

#  Ejecución del proyecto

## Desde terminal

```bash
mvn spring-boot:run
```

## Desde el IDE

Ejecutar la clase:

```bash
InkumangaApplication.java
```

---

# URL base

```bash
http://localhost:8080
```

---

# Endpoints principales

## Usuarios

| Método | Endpoint       | Descripción           |
| ------ | -------------- | --------------------- |
| GET    | /usuarios      | Listar usuarios       |
| GET    | /usuarios/{id} | Buscar usuario por ID |
| POST   | /usuarios      | Crear usuario         |
| PUT    | /usuarios/{id} | Actualizar usuario    |
| DELETE | /usuarios/{id} | Eliminar usuario      |

---

## Autores

| Método | Endpoint      | Descripción      |
| ------ | ------------- | ---------------- |
| GET    | /autores      | Listar autores   |
| GET    | /autores/{id} | Buscar autor     |
| POST   | /autores      | Crear autor      |
| PUT    | /autores/{id} | Actualizar autor |
| DELETE | /autores/{id} | Eliminar autor   |

---

## Mangas

| Método | Endpoint     | Descripción      |
| ------ | ------------ | ---------------- |
| GET    | /mangas      | Listar mangas    |
| GET    | /mangas/{id} | Buscar manga     |
| POST   | /mangas      | Crear manga      |
| PUT    | /mangas/{id} | Actualizar manga |
| DELETE | /mangas/{id} | Eliminar manga   |

---

## Reseñas

| Método | Endpoint      | Descripción       |
| ------ | ------------- | ----------------- |
| GET    | /resenas      | Listar reseñas    |
| GET    | /resenas/{id} | Buscar reseña     |
| POST   | /resenas      | Crear reseña      |
| PUT    | /resenas/{id} | Actualizar reseña |
| DELETE | /resenas/{id} | Eliminar reseña   |

---

# Integración API Externa

El proyecto incluye integración con la API de Jikan para obtener información de mangas.

Controlador:

```bash
JikanController
```

Servicio:

```bash
JikanService
```

---

# Colección Postman

Dentro del proyecto existe una colección de Postman:

```bash
/postman/InkuManga.postman_collection.json
```

Puedes importarla para probar todos los endpoints.

---

# Dependencias principales

```xml
spring-boot-starter-data-jpa
spring-boot-starter-webmvc
spring-boot-starter-validation
mysql-connector-j
lombok
```

---

# Funcionalidades implementadas

 CRUD de mangas

 CRUD de autores

 CRUD de usuarios

 CRUD de reseñas

 Validaciones con Spring Validation

 Manejo global de excepciones

 Arquitectura por capas

 Integración con API externa

---

# Ejemplo JSON

## Crear manga

```json
{
  "titulo": "One Piece",
  "genero": "Shonen",
  "estado": "En emisión"
}
```

---

# Objetivo del proyecto

El objetivo de este proyecto es practicar:

* Desarrollo de APIs REST
* Arquitectura en capas
* Persistencia con JPA/Hibernate
* Validaciones
* Integración con APIs externas
* Buenas prácticas en Spring Boot