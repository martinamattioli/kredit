package negocio.cliente;

import negocio.pedido.MontoInsuficienteException;
import negocio.pedido.NoSePuedeCancelarException;
import negocio.pedido.NoSePuedePagarException;
import negocio.pedido.Pedido;
import negocio.persistentEntity.PersistentEntity;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.OneToOne;
import java.io.IOException;

@Entity
public class Cliente extends PersistentEntity {
    private String nombreCompleto;
    private String mail;
    @Enumerated(EnumType.STRING)
    private TipoDeDocumento tipoDeDocumento;
    private String nroDeDocumento;
    private String direccion;
    @OneToOne
    private TarjetaDeCredito tarjeta;
    @Enumerated(EnumType.STRING)
    private Ubicacion ubicacion;

    public Cliente(String nombreCompleto, String mail, TipoDeDocumento tipoDeDocumento, String nroDeDocumento, String direccion, TarjetaDeCredito tarjeta, Ubicacion ubicacion) {
        this.nombreCompleto = nombreCompleto;
        this.mail = mail;
        this.tipoDeDocumento = tipoDeDocumento;
        this.nroDeDocumento = nroDeDocumento;
        this.direccion = direccion;
        this.tarjeta = tarjeta;
        this.ubicacion = ubicacion;
    }

    public Cliente() {

    }

    public TarjetaDeCredito getTarjetaDeCredito() {
        return tarjeta;
    }

    public String getMail() {
        return mail;
    }

    public void pagar(Pedido pedido) throws MontoInsuficienteException, IOException, NoSePuedePagarException {
        pedido.pagar();
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public Ubicacion getUbicacion() { return ubicacion; }

    public void cancelarPedido(Pedido pedido) throws IOException, NoSePuedeCancelarException {
        pedido.cancelar();
    }
}
