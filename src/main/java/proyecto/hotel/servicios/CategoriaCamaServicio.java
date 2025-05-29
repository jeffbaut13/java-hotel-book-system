package proyecto.hotel.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import proyecto.hotel.entidades.CategoriaCama;
import proyecto.hotel.repositorios.CategoriaCamaRepositorio;

import java.util.List;

@Service
public class CategoriaCamaServicio {

    @Autowired
    private CategoriaCamaRepositorio repositorio;

    public List<CategoriaCama> obtenerTodas() {
        return repositorio.findAll();
    }

    public CategoriaCama guardar(CategoriaCama categoria) {
        return repositorio.save(categoria);
    }

    public void eliminar(Integer id) {
        repositorio.deleteById(id);
    }

    public CategoriaCama obtenerPorId(Integer id) {
        return repositorio.findById(id).orElse(null);
    }
}
