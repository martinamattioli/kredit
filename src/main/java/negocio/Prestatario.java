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
    private List<Prestamo> prestamos;
    private List<SolicitudDeCredito> solicitudesDeCredito;
    private Boolean puedeSoicitarCredito;

    public Prestatario(String nombreCompleto, String mail, String telefono, TipoDeDocumento tipoDeDocumento,
                       String nroDeDocumento, Integer ingresoMensual, SituacionLaboral situacionLaboral) {
        this.nombreCompleto = nombreCompleto;
        this.mail = mail;
        this.telefono = telefono;
        this.tipoDeDocumento = tipoDeDocumento;
        this.nroDeDocumento = nroDeDocumento;
        this.ingresoMensual = ingresoMensual;
        this.situacionLaboral = situacionLaboral;
        this.prestamos = new ArrayList<Prestamo>();
        this.solicitudesDeCredito = new ArrayList<SolicitudDeCredito>();
    }

    // solicitar credito ==> primero chequea puedeSoicitarCredito y desp genera la solicitud
    // credito estado vencido ==> puedeSoicitarCredito=false

}
