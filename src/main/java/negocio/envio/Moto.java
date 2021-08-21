package negocio.envio;

import negocio.cliente.Ubicacion;
import negocio.componente.Componente;

public class Moto implements TipoDeEnvio{

    public Integer calcularCosto(Componente componente, Ubicacion ubicacion) {
        if(componente.getPeso() <= 200) return 150;
        else return (componente.getPeso()*2);
    }
}
