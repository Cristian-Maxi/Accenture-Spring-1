# Accenture-Spring-1

Actividad número 1.

Usar este endpoint para testeo de endpoints mediante Swagger: http://localhost:8080/swagger-ui/index.html#/

![Controladores](https://github.com/user-attachments/assets/decb9e1e-c12c-4294-a137-bc2526aa2688)


<hr/>

# Documentación:

## http://localhost:8080/api/saludo
Este endpoint devuelve un 200 OK, con el saludo correspondiente, por lo que no se observa ningun problema tanto en Swagger como en Postman:

![SaludoOpenAPI](https://github.com/user-attachments/assets/2d48458c-9df0-4436-9ac4-0cf4534ecc54)


![SaludoPostman](https://github.com/user-attachments/assets/f1fd71ef-beba-44be-b270-b6176190786a)

<hr/>


## http://localhost:8080/api/saludoNombre/Cristian
Este endpoint devuelve un 200 OK, con el saludo correspondiente y el nombre "Cristian" que se pasa por @PathVariable, por lo que no se observa ningun problema tanto en Swagger como en Postman:

![SaludoNombreOpenAPI](https://github.com/user-attachments/assets/a3fc43da-396b-46b5-9a04-346cc5fe1b54)


![SaludoNombrePostman](https://github.com/user-attachments/assets/050909d4-51f3-4505-abd8-b0f656f6b786)

<hr/>


## http://localhost:8080/api/saludoNombreApellido?nombre=Cristian&apellido=Gomez
Este endpoint devuelve un 200 OK, con el saludo correspondiente, el nombre "Cristian" y el apellido "Gomez" que se pasa por @RequestParam, por lo que no se observa ningun problema tanto en Swagger como en Postman:

![SaludoNombreApellidoOpenAPI](https://github.com/user-attachments/assets/5b11922a-887c-47b4-a5f2-8c605ef1a304)


![SaludoNombreApellidoPostman](https://github.com/user-attachments/assets/8fa56095-7065-4853-92b2-77fd54d980b1)

<hr/>


## http://localhost:8080/api/enviarDatos
En este endpoint el usuario envia un objeto con datos 'DTO' con los campos nombre, apellido y pais. En este caso, el llamado fue exitoso con un 200 OK, por lo que se devuelve la misma información que ingresó en foramto JSON.

![EnviarDatosOpenAPI](https://github.com/user-attachments/assets/01ab1718-b20c-4798-8992-e5b0c94fcdbe)


![EnviarDatosPostman](https://github.com/user-attachments/assets/d1306445-56fb-4af6-96c3-4d20bc1d4c54)

