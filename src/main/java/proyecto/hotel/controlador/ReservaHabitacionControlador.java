package proyecto.hotel.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import proyecto.hotel.entidades.*;
import proyecto.hotel.servicios.*;

import java.util.List;

@RestController
@RequestMapping("/api/reserva-habitacion")
public class ReservaHabitacionControlador {
  @Autowired
  private ReservaHabitacionServicio servicio;

  @GetMapping
  public List<ReservaHabitacion> obtenerTodos() {
    return servicio.obtenerTodos();
  }

  @PostMapping
  public ReservaHabitacion guardar(@RequestBody ReservaHabitacion obj) {
    return servicio.guardar(obj);
  }
}
