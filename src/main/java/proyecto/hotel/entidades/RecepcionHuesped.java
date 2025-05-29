package proyecto.hotel.entidades;

import jakarta.persistence.*;
import lombok.Data;
import java.sql.Date;

@Entity
@Table(name = "recepcion_huesped")
@IdClass(RecepcionHuespedId.class)
@Data
public class RecepcionHuesped {
  @Id
  private Integer idRecepcion;

  @Id
  private Integer idHuesped;

  private Date fechaRecepcion;
}