package proyecto.hotel.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import proyecto.hotel.entidades.*;

public interface CamaHabitacionRepositorio extends JpaRepository<CamaHabitacion, CamaHabitacionId> {
}