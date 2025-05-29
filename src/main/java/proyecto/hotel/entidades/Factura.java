package proyecto.hotel.entidades;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;

@Entity
@Data
public class Factura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFactura;

    private double total;
    private double subtotal;
    private double iva;
    private double inc;
    private double descuento;

    private String categoria;

    private Date fechaHora;
}
