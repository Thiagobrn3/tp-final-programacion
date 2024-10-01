package Vuelos.model.repository;

import Vuelos.model.entity.Vuelo;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

public class vueloDaoImpl implements vueloDao {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("vuelosPU");
    EntityManager em = emf.createEntityManager();

    @Override
    public void createVuelo(Vuelo vuelo) {
        em.getTransaction().begin();
        em.persist(vuelo);
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public void updateVuelo(Vuelo vuelo, String id) {
        em.getTransaction().begin();
        Vuelo vueloExistente = em.find(Vuelo.class, id);

        if (vueloExistente != null) {
            vueloExistente.setDestino(vuelo.getDestino());
            vueloExistente.setHoraSalida(vuelo.getHoraSalida());
        } else {
            System.out.println("Vuelo no encontrado con ID: " + id);
        }

        em.getTransaction().commit();
        em.close();
    }

    @Override
    public void deleteVuelo(String id) {
        em.getTransaction().begin();
        Vuelo vuelo = em.find(Vuelo.class, id);

        if (vuelo != null) {
            em.remove(vuelo);
        }

        em.getTransaction().commit();
        em.close();
    }

    @Override
    public Vuelo searchVuelo(String id) {
        em.getTransaction().begin();
        Vuelo vuelo = em.find(Vuelo.class, id);
        em.close();

        return vuelo;
    }

    @Override
    public List<Vuelo> readAll() {
        Query dql = em.createNamedQuery("Vuelo.ReadAll");
        List<Vuelo> vuelosLista = dql.getResultList();
        for (Vuelo vuelo : vuelosLista) {
            System.out.println(vuelo);
            System.out.println("Destino: " + vuelo.getDestino());
            System.out.println("Salida: " + vuelo.getSalida());
        }
        return vuelosLista;
    }
}
