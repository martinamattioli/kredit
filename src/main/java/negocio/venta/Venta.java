package negocio.venta;

import negocio.cliente.Cliente;
import negocio.componente.Componente;
import negocio.envio.TipoDeEnvio;

import java.time.LocalDate;

public class Venta {
    private Cliente cliente;
    private LocalDate fecha;
    private Componente componente;
    private TipoDeEnvio tipoDeEnvio;

    public Venta(Cliente cliente, LocalDate fecha, Componente componente, TipoDeEnvio tipoDeEnvio) {
        this.cliente = cliente;
        this.fecha = fecha;
        this.componente = componente;
        this.tipoDeEnvio = tipoDeEnvio;
    }

    public Integer calcularCosto() {
        return componente.getPrecio() + tipoDeEnvio.calcularCosto();
    }
}
