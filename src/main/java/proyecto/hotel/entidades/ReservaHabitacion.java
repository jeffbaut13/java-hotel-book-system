package proyecto.hotel.entidades;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "reserva_habitacion")
@IdClass(ReservaHabitacionId.class)
@Data
public class ReservaHabitacion {
    @Id
    private Long idReserva;

    @Id
    private Integer idHabitacion;

    private Integer cantidad;
}