package proyecto.hotel.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import proyecto.hotel.entidades.ReservaVisitante;
import proyecto.hotel.entidades.ReservaVisitanteId;

public interface ReservaVisitanteRepositorio extends JpaRepository<ReservaVisitante, ReservaVisitanteId> {
}
