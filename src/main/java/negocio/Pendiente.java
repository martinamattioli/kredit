package negocio;

import java.time.LocalDate;

public class Pendiente extends EstadoPrestamo {
    public Pendiente(Prestamo prestamo) {
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
            prestamo.setEstado(new Vencido(prestamo));
        }
    }
}
