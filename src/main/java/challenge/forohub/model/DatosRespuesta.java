package challenge.forohub.model;

import challenge.forohub.topico.Topico;
import challenge.forohub.usuarios.Usuario;

public record DatosRespuesta(String mensaje, Topico topico, String fechaCreacion, Usuario usuario, Solucion solucion) {
}
