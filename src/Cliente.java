package hotel;

import java.util.ArrayList;
import java.util.List;

    public class Cliente extends Persona { // Asegúrate de que la clase extiende de Persona
        private List<Reserva> reservas;
        private List<Factura> facturas;

        public Cliente(String nombre, String id) {
            super(nombre, id); // Llama al constructor de la clase base Persona
            this.reservas = new ArrayList<>();
            this.facturas = new ArrayList<>();
        }

        public List<Reserva> getReservas() {
            return reservas;
        }

        public void agregarReserva(Reserva reserva) {
            reservas.add(reserva);
        }

        public List<Factura> getFacturas() {
            return facturas;
        }

        public void agregarFactura(Factura factura) {
            facturas.add(factura);
        }

        @Override
        public String toString() {
            return super.toString() + ", Reservas: " + reservas.size() + ", Facturas: " + facturas.size();
        }
    }

