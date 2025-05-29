package proyecto.hotel.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import proyecto.hotel.entidades.Cama;
import proyecto.hotel.servicios.CamaServicio;

import java.util.List;

@RestController
@RequestMapping("/api/camas")
public class CamaControlador {

    @Autowired
    private CamaServicio servicio;

    @GetMapping
    public List<Cama> obtenerTodas() {
        return servicio.obtenerTodas();
    }

    @GetMapping("/{id}")
    public Cama obtenerPorId(@PathVariable Integer id) {
        return servicio.obtenerPorId(id);
    }

    @PostMapping
    public Cama crear(@RequestBody Cama cama) {
        return servicio.guardar(cama);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Integer id) {
        servicio.eliminar(id);
    }
}
