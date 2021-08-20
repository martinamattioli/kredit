package negocio;

import java.time.LocalDate;

abstract class EstadoPrestamo {
    protected Prestamo prestamo;

    public EstadoPrestamo(Prestamo prestamo) {
        this.prestamo = prestamo;
    }

    abstract void pagar(Integer dinero);
    abstract void actualizarVencimiento(LocalDate fechaActual);
}
