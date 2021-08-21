package negocio.cliente;

import negocio.pedido.DineroInsuficienteException;
import negocio.pedido.Pedido;

public class Cliente {
    private String nombreCompleto;
    private String mail;
    private String telefono;
    private TipoDeDocumento tipoDeDocumento;
    private String nroDeDocumento;

    public Cliente(String nombreCompleto, String mail, String telefono, TipoDeDocumento tipoDeDocumento,
                   String nroDeDocumento) {
        this.nombreCompleto = nombreCompleto;
        this.mail = mail;
        this.telefono = telefono;
        this.tipoDeDocumento = tipoDeDocumento;
        this.nroDeDocumento = nroDeDocumento;
    }

    public void pagar(Pedido pedido, Integer dinero) throws DineroInsuficienteException {
        pedido.pagar(dinero);
    }

    public void cancelarPedido(Pedido pedido){
        pedido.cancelar();
    }

}
