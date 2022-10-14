package pe.ineapp.ineapptramiteservice.tramite;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class RetiroAddRequest {

    private String email;
    private String cantidadretirar;
    private String codigobanco;
    private String comentario;
    private boolean notificarmail;
    private String tipopago;
    private String urldocumento;


    public Retiro toEntity(){
        return Retiro.builder()
                .idpersona(1L)
                .cantidadretirar(this.cantidadretirar)
                .codigoBanco(this.codigobanco)
                .comentario(this.comentario)
                .tipopago(this.tipopago)
                .notificarmail(this.notificarmail)
                .build();
    }

}
