package Vuelos.model.entity;

import Aviones.model.entity.Avion;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import proyecto.pkgfinal.programacion.Aeropuerto;

@Entity
@Table(name = "vuelos")
public class Vuelo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String idVuelo; //Clave primaria

    @Column(name = "destino", nullable = false)
    private String destino;

    @Column(name = "salida", nullable = false)
    private String salida;

    @Column(name = "hora_salida", nullable = false)
    private LocalDateTime horaSalida;

    @Column(name = "hora_llegada", nullable = false)
    private LocalDateTime horaLlegada;

    @Column(name = "fecha_salida", nullable = false)
    private LocalDateTime fechaSalida;

    @Column(name = "fecha_llegada", nullable = false)
    private LocalDateTime fechaLlegada;

    @OneToMany
    @JoinColumn(name = "avion_id", nullable = false)
    private Avion avion;

    @ManyToOne
    @JoinColumn(name = "aeropuerto_salida_id", nullable = false)
    private Aeropuerto aeropuertoSalida;

    @ManyToOne
    @JoinColumn(name = "aeropuerto_llegada_id", nullable = false)
    private Aeropuerto aeropuertoLlegada;

    //protected Pasajeros[] cantidadPasajeros
    public Vuelo(String destino, String salida, LocalDateTime horaSalida, LocalDateTime horaLlegada, Avion avion, Aeropuerto aeropuertoSalida, Aeropuerto aeropuertoLlegada) {
        this.destino = destino;
        this.salida = salida;
        this.horaSalida = horaSalida;
        this.horaLlegada = horaLlegada;
        this.avion = avion;
        this.aeropuertoSalida = aeropuertoSalida;
        this.aeropuertoLlegada = aeropuertoLlegada;
    }

    public Vuelo() {
    }

    public String getId() {
        return idVuelo;
    }

    public void setId(String idVuelo) {
        this.idVuelo = idVuelo;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getSalida() {
        return salida;
    }

    public void setSalida(String salida) {
        this.salida = salida;
    }

    public LocalDateTime getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(LocalDateTime horaSalida) {
        this.horaSalida = horaSalida;
    }

    public LocalDateTime getHoraLlegada() {
        return horaLlegada;
    }

    public void setHoraLlegada(LocalDateTime horaLlegada) {
        this.horaLlegada = horaLlegada;
    }

    public Avion getAvion() {
        return avion;
    }

    public void setAvion(Avion avion) {
        this.avion = avion;
    }

    public Aeropuerto getAeropuertoSalida() {
        return aeropuertoSalida;
    }

    public void setAeropuertoSalida(Aeropuerto aeropuertoSalida) {
        this.aeropuertoSalida = aeropuertoSalida;
    }

    public Aeropuerto getAeropuertoLlegada() {
        return aeropuertoLlegada;
    }

    public void setAeropuertoLlegada(Aeropuerto aeropuertoLlegada) {
        this.aeropuertoLlegada = aeropuertoLlegada;
    }

    @Override
    public String toString() {
        return "Vuelo{" + ", destino=" + destino + ", salida=" + salida + ", horaSalida=" + horaSalida + ", horaLlegada=" + horaLlegada + ", avion=" + avion + ", aeropuertoSalida=" + aeropuertoSalida + ", aeropuertoLlegada=" + aeropuertoLlegada + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Vuelo other = (Vuelo) obj;
        if (!Objects.equals(this.destino, other.destino)) {
            return false;
        }
        if (!Objects.equals(this.salida, other.salida)) {
            return false;
        }
        if (!Objects.equals(this.horaSalida, other.horaSalida)) {
            return false;
        }
        if (!Objects.equals(this.horaLlegada, other.horaLlegada)) {
            return false;
        }
        if (!Objects.equals(this.avion, other.avion)) {
            return false;
        }
        if (!Objects.equals(this.aeropuertoSalida, other.aeropuertoSalida)) {
            return false;
        }
        return Objects.equals(this.aeropuertoLlegada, other.aeropuertoLlegada);
    }
}
