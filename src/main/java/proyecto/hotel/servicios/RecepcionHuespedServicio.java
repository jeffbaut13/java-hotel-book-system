package proyecto.hotel.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import proyecto.hotel.entidades.*;
import proyecto.hotel.repositorios.*;

import java.util.List;

@Service
public class RecepcionHuespedServicio {
  @Autowired
  private RecepcionHuespedRepositorio repo;

  public List<RecepcionHuesped> obtenerTodos() {
    return repo.findAll();
  }

  public RecepcionHuesped guardar(RecepcionHuesped obj) {
    return repo.save(obj);
  }
}