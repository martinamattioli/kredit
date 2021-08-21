package negocio.pedido;

import negocio.cliente.TarjetaDeCredito;

import java.io.IOException;

public abstract class EstadoPedido {

    protected Pedido pedido;

    public EstadoPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public abstract void pagar(TarjetaDeCredito tarjetaDeCredito, Integer monto) throws MontoInsuficienteException, IOException, NoSePuedePagarException;

    public abstract void entregar() throws IOException, NoSePuedeEntregarException;

    public abstract void cancelar(TarjetaDeCredito tarjetaDeCredito, Integer monto) throws IOException, NoSePuedeCancelarException;

}
