package negocio.envio;

import negocio.cliente.Ubicacion;

public class Moto implements TipoDeEnvio{

    public Integer calcularCosto(Integer peso, Ubicacion ubicacion) {
        if(peso <= 200) return 150;
        else return (peso * 2);
    }
}
