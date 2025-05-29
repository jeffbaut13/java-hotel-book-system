package proyecto.hotel.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import proyecto.hotel.entidades.Reserva;

public interface ReservaRepositorio extends JpaRepository<Reserva, Long> {
}
