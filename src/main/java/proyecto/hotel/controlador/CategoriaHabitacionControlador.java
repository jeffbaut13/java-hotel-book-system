package proyecto.hotel.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import proyecto.hotel.entidades.*;
import proyecto.hotel.servicios.*;

import java.util.List;

@RestController
@RequestMapping("/api/categoria-habitacion")
public class CategoriaHabitacionControlador {
  @Autowired
  private CategoriaHabitacionServicio servicio;

  @GetMapping
  public List<CategoriaHabitacion> obtenerTodos() {
    return servicio.obtenerTodos();
  }

  @PostMapping
  public CategoriaHabitacion guardar(@RequestBody CategoriaHabitacion obj) {
    return servicio.guardar(obj);
  }
}
