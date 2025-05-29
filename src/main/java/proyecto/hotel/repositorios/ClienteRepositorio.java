package proyecto.hotel.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import proyecto.hotel.entidades.Cliente;

public interface ClienteRepositorio extends JpaRepository<Cliente, Integer> {
}
