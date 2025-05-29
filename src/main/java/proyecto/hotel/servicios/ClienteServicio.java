// src/main/java/proyecto/hotel/servicios/ClienteServicio.java
package proyecto.hotel.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import proyecto.hotel.entidades.Cliente;
import proyecto.hotel.repositorios.ClienteRepositorio;

import java.util.Optional;

@Service
public class ClienteServicio {

  @Autowired
  private ClienteRepositorio repositorio;

  public Optional<Cliente> obtenerPorId(Integer id) {
    return repositorio.findById(id);
  }
}
