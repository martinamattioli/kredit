package negocio;

import java.util.ArrayList;
import java.util.List;

public class Prestamo {
    private List<Cuota> cuotas;
    private Componente componente;
    private Float tasaDeInteres;
    private EstadoCuota estado;

    public Prestamo(Componente componente, Float tasaDeInteres) {
        this.componente = componente;
        this.tasaDeInteres = tasaDeInteres;
        cuotas = new ArrayList<Cuota>();
    }

    public List<Cuota> getCuotas() {
        return cuotas;
    }

    public void setCuotas(List<Cuota> cuotas) {
        this.cuotas = cuotas;
    }

    public Componente getComponente() {
        return componente;
    }

    public void setComponente(Componente componente) {
        this.componente = componente;
    }

    public Float getTasaDeInteres() {
        return tasaDeInteres;
    }

    public void setTasaDeInteres(Float tasaDeInteres) {
        this.tasaDeInteres = tasaDeInteres;
    }

    public EstadoCuota getEstado() {
        return estado;
    }

    public void setEstado(EstadoCuota estado) {
        this.estado = estado;
    }
}
