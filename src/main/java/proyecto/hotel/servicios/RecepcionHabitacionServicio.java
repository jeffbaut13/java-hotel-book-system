package proyecto.hotel.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import proyecto.hotel.entidades.*;
import proyecto.hotel.repositorios.*;

import java.util.List;

@Service
public class RecepcionHabitacionServicio {
  @Autowired
  private RecepcionHabitacionRepositorio repo;

  public List<RecepcionHabitacion> obtenerTodos() {
    return repo.findAll();
  }

  public RecepcionHabitacion guardar(RecepcionHabitacion obj) {
    return repo.save(obj);
  }
}
