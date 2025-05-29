package proyecto.hotel.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import proyecto.hotel.entidades.Factura;
import proyecto.hotel.repositorios.FacturaRepositorio;

import java.util.List;

@Service
public class FacturaServicio {

    @Autowired
    private FacturaRepositorio facturaRepositorio;

    public List<Factura> obtenerTodas() {
        return facturaRepositorio.findAll();
    }

    public Factura guardar(Factura factura) {
        return facturaRepositorio.save(factura);
    }

    public void eliminarPorId(Long id) {
        facturaRepositorio.deleteById(id);
    }

    public Factura obtenerPorId(Long id) {
        return facturaRepositorio.findById(id).orElse(null);
    }
}
