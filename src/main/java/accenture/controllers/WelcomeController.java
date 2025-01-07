package accenture.controllers;

import accenture.dtos.DatosRequest;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class WelcomeController {

    //Swagger endpoint : http://localhost:8080/swagger-ui/index.html#/

    @GetMapping("/saludo")
    @Operation(summary = "Este endpoint devuelve un saludo",description = "Mandará un mensaje al usuario")
    public ResponseEntity<String> saludo() {
        return ResponseEntity.ok("Bienvenido a mi Página");
    }

    @GetMapping("/saludoNombre/{nombre}")
    @Operation(summary = "Este Endpoint devuelve un nombre el cual es pasado por con un path variable", description = "Recibe un nombre y devuelve un saludo con nombre")
    public ResponseEntity<String> saludoConNombre(@PathVariable String nombre) {
        return new ResponseEntity<>("Bienvenido " + nombre, HttpStatus.OK);
    }

    @GetMapping("/saludoNombreApellido")
    @Operation(summary = "Este Endpoint devuelve un nombre y apellido los cuales son pasados por query params", description = "Recibe un nombre y apellido y los devuelve en un saludo")
    public ResponseEntity<String> saludoNombreApellido(@RequestParam String nombre, String apellido) {
        return new ResponseEntity<>("Bienvenido " + nombre + " " + apellido, HttpStatus.OK);
    }

    @PostMapping("/enviarDatos")
    @Operation(summary = "En este endpoint el usuario envia un objeto con datos 'DTO' y luego se los devuelve", description = "Recibe datos y devuelve estos datos en un JSON")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Datos recibidos exitosamente."),
            @ApiResponse(responseCode = "400", description = "Error en el envio de datos")
    })
    public ResponseEntity<DatosRequest> enviarDatos(@Valid @RequestBody DatosRequest datosRequest) {
        return new ResponseEntity<>(datosRequest, HttpStatus.OK);
    }

}
