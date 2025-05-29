package proyecto.hotel.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import proyecto.hotel.entidades.*;

public interface CategoriaHabitacionRepositorio extends JpaRepository<CategoriaHabitacion, Integer> {}