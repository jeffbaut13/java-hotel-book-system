package proyecto.hotel.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import proyecto.hotel.dto.ReservaVisitanteRequest;
import proyecto.hotel.entidades.ReservaVisitante;
import proyecto.hotel.servicios.ReservaVisitanteServicio;

import java.util.List;

@RestController
@RequestMapping("/api/reserva-visitantes")
public class ReservaVisitanteControlador {

    @Autowired
    private ReservaVisitanteServicio servicio;

    @PostMapping
    public List<ReservaVisitante> crear(@RequestBody ReservaVisitanteRequest request) {
        if (request.getVisitantes() == null || request.getReserva() == null) {
            throw new IllegalArgumentException("Formato JSON inválido para visitante(s).");
        }
        return servicio.guardarMultiple(request);
    }

    @GetMapping
    public List<ReservaVisitante> obtenerTodos() {
        return servicio.obtenerTodos();
    }
}
