package negocio.envio;

import negocio.cliente.Ubicacion;
import negocio.componente.Componente;

public class Rapido implements TipoDeEnvio{

    public Integer calcularCosto(Componente componente, Ubicacion ubicacion) {
        return 10000;
    }
}
