package proyecto.hotel.entidades;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "cliente")
@Data
public class Cliente {

    @Id
    @Column(name = "cedula")
    private Integer cedula;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "tipo_identificacion")
    private String tipoIdentificacion;
}
