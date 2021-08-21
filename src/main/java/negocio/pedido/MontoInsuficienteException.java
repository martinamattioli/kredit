package negocio.pedido;

public class MontoInsuficienteException extends Exception{
    public MontoInsuficienteException() {
        super("El dinero abonado es insuficiente.");
    }
}
