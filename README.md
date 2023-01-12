# Ordenes-Backend
Gestion de ordenes Altioracorp

# Comenzando 🚀

Estas instrucciones permitirán obtener una copia del proyecto en funcionamiento en su máquina local para propósitos de desarrollo y pruebas.
1. Clonar el repositorio

git clone https://github.com/DeyBaez/Ordenes-Backend.git

2. Cambiarse a la rama master

git checkout master

# Pre-requisitos 📋

1. Crear una base datos PostgreSQL, con el nombre ordenes

create database ordenes

2. En el archivo applicaction.properties modificar las credendiales de la Base de Datos y tener disponible puerto 9003 que es donde correrá el Backend

spring.datasource.url=jdbc:postgresql://localhost:5433/ordenes

spring.datasource.username=postgres

spring.datasource.password=postgres

spring.jpa.hibernate.ddl-auto=update

server.port=9003

3. Tener instalado Apache NetBeans 16
4. Tener instalado java JDK 11
5. Decargar las dependencias que se encuentran en el pom.xml, esto se realiza haciendo Update Project
6. Ejecutar el proyecto
