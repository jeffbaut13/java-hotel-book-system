package proyecto.hotel.entidades;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;

@Entity
@Table(name = "reserva_huesped")
@Data
public class ReservaVisitante {

    @EmbeddedId
    private ReservaVisitanteId id;

    @ManyToOne
    @MapsId("reservaId")
    @JoinColumn(name = "id_reserva")
    private Reserva reserva;

    @ManyToOne
    @MapsId("huespedId")
    @JoinColumn(name = "id_huesped")
    private Visitante visitante;

    @Column(name = "fecha_reserva")
    private Date fechaReserva;
}
