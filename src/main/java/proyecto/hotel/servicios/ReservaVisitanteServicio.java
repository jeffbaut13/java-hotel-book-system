package proyecto.hotel.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import proyecto.hotel.dto.ReservaVisitanteRequest;
import proyecto.hotel.entidades.ReservaVisitante;
import proyecto.hotel.entidades.ReservaVisitanteId;
import proyecto.hotel.repositorios.ReservaVisitanteRepositorio;

import java.util.ArrayList;
import java.util.List;

@Service
public class ReservaVisitanteServicio {

    @Autowired
    private ReservaVisitanteRepositorio repositorio;

    public List<ReservaVisitante> obtenerTodos() {
        return repositorio.findAll();
    }

    public ReservaVisitante guardar(ReservaVisitante reservaVisitante) {
        return repositorio.save(reservaVisitante);
    }

    public List<ReservaVisitante> guardarMultiple(ReservaVisitanteRequest request) {
        List<ReservaVisitante> guardados = new ArrayList<>();
        for (var visitante : request.getVisitantes()) {
            ReservaVisitante nuevo = new ReservaVisitante();
            nuevo.setId(new ReservaVisitanteId(request.getReserva().getIdReserva(), visitante.getCedula()));
            nuevo.setReserva(request.getReserva());
            nuevo.setVisitante(visitante);
            nuevo.setFechaReserva(request.getFechaReserva());
            guardados.add(repositorio.save(nuevo));
        }
        return guardados;
    }

    public void eliminar(ReservaVisitante reservaVisitante) {
        repositorio.delete(reservaVisitante);
    }
}
