package challenge.forohub.model;

import challenge.forohub.usuarios.Usuario;
import jakarta.validation.constraints.NotNull;

public record DatosActualizarTopico(@NotNull Long id, String titulo, String mensaje, Usuario usuario, Curso curso) {
}
