package proyecto.hotel.entidades;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "categoria_habitacion")
@Data
public class CategoriaHabitacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCategoriaHabitacion;

    private String nombre;
    private Double precioNoche;
    private String fotoUrl;
    private String descripcion;

    private Boolean tv;
    private Boolean aireAcondicionado;
    private Boolean coberturaNoctura;
    private Boolean veinticuatroHoras;
    private Boolean cafetera;
    private Boolean minibar;
    private Boolean cajaSeguridad;
    private Boolean leedAutomatizada;
    private Boolean servicioHuesped;
    private Boolean despertador;
    private Boolean portatil;
    private Boolean secador;
    private Boolean telefono;
    private Boolean vistaAlmar;
}