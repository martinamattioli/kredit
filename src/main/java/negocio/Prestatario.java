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
    private List<Credito> creditos;
    private List<SolicitudDeCredito> solicitudesDeCredito;

    public Prestatario(String nombreCompleto, String mail, String telefono, TipoDeDocumento tipoDeDocumento,
                       String nroDeDocumento, Integer ingresoMensual, SituacionLaboral situacionLaboral) {
        this.nombreCompleto = nombreCompleto;
        this.mail = mail;
        this.telefono = telefono;
        this.tipoDeDocumento = tipoDeDocumento;
        this.nroDeDocumento = nroDeDocumento;
        this.ingresoMensual = ingresoMensual;
        this.situacionLaboral = situacionLaboral;
        this.creditos = new ArrayList<Credito>();
        this.solicitudesDeCredito = new ArrayList<SolicitudDeCredito>();
    }
}
