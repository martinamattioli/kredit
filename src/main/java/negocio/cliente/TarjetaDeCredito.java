package negocio.cliente;

import negocio.persistentEntity.PersistentEntity;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.util.Date;

@Entity
public class TarjetaDeCredito extends PersistentEntity {
    private String numero;
    private String titular;
    private Date fechaDeVencimiento;
    @Enumerated(EnumType.STRING)
    private RedAsociada redAsociada;
    private Integer codigoDeSeguridad;
    private Integer monto;

    public TarjetaDeCredito() {

    }

    public TarjetaDeCredito(String titular, String numero, Integer codigoDeSeguridad,
                            Date fechaDeVencimiento, RedAsociada redAsociada, Integer monto) {
        this.numero = numero;
        this.titular = titular;
        this.fechaDeVencimiento = fechaDeVencimiento;
        this.redAsociada = redAsociada;
        this.codigoDeSeguridad = codigoDeSeguridad;
        this.monto = monto;
    }

    public Integer getMonto() {
        return monto;
    }

    public Boolean tieneMontoSuficiente(Integer valorAPagar){
        return monto >= valorAPagar;
    }

    public void restarMonto(Integer monto) {
        this.monto -= monto;
    }

    public void sumarMonto(Integer monto) {
        this.monto += monto;
    }
}
