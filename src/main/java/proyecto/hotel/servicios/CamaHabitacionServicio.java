package proyecto.hotel.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import proyecto.hotel.entidades.*;
import proyecto.hotel.repositorios.*;

import java.util.List;

@Service
public class CamaHabitacionServicio {
    @Autowired
    private CamaHabitacionRepositorio repo;

    public List<CamaHabitacion> obtenerTodos() {
        return repo.findAll();
    }

    public List<CamaHabitacion> obtenerPorHabitacion(Integer idHabitacion) {
        return repo.findByIdHabitacion(idHabitacion);
    }

    public CamaHabitacion guardar(CamaHabitacion obj) {
        return repo.save(obj);
    }
}