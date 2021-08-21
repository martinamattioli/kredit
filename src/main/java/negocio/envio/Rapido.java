package negocio.envio;

import negocio.cliente.Ubicacion;

public class Rapido implements TipoDeEnvio{

    public Integer calcularCosto(Integer peso, Ubicacion ubicacion) {
        return 10000;
    }
}
