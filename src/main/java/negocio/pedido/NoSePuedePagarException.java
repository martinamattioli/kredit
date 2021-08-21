package negocio.pedido;

public class NoSePuedePagarException extends Exception{
    public NoSePuedePagarException() {
        super("No se puede pagar el pedido.");
    }
}
