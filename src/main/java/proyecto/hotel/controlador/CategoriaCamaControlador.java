package proyecto.hotel.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import proyecto.hotel.entidades.CategoriaCama;
import proyecto.hotel.servicios.CategoriaCamaServicio;

import java.util.List;

@RestController
@RequestMapping("/api/categoria-camas")
public class CategoriaCamaControlador {

    @Autowired
    private CategoriaCamaServicio servicio;

    @GetMapping
    public List<CategoriaCama> obtenerTodas() {
        return servicio.obtenerTodas();
    }

    @GetMapping("/{id}")
    public CategoriaCama obtenerPorId(@PathVariable Integer id) {
        return servicio.obtenerPorId(id);
    }

    @PostMapping
    public CategoriaCama crear(@RequestBody CategoriaCama categoria) {
        return servicio.guardar(categoria);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Integer id) {
        servicio.eliminar(id);
    }
}
