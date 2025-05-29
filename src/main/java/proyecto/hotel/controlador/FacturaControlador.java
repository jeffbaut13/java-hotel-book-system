package proyecto.hotel.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import proyecto.hotel.entidades.Factura;
import proyecto.hotel.servicios.FacturaServicio;

import java.util.List;

@RestController
@RequestMapping("/api/facturas")
public class FacturaControlador {

    @Autowired
    private FacturaServicio servicio;

    @GetMapping
    public List<Factura> obtenerTodas() {
        return servicio.obtenerTodas();
    }

    @GetMapping("/{id}")
    public Factura obtenerPorId(@PathVariable Long id) {
        return servicio.obtenerPorId(id);
    }

    @PostMapping
    public Factura crear(@RequestBody Factura factura) {
        return servicio.guardar(factura);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        servicio.eliminarPorId(id);
    }
}
