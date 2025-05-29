package proyecto.hotel.entidades;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ReservaVisitanteId implements Serializable {
    private Long reservaId;
    private Integer huespedId;
}
