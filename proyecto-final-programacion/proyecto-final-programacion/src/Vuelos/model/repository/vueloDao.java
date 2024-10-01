package Vuelos.model.repository;

import Vuelos.model.entity.Vuelo;
import java.util.List;

public interface vueloDao {

    public void createVuelo(Vuelo vuelo);

    public void updateVuelo(Vuelo vuelo, String id);

    public void deleteVuelo(String id);

    public Vuelo searchVuelo(String id);

    public List<Vuelo> readAll();
}
