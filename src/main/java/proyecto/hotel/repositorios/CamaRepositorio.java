package proyecto.hotel.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import proyecto.hotel.entidades.Cama;

public interface CamaRepositorio extends JpaRepository<Cama, Integer> {}
