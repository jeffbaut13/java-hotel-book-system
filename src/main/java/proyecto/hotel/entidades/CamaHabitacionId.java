package proyecto.hotel.entidades;

import lombok.Data;
import java.io.Serializable;

@Data
public class CamaHabitacionId implements Serializable {
    private Integer idCama;
    private Integer idHabitacion;
}