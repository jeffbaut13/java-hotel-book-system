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

  // Obtener habitación por ID (opcional, pero útil para edición)
  @GetMapping("/{id}")
  public Habitacion obtenerPorId(@PathVariable Integer id) {
    return servicio.obtenerPorId(id);
  }

  // Actualizar habitación existente
  @PutMapping("/{id}")
  public Habitacion actualizar(@PathVariable Integer id, @RequestBody Habitacion obj) {
    obj.setIdHabitacion(id);
    return servicio.guardar(obj);
  }

  // Eliminar habitación
  @DeleteMapping("/{id}")
  public void eliminar(@PathVariable Integer id) {
    servicio.eliminar(id);
  }

}
