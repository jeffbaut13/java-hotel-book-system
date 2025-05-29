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
    private Integer telefono;

    @ManyToOne
    @JoinColumn(name = "id_categoria")
    private CategoriaHabitacion categoriaHabitacion;
}