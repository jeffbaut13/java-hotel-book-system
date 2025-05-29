package proyecto.hotel.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import proyecto.hotel.entidades.*;
import proyecto.hotel.servicios.*;

import java.util.List;

@RestController
@RequestMapping("/api/categoria-cama-habitacion")
public class CategoriaCamaHabitacionControlador {
  @Autowired
  private CategoriaCamaHabitacionServicio servicio;

  @GetMapping
  public List<CategoriaCamaHabitacion> obtenerTodos() {
    return servicio.obtenerTodos();
  }

  @PostMapping
  public CategoriaCamaHabitacion guardar(@RequestBody CategoriaCamaHabitacion obj) {
    return servicio.guardar(obj);
  }
}
