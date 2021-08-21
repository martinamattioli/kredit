package negocio.envio;

import negocio.cliente.Ubicacion;

public class Correo implements TipoDeEnvio{

    public Integer calcularCosto(Integer peso, Ubicacion ubicacion) {
        Integer costo;
        switch (ubicacion){
            case CABA: costo = 100;
            break;
            case GRAN_BSAS: costo = 200;
            break;
            case INTERIOR: costo = 2000;
            break;
            default:
                throw new IllegalStateException("Ubicacion Invalida");
        }
        return costo;
    }
}
