package negocio.pedido;

public class Confirmado extends EstadoPedido {

    public Confirmado(Pedido pedido) {
        super(pedido);
    }

    public void pagar(Integer dinero) throws DineroInsuficienteException {
        if (dinero >= pedido.calcularCosto()) {
            pedido.setEstadoPedido(new Pagado(pedido));
        } else throw new DineroInsuficienteException();
    }

    public void entregar() {

    }

    public void cancelar() {
        pedido.setEstadoPedido(new Cancelado(pedido));
    }
}
