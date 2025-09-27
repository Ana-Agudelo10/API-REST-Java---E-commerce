# API REST Java - E-commerce

## Descripción del proyecto
Este proyecto consiste en una **API REST de comercio electrónico** construida con **Spring Boot**.  
A través de la API se gestionan las operaciones básicas de un e-commerce, incluyendo la administración de usuarios, productos, órdenes y detalles de compra.  

Se implementa un **CRUD completo** para las tablas principales de la base de datos `ecommerce`, permitiendo crear, listar, actualizar y eliminar registros.

---

## Flujo básico
1. El administrador puede gestionar los **usuarios** y **productos** de la tienda en línea.  
2. Un usuario registrado puede realizar una **orden** de compra.  
3. Cada orden contiene un conjunto de **detalles** que especifican los productos adquiridos.  
4. La API expone endpoints que permiten interactuar con el sistema desde Postman u otro cliente HTTP.  

---

## Objetivo de la actividad
El propósito de esta actividad es desarrollar el **API - REST** con Java y Spring Boot, brindando un conjunto de servicios relacionado al proyecto Ecommerce .

Para ello, se implementa:
- Un CRUD para las tablas más relevantes (**usuarios, productos, órdenes, detalles**).  
- Endpoints REST para consultar y administrar la información.  
- Conexión a base de datos **MySQL** mediante JPA/Hibernate.  

El desarrollo se fundamenta en los conocimientos adquiridos durante el proceso de formación, aplicando **buenas prácticas de arquitectura de software**.

---

## Herramientas utilizadas
- **Java** 17  
- **Spring Boot** 3.5.6  
- **Maven** (gestión de dependencias)  
- **MySQL Server** (XAMPP / phpMyAdmin para administración de BD)  
- **Postman** (para pruebas de la API)  

---

## Dependencias principales
-> `spring-boot-starter-web` → Para exponer la API REST  
- `spring-boot-starter-data-jpa` → Para persistencia con JPA/Hibernate  
- `mysql-connector-j` → Driver para conectar a MySQL  
- `spring-boot-devtools` → Herramienta de desarrollo (recarga automática)  
- `spring-boot-starter-test` → Dependencia para pruebas

## URLS PARA LA API:

-> GET http://localhost:8081/api/usuarios
-> GET http://localhost:8081/api/productos
-> GET http://localhost:8081/api/ordenes
-> GET http://localhost:8081/api/detalles

## Instrucciones de ejecución
1. Clonar el repositorio
2. Configurar la base de datos MySQL
3. Configurar las credenciales de conexión
4. Compilar y ejecutar la aplicación
5. Probar la API en Postman
