package hotel;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Crear algunas habitaciones
        Habitacion habitacion1 = new Habitacion(125, "Individual", 60.0, "Disponible");
        Habitacion habitacion2 = new Habitacion(10, "Doble", 180.0, "Disponible");

        // Crear un cliente
        Cliente cliente1 = new hotel.Cliente("Camila Martinez", "12345");

        // Crear una reserva
        try {
            if (habitacion1.getEstado().equals("Disponible")) {
                Reserva reserva1 = new Reserva(habitacion1, cliente1, LocalDate.of(2024, 8, 12), LocalDate.of(2024, 8, 15));
                cliente1.agregarReserva(reserva1);
                habitacion1.setEstado("Ocupada");

                // Crear una factura
                Factura factura1 = new Factura(cliente1, reserva1);
                cliente1.agregarFactura(factura1);

                System.out.println(reserva1);
                System.out.println(factura1);
            } else {
                throw new HabitacionNoDisponibleException("La habitación no está disponible para reserva.");
            }
        } catch (HabitacionNoDisponibleException e) {
            System.out.println(e.getMessage());
        }
    }
}
