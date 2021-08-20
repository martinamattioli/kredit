package negocio;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Prestamo {
    private Integer valor;
    private Componente componente;
    private Float tasaDeInteres;
    private EstadoPrestamo estado;
    private int saldoPendiente;
    private Date fechaDeVencimiento;

    public Prestamo(Componente componente, Float tasaDeInteres) {
        this.componente = componente;
        this.tasaDeInteres = tasaDeInteres;
    }

    // START GETTER & SETTER

    public Componente getComponente() {
        return componente;
    }

    public Float getTasaDeInteres() {
        return tasaDeInteres;
    }

    public EstadoPrestamo getEstado() {
        return estado;
    }

    public void setEstado(EstadoPrestamo estado) {
        this.estado = estado;
    }

    // END GETTER & SETTER

    public void  pagarPrestamo(){
        saldoPendiente = 0;
    }
}
