package negocio.envio;

import negocio.cliente.Ubicacion;
import negocio.componente.Componente;

public interface TipoDeEnvio {
    Integer calcularCosto(Componente componente, Ubicacion ubicacion);
}
