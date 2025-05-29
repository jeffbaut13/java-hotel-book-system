package proyecto.hotel.dto;

import lombok.Data;
import proyecto.hotel.entidades.Reserva;
import proyecto.hotel.entidades.Visitante;

import java.sql.Date;
import java.util.List;

@Data
public class ReservaVisitanteRequest {
    private Reserva reserva;
    private List<Visitante> visitantes;
    private Date fechaReserva;
}
