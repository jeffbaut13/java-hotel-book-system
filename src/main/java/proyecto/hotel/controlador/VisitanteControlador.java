package proyecto.hotel.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import proyecto.hotel.entidades.Visitante;
import proyecto.hotel.servicios.VisitanteServicio;

import java.util.List;

@RestController
@RequestMapping("/api/visitantes")
public class VisitanteControlador {

    @Autowired
    private VisitanteServicio servicio;

    @GetMapping
    public List<Visitante> obtenerTodos() {
        return servicio.obtenerTodos();
    }

    @GetMapping("/{id}")
    public Visitante obtenerPorId(@PathVariable Integer id) {
        return servicio.obtenerPorId(id);
    }

    @PostMapping
    public Visitante crear(@RequestBody Visitante visitante) {
        return servicio.guardar(visitante);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Integer id) {
        servicio.eliminarPorId(id);
    }
}
