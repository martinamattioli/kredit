package negocio;

import java.util.ArrayList;
import java.util.List;

public class Prestatario {
    private String nombreCompleto;
    private String mail;
    private String telefono;
    private TipoDeDocumento tipoDeDocumento;
    private String nroDeDocumento;
    private Integer ingresoMensual;
    private SituacionLaboral situacionLaboral;
    private Prestamo prestamo
    private EstadoPrestatario estado;

    public Prestatario(String nombreCompleto, String mail, String telefono, TipoDeDocumento tipoDeDocumento,
                       String nroDeDocumento, Integer ingresoMensual, SituacionLaboral situacionLaboral) {
        this.nombreCompleto = nombreCompleto;
        this.mail = mail;
        this.telefono = telefono;
        this.tipoDeDocumento = tipoDeDocumento;
        this.nroDeDocumento = nroDeDocumento;
        this.ingresoMensual = ingresoMensual;
        this.situacionLaboral = situacionLaboral;
        this.prestamo = null;
        this.estado = EstadoPrestatario.EN_REGLA;
    }

    public EstadoPrestatario getEstado() {
        return estado;
    }

    public void setEstado(EstadoPrestatario estado) {
        this.estado = estado;
    }

    public void solicitarPrestamo(Organizacion organizacion, Componente componente){
        organizacion.generarPrestamo(this, componente);
    }

    public void setPrestamo(Prestamo prestamo) {
        this.prestamo = prestamo;
    }

    public Boolean puedeSolicitarNuevoPrestamo() {
        return prestamo == null || prestamo.tieneSaldoPendiente();
    }

}
