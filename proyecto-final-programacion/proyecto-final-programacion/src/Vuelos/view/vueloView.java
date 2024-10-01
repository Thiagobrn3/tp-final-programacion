package Vuelos.view;

import Vuelos.model.entity.Vuelo;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Scanner;

public class vueloView {

    private Scanner scanner = new Scanner(System.in);

    public Vuelo createVuelo() {
        System.out.println("Ingrese el destino:");
        String destino = scanner.nextLine();

        System.out.println("Ingrese la salida:");
        String salida = scanner.nextLine();

        System.out.println("Ingrese la hora de salida (yyyy-MM-ddTHH:mm):");
        LocalDateTime horaSalida = LocalDateTime.parse(scanner.nextLine());

        System.out.println("Ingrese la hora de llegada (yyyy-MM-ddTHH:mm):");
        LocalDateTime horaLlegada = LocalDateTime.parse(scanner.nextLine());

        Vuelo vuelo = new Vuelo(destino, salida, horaSalida, horaLlegada, null, null, null);

        return vuelo;
    }

    public String removeVuelo() {
        System.out.println("Ingrese el id de vuelo a eliminar: ");
        String idVuelo = scanner.nextLine();

        return idVuelo;
    }

    public Vuelo updateVuelo(Vuelo vuelo) {
        System.out.println("Actualizando vuelo: " + vuelo.getId());
        System.out.println("Nuevo destino: ");
        String nuevoDestino = scanner.nextLine();

        vuelo.setDestino(nuevoDestino);

        System.out.println("Nueva hora de salida (yyyy-MM-ddTHH:mm): ");
        LocalDateTime nuevaHoraSalida = LocalDateTime.parse(scanner.nextLine());

        vuelo.setHoraSalida(nuevaHoraSalida);

        return vuelo;
    }

    public String searchVueloUpdate() {
        System.out.println("Ingrese el numero de vuelo a actualizar: ");
        String numeroVuelo = scanner.nextLine();

        return numeroVuelo;
    }

    public void viewMessage(String message) {
        System.out.println(message);
    }

    public void listVuelos(List<Vuelo> vuelos) {
        vuelos.forEach(vuelo -> {
            System.out.println(vuelo);
        });
    }
}
