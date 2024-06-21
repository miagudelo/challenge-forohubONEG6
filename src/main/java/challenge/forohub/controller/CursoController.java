package challenge.forohub.controller;

import challenge.forohub.model.Curso;
import challenge.forohub.model.DatosCurso;
import challenge.forohub.repository.CursoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/curso")
public class CursoController {
    @Autowired
    private CursoRepository cursoRepository;

    @PostMapping
    public void registrarCurso(@RequestBody @Valid DatosCurso datosCurso){
        cursoRepository.save(new Curso(datosCurso));
    }
}

