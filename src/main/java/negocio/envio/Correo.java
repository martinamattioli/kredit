package negocio.envio;

import negocio.componente.Componente;

public class Correo implements TipoDeEnvio{

    public Integer calcularCosto(Componente componente) {
        return 100;
    }
}
