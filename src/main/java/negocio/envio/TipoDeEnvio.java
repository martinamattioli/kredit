package negocio.envio;

import negocio.componente.Componente;

public interface TipoDeEnvio {
    Integer calcularCosto(Componente componente);
}
