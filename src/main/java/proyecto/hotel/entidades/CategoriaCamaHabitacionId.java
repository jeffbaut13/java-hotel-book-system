package proyecto.hotel.entidades;

import lombok.Data;
import java.io.Serializable;

@Data
public class CategoriaCamaHabitacionId implements Serializable {
    private Integer codigoCategoriacama;
    private Integer codigoCategoriahabitacion;
}