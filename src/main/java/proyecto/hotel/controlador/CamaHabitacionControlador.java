package proyecto.hotel.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import proyecto.hotel.entidades.*;
import proyecto.hotel.servicios.*;

import java.util.List;

@RestController
@RequestMapping("/api/cama-habitacion")
public class CamaHabitacionControlador {
    @Autowired
    private CamaHabitacionServicio servicio;

    @GetMapping
    public List<CamaHabitacion> obtenerTodos() {
        return servicio.obtenerTodos();
    }

    @GetMapping("/habitacion/{idHabitacion}")
    public List<CamaHabitacion> obtenerPorHabitacion(@PathVariable Integer idHabitacion) {
        return servicio.obtenerPorHabitacion(idHabitacion);
    }

    @PostMapping
    public CamaHabitacion guardar(@RequestBody CamaHabitacion obj) {
        return servicio.guardar(obj);
    }
}