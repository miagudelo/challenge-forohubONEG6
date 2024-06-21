package challenge.forohub.controller;

import challenge.forohub.model.Curso;
import challenge.forohub.model.DatosCurso;
import challenge.forohub.model.DatosRespuesta;
import challenge.forohub.model.Respuesta;
import challenge.forohub.repository.CursoRepository;
import challenge.forohub.repository.RespuestaRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/respuesta")
public class RespuestaController {
    @Autowired
    private RespuestaRepository respuestaRepository;

    @PostMapping
    public void registrarRespuesta(@RequestBody @Valid DatosRespuesta datosRespuesta){
        respuestaRepository.save(new Respuesta(datosRespuesta));
    }
}