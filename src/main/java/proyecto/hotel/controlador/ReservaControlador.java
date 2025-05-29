package proyecto.hotel.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import proyecto.hotel.entidades.Reserva;
import proyecto.hotel.servicios.ReservaServicio;

import java.util.List;

@RestController
@RequestMapping("/api/reservas")
public class ReservaControlador {

    @Autowired
    private ReservaServicio servicio;

    @GetMapping
    public List<Reserva> obtenerTodas() {
        return servicio.obtenerTodas();
    }

    @GetMapping("/{id}")
    public Reserva obtenerPorId(@PathVariable Long id) {
        return servicio.obtenerPorId(id);
    }

    @PostMapping
    public Reserva crear(@RequestBody Reserva reserva) {
        return servicio.guardar(reserva);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        servicio.eliminarPorId(id);
    }
}
