package negocio.envio;

import negocio.componente.Componente;

public class Moto implements TipoDeEnvio{

    public Integer calcularCosto(Componente componente) {
        if(componente.getPeso() <= 200) return 150;
        else return (componente.getPeso()*2);
    }
}
