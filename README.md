# Challenger - Foro Hub

Esta aplicacion corresponde al desarrollo del Challenge 3 de la especializacion en BACK END en el programa de Alura Latam ONEG6, que consiste en desarrollar una API para un Foro donde es posible realizar las operaciones del CRUD (Crear, Listar, Actualizar y Eliminar) con tópicos

## Comenzando 🚀

Para obtener una copia del proyecto y probarlo, debes hacer clic en enlace del repositorio: https://github.com/miagudelo/challenge-forohubONEG6  - luego debes hacer clic en el boton verde de la parte superior derecha que dice "<> Code", luego haz clic en la ultima opcion "Download Zip" para descargar los archivos, despues los debes descomprimir y abrir el proyecto desde el IDE Intellig para luego ejecutarlo desde la clase llamada ForohubApplication.

### Pre-requisitos 📋

- Tener instalado el JDK Java 17 en adelante
- Tener instalado el IDE IntelliJ IDEA
- Maven (Initializr utiliza la versión 4)
- Spring Boot (versión 3.2.3)
- MySQL
- Crear base de datos en MySQL llamada forohub

  ## Imágenes del Proyecto

### Ejecución de la aplicación en Intellij
![forohub](https://i.postimg.cc/tTbMQjJY/Ejecucion-Aplicacion.png)

### En la aplicación para ejecutar los distintos métodos del CRUD es necesario autenticarse a través de un Json Web Tokens, la cual se genera a través del endpoint "http://localhost:8080/login" 
![forohub](https://i.postimg.cc/zGSDYJXg/solicitud-token-para-endpoints.png)

### Registro de un tópico usando Swagger
![forohub](https://i.postimg.cc/8Cv55qGR/registrar-topico.png)

### Obtener Listado de tópicos usando Swagger
![forohub](https://i.postimg.cc/y627JLfn/obtener-listado-topicos.png)

### Obtener Información de un tópico por su Id usando Swagger
![forohub](https://i.postimg.cc/XYC3cdP3/obtener-topicopor-id.png)

### Actualizar un tópico usando Swagger
![forohub](https://i.postimg.cc/rmLPXtg1/Actualizar-topico.png)

### Eliminar un tópico usando Swagger
![forohub](https://i.postimg.cc/tRB2Df0t/eliminar-topico.png)


### Aplicacion Construida en JAVA, usando:

- Lombok
- JDK 17.
- Maven.
- Spring Web
- Spring Boot.
- MySQL.
- Spring Data JPA.
- Flyway Migration
- Validation
- Spring Security - Auth0 para la creación de JWT.
  ###

  #### Pruebas con Insomnia
![challenge-literalura](https://i.postimg.cc/bNSHT5YM/Request-insomnia.png)
  
  ###
  #### Documentación con Swagger
![challenge-literalura](https://i.postimg.cc/K8FQJyqz/documentar-swagger.png)

## Autor ✒️

Marta Isabel Agudelo Restrepo
