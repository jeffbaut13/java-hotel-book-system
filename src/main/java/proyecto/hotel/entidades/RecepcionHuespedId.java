package proyecto.hotel.entidades;

import lombok.Data;
import java.io.Serializable;

@Data
public class RecepcionHuespedId implements Serializable {
    private Integer idRecepcion;
    private Integer idHuesped;
}
