package negocio;

import java.time.LocalDate;

public class Pagado extends EstadoPrestamo {
    public Pagado(Prestamo prestamo) {
        super(prestamo);
    }

    public void pagar(Integer dinero) {

    }

    public void actualizarVencimiento(LocalDate fechaActual) {

    }

}
