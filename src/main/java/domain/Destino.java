package domain;

public class Destino {
    private String direccion;
    private int tiempoEsperaMinutos;

    public Destino(String direccion, int tiempoEsperaMinutos) {
        this.direccion = direccion;
        this.tiempoEsperaMinutos = tiempoEsperaMinutos;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getTiempoEsperaMinutos() {
        return tiempoEsperaMinutos;
    }
}
