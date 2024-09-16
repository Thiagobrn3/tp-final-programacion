package proyecto.pkgfinal.programacion;
import java.time.LocalDateTime;
import java.util.Objects;

public class Avion {
    protected int matricula;
    protected String modelo;
    protected int capacidad;
    protected Vuelo vuelo;
    protected Aeropuerto aeropuertoSalida;
    protected Aeropuerto aeropuertoLlegada;
    //protected boolean tienePrimeraClase;

    public Avion() {
    }

    public Avion(int matricula, String modelo, int capacidad, Vuelo vuelo, Aeropuerto aeropuertoSalida, Aeropuerto aeropuertoLlegada) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.capacidad = capacidad;
        this.vuelo = vuelo;
        this.aeropuertoSalida = aeropuertoSalida;
        this.aeropuertoLlegada = aeropuertoLlegada;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public Vuelo getVuelo() {
        return vuelo;
    }

    public void setVuelo(Vuelo vuelo) {
        this.vuelo = vuelo;
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
        return "Avion{" + "matricula=" + matricula + ", modelo=" + modelo + ", capacidad=" + capacidad + ", vuelo=" + vuelo + ", aeropuertoSalida=" + aeropuertoSalida + ", aeropuertoLlegada=" + aeropuertoLlegada + '}';
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
        final Avion other = (Avion) obj;
        if (this.matricula != other.matricula) {
            return false;
        }
        if (this.capacidad != other.capacidad) {
            return false;
        }
        if (!Objects.equals(this.modelo, other.modelo)) {
            return false;
        }
        if (!Objects.equals(this.vuelo, other.vuelo)) {
            return false;
        }
        if (!Objects.equals(this.aeropuertoSalida, other.aeropuertoSalida)) {
            return false;
        }
        return Objects.equals(this.aeropuertoLlegada, other.aeropuertoLlegada);
    }
    
    
}