package proyecto.hotel.entidades;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "habitacion")
@Data
public class Habitacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idHabitacion;

    private String nombre;
    private Integer piso;
    private String telefono;

    @ManyToOne
    @JoinColumn(name = "id_categoria")
    private CategoriaHabitacion categoriaHabitacion;
}