package challenge.forohub.repository;

import challenge.forohub.usuarios.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository <Usuario, Long>{
    Optional<Usuario> findByNombre(String nombre);

    UserDetails findUserDetailsByNombre(String nombre);
}
