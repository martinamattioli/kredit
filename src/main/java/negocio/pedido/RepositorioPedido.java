package negocio.pedido;

import java.util.List;

import org.uqbarproject.jpa.java8.extras.WithGlobalEntityManager;
import org.uqbarproject.jpa.java8.extras.transaction.TransactionalOps;

public class RepositorioPedido implements WithGlobalEntityManager, TransactionalOps {

    private final static RepositorioPedido INSTANCE = new RepositorioPedido();

    public static RepositorioPedido getInstance() {
        return INSTANCE;
    }

    @SuppressWarnings("unchecked")
    public List<Pedido> getPedidos(){
        return entityManager()
                .createQuery("from Pedido", Pedido.class)
                .getResultList();
    }

    public void agregarPedido(Pedido pedido) {
        entityManager().persist(pedido);
    }

    public void actualizarPedido(Pedido pedido){
        withTransaction(() -> {
            entityManager().persist(pedido);
        });
    }

}
