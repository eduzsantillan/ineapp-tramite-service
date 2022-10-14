package pe.ineapp.ineapptramiteservice.tramite;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/retiro")
@RestController
public class RetiroController {

    @Autowired
    private RetiroService retiroService;


    @GetMapping("/getbyid")
    public ResponseEntity<Retiro> getById(@RequestParam(name="id",required =true) long id){

        return ResponseEntity.ok().body(Retiro.builder()
                        .cantidadretirar("1000")
                        .codigoBanco("001")
                        .comentario("Retiro de prueba")
                        .notificarmail(true)
                        .tipopago("Efectivo")
                        .idpersona(1L)
                .build());
    }


    @PostMapping("/add")
    public ResponseEntity<BasicResponse> add(@RequestBody RetiroAddRequest request){
        BasicResponse response =  retiroService.add(request);
        return ResponseEntity.ok().body(response);
    }



}
