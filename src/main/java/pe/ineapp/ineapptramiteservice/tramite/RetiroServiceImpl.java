package pe.ineapp.ineapptramiteservice.tramite;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;



@Service
public class RetiroServiceImpl implements RetiroService {


    @Autowired
    private RetiroRepository retiroRepository;

    @Override
    public BasicResponse add(RetiroAddRequest request) {

        try{
            Retiro retiro = request.toEntity();
            retiroRepository.save(retiro);

            return BasicResponse.whenSuccess();
        }catch(Exception e){
            return BasicResponse.whenError(e.getMessage());
        }








    }

    @Override
    public List<Retiro> getAll() {
        return null;
    }

    @Override
    public Retiro getById(long id) {
        return null;
    }

    @Override
    public BasicResponse update(RetiroAddRequest request, long id) {
        return null;
    }

    @Override
    public BasicResponse delete(long id) {
        return null;
    }
}
