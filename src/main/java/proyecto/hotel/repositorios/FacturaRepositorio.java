package proyecto.hotel.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import proyecto.hotel.entidades.Factura;

public interface FacturaRepositorio extends JpaRepository<Factura, Long> {
}
