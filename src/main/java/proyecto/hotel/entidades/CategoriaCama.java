package proyecto.hotel.entidades;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "categoria_cama")
@Data
public class CategoriaCama {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_categoria_cama")
    private Integer id;

    @Column(name = "tipo", nullable = false)
    private String tipo;

    @Column(name = "medidas", nullable = false)
    private String medidas;

    @Column(name = "foto_url", nullable = false)
    private String fotoUrl;

    @Column(name = "color", nullable = false)
    private String color;
}
