package proyecto.hotel.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import proyecto.hotel.entidades.Visitante;

public interface VisitanteRepositorio extends JpaRepository<Visitante, Integer> {
}
