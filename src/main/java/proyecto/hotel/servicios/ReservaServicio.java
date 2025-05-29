package proyecto.hotel.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import proyecto.hotel.entidades.Reserva;
import proyecto.hotel.entidades.Cliente;
import proyecto.hotel.entidades.Factura;
import proyecto.hotel.repositorios.ReservaRepositorio;
import proyecto.hotel.repositorios.ClienteRepositorio;
import proyecto.hotel.repositorios.FacturaRepositorio;

import java.util.List;

@Service
public class ReservaServicio {

    @Autowired
    private ReservaRepositorio reservaRepositorio;

    @Autowired
    private ClienteRepositorio clienteRepositorio;

    @Autowired
    private FacturaRepositorio facturaRepositorio;

    public List<Reserva> obtenerTodas() {
        return reservaRepositorio.findAll();
    }

    public Reserva obtenerPorId(Long id) {
        return reservaRepositorio.findById(id).orElse(null);
    }

    public Reserva guardar(Reserva reserva) {
        // Validación: cliente obligatorio
        Cliente cliente = clienteRepositorio.findById(reserva.getCliente().getCedula())
                .orElseThrow(() -> new RuntimeException("Cliente no encontrado con cédula: " + reserva.getCliente().getCedula()));

        // Validación: factura obligatoria
        Factura factura = facturaRepositorio.findById(reserva.getFactura().getIdFactura())
                .orElseThrow(() -> new RuntimeException("Factura no encontrada con ID: " + reserva.getFactura().getIdFactura()));

        reserva.setCliente(cliente);
        reserva.setFactura(factura);

        return reservaRepositorio.save(reserva);
    }

    public void eliminarPorId(Long id) {
        reservaRepositorio.deleteById(id);
    }
}
