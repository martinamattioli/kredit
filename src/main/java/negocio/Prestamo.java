package negocio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Prestamo {
    private Integer valor;
    private Componente componente;
    private Double tasaDeInteres;
    private EstadoPrestamo estado;
    private Double saldoPendiente;
    private LocalDate fechaDeVencimiento;

    public Prestamo(Componente componente, LocalDate fechaDeVencimiento) {
        this.componente = componente;
        this.tasaDeInteres = 0.2;
        this.saldoPendiente = saldoPendiente;
        this.fechaDeVencimiento = fechaDeVencimiento;
        this.estado = new Pendiente(this);
    }

    // START GETTER & SETTER

    public Componente getComponente() {
        return componente;
    }

    public Double getTasaDeInteres() {
        return tasaDeInteres;
    }

    public EstadoPrestamo getEstado() {
        return estado;
    }

    public void setEstado(EstadoPrestamo estado) {
        this.estado = estado;
    }

    public Double getSaldoPendiente() { return saldoPendiente; }

    public void setSaldoPendiente(Double saldoPendiente) {
        this.saldoPendiente = saldoPendiente;
    }

    public LocalDate getFechaDeVencimiento() {
        return fechaDeVencimiento;
    }

    // END GETTER & SETTER

    public void pagar(Integer dinero){
        estado.pagar(dinero);
    }

    public void actualizarVencimiento(LocalDate fechaActual){
        estado.actualizarVencimiento(fechaActual);
    }

    public void sumarAlSaldoPendiente(Integer dinero){
        this.saldoPendiente += dinero;
    }

    public void restarAlSaldoPendiente(Integer dinero){
        this.saldoPendiente -= dinero;
    }

    public void aplicarIntereses(){
        saldoPendiente += saldoPendiente * (1 + tasaDeInteres);
    }

    public Boolean tieneSaldoPendiente(){
        return saldoPendiente != 0;
    }
}
