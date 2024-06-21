package challenge.forohub.controller;

import challenge.forohub.model.DatosPerfil;
import challenge.forohub.model.Perfil;
import challenge.forohub.repository.PerfilRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Perfil")
public class PerfilController {
    @Autowired
    private PerfilRepository perfilRepository;

    @PostMapping
    public void registrarPerfil(@RequestBody @Valid DatosPerfil datosPerfil){
        perfilRepository.save(new Perfil(datosPerfil));
    }
}