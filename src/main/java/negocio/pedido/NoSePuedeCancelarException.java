package negocio.pedido;

public class NoSePuedeCancelarException extends Exception{
    public NoSePuedeCancelarException() {
        super("No se puede cancelar el pedido.");
    }
}
