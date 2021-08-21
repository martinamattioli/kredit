package negocio.cliente;

import java.util.Date;

public class TarjetaDeCredito {
    private String numero;
    private String titular;
    private Date fechaDeVencimiento;
    private RedAsociada redAsociada;
    private Integer codigoDeSeguridad;
    private Integer monto;

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
