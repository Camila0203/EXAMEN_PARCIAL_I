package hotel;

public class Habitacion {
    private int numero;
    private String tipo;
    private double precioPorNoche;
    private String estado;

    public Habitacion(int numero, String tipo, double precioPorNoche, String estado) {
        this.numero = numero;
        this.tipo = tipo;
        this.precioPorNoche = precioPorNoche;
        this.estado = estado;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPrecioPorNoche() {
        return precioPorNoche;
    }

    public void setPrecioPorNoche(double precioPorNoche) {
        this.precioPorNoche = precioPorNoche;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Habitación N°" + numero + " (" + tipo + "), Precio por noche: $" + precioPorNoche + ", Estado: " + estado;
    }
}
