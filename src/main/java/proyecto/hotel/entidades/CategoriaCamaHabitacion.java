package proyecto.hotel.entidades;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "categoria_cama_habitacion")
@IdClass(CategoriaCamaHabitacionId.class)
@Data
public class CategoriaCamaHabitacion {
  @Id
  private Integer codigoCategoriacama;

  @Id
  private Integer codigoCategoriahabitacion;

  private Short cantidad;
}