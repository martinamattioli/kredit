package negocio.cliente;

import java.util.Date;

public class Tarjeta {
    private String numero;
    private String titular;
    private Date fechaDeVencimiento;
    private TipoDePago tipoDePago;
    private Integer codigoDeSeguridad;
    private Integer monto;

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
