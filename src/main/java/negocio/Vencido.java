package negocio;

import java.time.LocalDate;

public class Vencido extends EstadoPrestamo {

    public Vencido(Prestamo prestamo) {
        super(prestamo);
    }

    public void pagar(Integer dinero) {
        Double saldoPendiente = prestamo.getSaldoPendiente();
        if (saldoPendiente <= dinero) {
            prestamo.setSaldoPendiente((double) 0);
            prestamo.setEstado(new Pagado(prestamo));
        }
        else prestamo.restarAlSaldoPendiente(dinero);
    }

    public void actualizarVencimiento(LocalDate fechaActual) {
        if (fechaActual.isAfter(prestamo.getFechaDeVencimiento())) {
            prestamo.aplicarIntereses();
        }
    }

}
