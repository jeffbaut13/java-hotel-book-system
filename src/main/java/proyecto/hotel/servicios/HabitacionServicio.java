
package proyecto.hotel.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import proyecto.hotel.entidades.*;
import proyecto.hotel.repositorios.*;

import java.util.List;

@Service
public class HabitacionServicio {
  @Autowired
  private HabitacionRepositorio repo;

  public List<Habitacion> obtenerTodos() {
    return repo.findAll();
  }

  public Habitacion guardar(Habitacion obj) {
    return repo.save(obj);
  }

  public Habitacion obtenerPorId(Integer id) {
    return repo.findById(id).orElseThrow(() -> new RuntimeException("Habitación no encontrada"));
  }

  public void eliminar(Integer id) {
    repo.deleteById(id);
  }

}
