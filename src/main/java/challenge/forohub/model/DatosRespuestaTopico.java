package challenge.forohub.model;

import challenge.forohub.topico.Estado;

public record DatosRespuestaTopico(Long id,
                                   String titulo,
                                   String mensaje,
                                   java.sql.Timestamp fechaCreacion,
                                   Estado estado,
                                   String nombreUsuario,
                                   String nombreCurso) {
}
