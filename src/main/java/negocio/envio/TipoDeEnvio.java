package negocio.envio;

import negocio.cliente.Ubicacion;

public interface TipoDeEnvio {
    Integer calcularCosto(Integer peso, Ubicacion ubicacion);
}
