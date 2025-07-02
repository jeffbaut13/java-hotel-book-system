package proyecto.hotel.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import proyecto.hotel.entidades.*;

import java.util.List;

public interface CamaHabitacionRepositorio extends JpaRepository<CamaHabitacion, CamaHabitacionId> {
    List<CamaHabitacion> findByIdHabitacion(Integer idHabitacion);
}