package proyecto.hotel.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import proyecto.hotel.entidades.Cama;
import proyecto.hotel.entidades.CategoriaCama;
import proyecto.hotel.repositorios.CamaRepositorio;
import proyecto.hotel.repositorios.CategoriaCamaRepositorio;

import java.util.List;

@Service
public class CamaServicio {

    @Autowired
    private CamaRepositorio camaRepositorio;

    @Autowired
    private CategoriaCamaRepositorio categoriaCamaRepositorio;

    public List<Cama> obtenerTodas() {
        return camaRepositorio.findAll();
    }

    public Cama guardar(Cama cama) {
        if (cama.getCategoriaCama() != null) {
            CategoriaCama categoria = categoriaCamaRepositorio
                .findById(cama.getCategoriaCama().getId())
                .orElse(null);
            cama.setCategoriaCama(categoria);
        }
        return camaRepositorio.save(cama);
    }

    public void eliminar(Integer id) {
        camaRepositorio.deleteById(id);
    }

    public Cama obtenerPorId(Integer id) {
        return camaRepositorio.findById(id).orElse(null);
    }
}
