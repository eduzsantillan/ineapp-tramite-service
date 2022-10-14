package pe.ineapp.ineapptramiteservice.tramite;

import lombok.Builder;
import lombok.Data;

import javax.persistence.*;

@Builder
@Data
@Table(name = "tbl_tramite")
@Entity
public class Retiro {

    @SequenceGenerator(
            name="tramite_sequence",
            sequenceName = "tramite_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "tramite_sequence"
    )
    @Id
    private long id;

    @Column(name ="cantidadretirar")
    private String cantidadretirar;

    @Column(name ="codigoBanco")
    private String codigoBanco;

    @Column(name ="comentario")
    private String comentario;

    @Column(name ="notificarmail")
    private boolean notificarmail;

    @Column(name ="tipopago")
    private String tipopago;

    @Column(name ="idpersona")
    private long idpersona;


}
