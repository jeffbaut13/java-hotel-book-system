package proyecto.hotel.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import proyecto.hotel.entidades.*;
import proyecto.hotel.repositorios.*;

import java.util.List;

@Service
public class CategoriaHabitacionServicio {
  @Autowired
  private CategoriaHabitacionRepositorio repo;

  public List<CategoriaHabitacion> obtenerTodos() {
    return repo.findAll();
  }

  public CategoriaHabitacion guardar(CategoriaHabitacion obj) {
    return repo.save(obj);
  }
}
