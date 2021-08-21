package negocio.cliente;

import negocio.pedido.DineroInsuficienteException;
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

    public Cliente(String nombreCompleto, String mail, TipoDeDocumento tipoDeDocumento, String nroDeDocumento, String direccion) {
        this.nombreCompleto = nombreCompleto;
        this.mail = mail;
        this.tipoDeDocumento = tipoDeDocumento;
        this.nroDeDocumento = nroDeDocumento;
        this.direccion = direccion;
    }

    public String getMail() {
        return mail;
    }

    public void pagar(Pedido pedido, Integer dinero) throws DineroInsuficienteException, IOException, NoSePuedePagarException {
        pedido.pagar(dinero);
    }

    public void cancelarPedido(Pedido pedido) throws IOException, NoSePuedeCancelarException {
        pedido.cancelar();
    }


}
