package negocio;

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
    
}
