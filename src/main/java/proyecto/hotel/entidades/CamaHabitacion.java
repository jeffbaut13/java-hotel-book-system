package proyecto.hotel.entidades;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "cama_habitacion")
@IdClass(CamaHabitacionId.class)
@Data
public class CamaHabitacion {
    @Id
    private Integer idCama;

    @Id
    private Integer idHabitacion;

    private String estado;
}