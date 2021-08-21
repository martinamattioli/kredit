package negocio.cliente;

import negocio.pedido.MontoInsuficienteException;
import negocio.pedido.NoSePuedeCancelarException;
import negocio.pedido.NoSePuedePagarException;
import negocio.pedido.Pedido;

import java.io.IOException;

public class Cliente {
    private String nombreCompleto;
    private String mail;
    private TipoDeDocumento tipoDeDocumento;
    private String nroDeDocumento;
    private String direccion;
    private Tarjeta tarjeta;

    public Cliente(String nombreCompleto, String mail, TipoDeDocumento tipoDeDocumento, String nroDeDocumento, String direccion, Tarjeta tarjeta) {
        this.nombreCompleto = nombreCompleto;
        this.mail = mail;
        this.tipoDeDocumento = tipoDeDocumento;
        this.nroDeDocumento = nroDeDocumento;
        this.direccion = direccion;
        this.tarjeta = tarjeta;
    }

    public Tarjeta getTarjeta() {
        return tarjeta;
    }

    public String getMail() {
        return mail;
    }

    public void pagar(Pedido pedido) throws MontoInsuficienteException, IOException, NoSePuedePagarException {
        pedido.pagar();
    }

    public void cancelarPedido(Pedido pedido) throws IOException, NoSePuedeCancelarException {
        pedido.cancelar();
    }


}
