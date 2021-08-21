package negocio.envio;

import negocio.componente.Componente;

public class Rapido implements TipoDeEnvio{

    public Integer calcularCosto(Componente componente) {
        return 200;
    }
}
