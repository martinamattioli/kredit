package negocio.pedido;

import negocio.cliente.TarjetaDeCredito;
import negocio.persistentEntity.PersistentEntity;

import javax.persistence.Entity;
import java.io.IOException;

@Entity
public abstract class EstadoPedido extends PersistentEntity {

    public EstadoPedido() {

    }

    public abstract void pagar(Pedido pedido, TarjetaDeCredito tarjetaDeCredito, Integer monto) throws MontoInsuficienteException, IOException, NoSePuedePagarException;

    public abstract void entregar(Pedido pedido) throws IOException, NoSePuedeEntregarException;

    public abstract void cancelar(Pedido pedido, TarjetaDeCredito tarjetaDeCredito, Integer monto) throws IOException, NoSePuedeCancelarException;

}
