package negocio;

import java.util.ArrayList;
import java.util.List;

public class Prestamo {
    private List<Cuota> cuotas;
    private Componente componente;
    private Float tasaDeInteres;

    public Prestamo(Componente componente, Float tasaDeInteres) {
        this.componente = componente;
        this.tasaDeInteres = tasaDeInteres;
        cuotas = new ArrayList<Cuota>();
    }

}
