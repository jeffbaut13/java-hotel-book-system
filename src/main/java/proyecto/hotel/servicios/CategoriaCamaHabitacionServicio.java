
package proyecto.hotel.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import proyecto.hotel.entidades.*;
import proyecto.hotel.repositorios.*;

import java.util.List;

@Service
public class CategoriaCamaHabitacionServicio {
  @Autowired
  private CategoriaCamaHabitacionRepositorio repo;

  public List<CategoriaCamaHabitacion> obtenerTodos() {
    return repo.findAll();
  }

  public CategoriaCamaHabitacion guardar(CategoriaCamaHabitacion obj) {
    return repo.save(obj);
  }
}
