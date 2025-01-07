package accenture.dtos;

import jakarta.validation.constraints.NotNull;

public record DatosRequest(
        @NotNull(message = "El nombre no debe ser nulo")
        String nombre,
        @NotNull(message = "El apellido no debe ser nulo")
        String apellido,
        @NotNull(message = "El pais no debe ser nulo")
        String pais
) {
}
