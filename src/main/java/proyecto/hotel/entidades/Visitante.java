package proyecto.hotel.entidades;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "huesped")
@Data
public class Visitante {

    @Id
    @Column(name = "cedula")
    private Integer cedula;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellido")
    private String apellido;

    @Column(name = "tipo_identificacion")
    private String tipoIdentificacion;

    @Column(name = "edad")
    private Integer edad;

    @Column(name = "genero")
    private String genero;
}
