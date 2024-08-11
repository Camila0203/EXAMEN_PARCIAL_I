package hotel;

import java.time.LocalDate;

    public class Reserva {
        private Habitacion habitacion;
        private Cliente cliente;
        private LocalDate fechaEntrada;
        private LocalDate fechaSalida;

        public Reserva(Habitacion habitacion, Cliente cliente, LocalDate fechaEntrada, LocalDate fechaSalida) {
            this.habitacion = habitacion;
            this.cliente = cliente;
            this.fechaEntrada = fechaEntrada;
            this.fechaSalida = fechaSalida;
        }

        public Habitacion getHabitacion() {
            return habitacion;
        }

        public Cliente getCliente() {
            return cliente;
        }

        public LocalDate getFechaEntrada() {
            return fechaEntrada;
        }

        public LocalDate getFechaSalida() {
            return fechaSalida;
        }

        public double calcularCostoTotal() {
            return habitacion.getPrecioPorNoche() * (fechaSalida.toEpochDay() - fechaEntrada.toEpochDay());
        }

        @Override
        public String toString() {
            return "Reserva: " + cliente.getNombre() + " - Habitación N°" + habitacion.getNumero() +
                    " (" + fechaEntrada + " a " + fechaSalida + "), Costo Total: $" + calcularCostoTotal();
        }
    }
