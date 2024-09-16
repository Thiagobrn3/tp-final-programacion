package proyecto.pkgfinal.programacion;

import java.time.LocalDateTime;
import java.util.Objects;

public class Vuelo {
    protected String numeroDeVuelo;
    protected String destino;
    protected String salida;
    protected LocalDateTime horaSalida;
    protected LocalDateTime horaLlegada;
    protected LocalDateTime fechaSalida;
    protected LocalDateTime fechaLlegada;
    protected Avion avion;
    protected Aeropuerto aeropuertoSalida;
    protected Aeropuerto aeropuertoLlegada;
    //protected Pasajeros[] cantidadPasajeros

    public Vuelo(String numeroDeVuelo, String destino, String salida, LocalDateTime horaSalida, LocalDateTime horaLlegada, Avion avion, Aeropuerto aeropuertoSalida, Aeropuerto aeropuertoLlegada) {
        this.numeroDeVuelo = numeroDeVuelo;
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

    public String getNumeroDeVuelo() {
        return numeroDeVuelo;
    }

    public void setNumeroDeVuelo(String numeroDeVuelo) {
        this.numeroDeVuelo = numeroDeVuelo;
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
        return "Vuelo{" + "numeroDeVuelo=" + numeroDeVuelo + ", destino=" + destino + ", salida=" + salida + ", horaSalida=" + horaSalida + ", horaLlegada=" + horaLlegada + ", avion=" + avion + ", aeropuertoSalida=" + aeropuertoSalida + ", aeropuertoLlegada=" + aeropuertoLlegada + '}';
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
        if (!Objects.equals(this.numeroDeVuelo, other.numeroDeVuelo)) {
            return false;
        }
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
