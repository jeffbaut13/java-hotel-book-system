package proyecto.hotel.entidades;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;

@Entity
@Table(name = "cama")
@Data
public class Cama {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cama")
    private Integer id;

    @Column(name = "recibo_url", nullable = false)
    private String reciboUrl;

    @Column(name = "fecha_cama", nullable = false)
    private Date fechaCama;

    @ManyToOne
    @JoinColumn(name = "id_categoriacama", nullable = false)
    private CategoriaCama categoriaCama;
}
