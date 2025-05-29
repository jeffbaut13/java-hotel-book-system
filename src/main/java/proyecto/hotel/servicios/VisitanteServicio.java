package proyecto.hotel.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import proyecto.hotel.entidades.Visitante;
import proyecto.hotel.repositorios.VisitanteRepositorio;

import java.util.List;

@Service
public class VisitanteServicio {

  @Autowired
  private VisitanteRepositorio visitanteRepositorio;

  public List<Visitante> obtenerTodos() {
    return visitanteRepositorio.findAll();
  }

  public Visitante guardar(Visitante visitante) {
    return visitanteRepositorio.save(visitante);
  }

  public void eliminarPorId(Integer id) {
    visitanteRepositorio.deleteById(id);
  }

  public Visitante obtenerPorId(Integer id) {
    return visitanteRepositorio.findById(id).orElse(null);
  }
}
