package negocio.pedido;

public class DineroInsuficienteException extends Exception{
    public DineroInsuficienteException() {
        super("El dinero abonado es insuficiente.");
    }
}
