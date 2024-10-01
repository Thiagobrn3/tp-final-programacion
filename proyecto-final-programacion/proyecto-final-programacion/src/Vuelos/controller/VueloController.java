package Vuelos.controller;

import Vuelos.model.entity.Vuelo;
import Vuelos.model.repository.vueloDaoImpl;
import Vuelos.view.vueloView;
import java.util.List;
import javax.persistence.Convert;

public class VueloController {

    private vueloView vueloView;
    private vueloDaoImpl vueloDaoImpl;

    public VueloController(vueloView vueloView, vueloDaoImpl vueloDaoImpl) {
        this.vueloView = vueloView;
        this.vueloDaoImpl = vueloDaoImpl;
    }

    public void addVuelo() {
        Vuelo nuevoVuelo = vueloView.createVuelo();
        vueloDaoImpl.createVuelo(nuevoVuelo);
        vueloView.viewMessage("Vuelo agregado exitosamente");
    }

    public void removeVuelo() {
        String id = vueloView.removeVuelo();
        vueloDaoImpl.deleteVuelo(id);
    }

    public void updateVuelo() {
        String id = vueloView.searchVueloUpdate();
        Vuelo vuelo = vueloDaoImpl.searchVuelo(id);
        if (vuelo != null) {
            Vuelo vueloActualizado = vueloView.updateVuelo(vuelo);
            vueloDaoImpl.updateVuelo(vuelo, id);
            vueloView.viewMessage("Vuelo actualizado");
        } else {
            vueloView.viewMessage("Vuelo no encontrado");
        }
    }

    public void listVuelos() {
        List<Vuelo> listaVuelos = vueloDaoImpl.readAll();
        vueloView.listVuelos(listaVuelos);
    }
}
