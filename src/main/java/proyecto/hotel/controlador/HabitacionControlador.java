package proyecto.hotel.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import proyecto.hotel.entidades.*;
import proyecto.hotel.servicios.*;

import java.util.List;

@RestController
@RequestMapping("/api/habitaciones")
public class HabitacionControlador {
  @Autowired
  private HabitacionServicio servicio;

  @GetMapping
  public List<Habitacion> obtenerTodos() {
    return servicio.obtenerTodos();
  }

  @PostMapping
  public Habitacion guardar(@RequestBody Habitacion obj) {
    return servicio.guardar(obj);
  }
}
