package domain;

import java.util.ArrayList;
import java.util.List;

public class Viaje {
    private List<Destino> destinos;

    public Viaje() {
        this.destinos = new ArrayList<>();
    }

    public void agregarDestino(Destino destino) {
        destinos.add(destino);
    }

    public int calcularTiempoDelViaje() {
        int demoraTotal = 0;
        for (int i = 0; i < destinos.size() - 1; i++) {
            demoraTotal += destinos.get(i).getTiempoEsperaMinutos();
        }
        return demoraTotal;
    }
}
