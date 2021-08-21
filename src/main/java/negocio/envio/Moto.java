package negocio.envio;

import negocio.componente.Componente;

public class Moto implements TipoDeEnvio{

    public Integer calcularCosto(Componente componente) {
        return 150;
    }
}
