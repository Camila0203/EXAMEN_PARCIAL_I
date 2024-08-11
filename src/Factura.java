package hotel;

public class Factura {
    private Cliente cliente;
    private Reserva reserva;
    private double montoTotal;

    public Factura(Cliente cliente, Reserva reserva) {
        this.cliente = cliente;
        this.reserva = reserva;
        this.montoTotal = calcularMontoTotal();
    }

    private double calcularMontoTotal() {
        long diasEstancia = java.time.temporal.ChronoUnit.DAYS.between(reserva.getFechaEntrada(), reserva.getFechaSalida());
        return diasEstancia * reserva.getHabitacion().getPrecioPorNoche();
    }

    @Override
    public String toString() {
        return "Factura{" +
                "cliente=" + cliente.getNombre() +
                ", reserva=" + reserva +
                ", montoTotal=" + montoTotal +
                '}';
    }
}
