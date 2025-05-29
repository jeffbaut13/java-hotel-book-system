package proyecto.hotel.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import proyecto.hotel.entidades.*;
import proyecto.hotel.servicios.*;

import java.util.List;

@RestController
@RequestMapping("/api/recepcion-habitacion")
public class RecepcionHabitacionControlador {
  @Autowired
  private RecepcionHabitacionServicio servicio;

  @GetMapping
  public List<RecepcionHabitacion> obtenerTodos() {
    return servicio.obtenerTodos();
  }

  @PostMapping
  public RecepcionHabitacion guardar(@RequestBody RecepcionHabitacion obj) {
    return servicio.guardar(obj);
  }
}
