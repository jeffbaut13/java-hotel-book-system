package proyecto.hotel.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import proyecto.hotel.entidades.*;
import proyecto.hotel.repositorios.*;

import java.util.List;



@Service
public class ReservaHabitacionServicio {
    @Autowired private ReservaHabitacionRepositorio repo;
    public List<ReservaHabitacion> obtenerTodos() { return repo.findAll(); }
    public ReservaHabitacion guardar(ReservaHabitacion obj) { return repo.save(obj); }
}