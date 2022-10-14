package pe.ineapp.ineapptramiteservice.tramite;

import java.util.List;

public interface RetiroService {

    public BasicResponse add(RetiroAddRequest request);

    public List<Retiro> getAll();

    public Retiro getById(long id);

    public BasicResponse update(RetiroAddRequest request, long id);

    public BasicResponse delete( long id);
}
