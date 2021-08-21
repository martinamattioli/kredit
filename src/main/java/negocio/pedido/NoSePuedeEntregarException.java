package negocio.pedido;

public class NoSePuedeEntregarException extends Exception{
    public NoSePuedeEntregarException() {
        super("No se puede entregar el pedido.");
    }
}