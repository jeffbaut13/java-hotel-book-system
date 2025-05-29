package proyecto.hotel.entidades;

import lombok.Data;
import java.io.Serializable;

@Data
public class ReservaHabitacionId implements Serializable {
    private Long idReserva;
    private Integer idHabitacion;
}