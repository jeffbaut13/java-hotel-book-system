package proyecto.hotel.entidades;

import jakarta.persistence.*;
import lombok.Data;
import java.sql.Date;

@Entity
@Table(name = "recepcion_habitacion")
@Data
public class RecepcionHabitacion {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer codigoRecepcionHabitacion;

  private Date fecha;
  private String categoria;

  @ManyToOne
  @JoinColumn(name = "id_habitacion")
  private Habitacion habitacion;
}