package proyecto.hotel.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import proyecto.hotel.entidades.Cliente;
import proyecto.hotel.repositorios.ClienteRepositorio;

import java.util.List;

@RestController
@RequestMapping("/api/clientes")
public class ClienteControlador {

  @Autowired
  private ClienteRepositorio clienteRepositorio;

  @GetMapping
  public List<Cliente> obtenerTodos() {
    return clienteRepositorio.findAll();
  }

  @PostMapping
  public Cliente crear(@RequestBody Cliente cliente) {
    return clienteRepositorio.save(cliente);
  }
}
