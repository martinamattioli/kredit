package negocio.cliente;

import java.util.List;

import org.uqbarproject.jpa.java8.extras.WithGlobalEntityManager;
import org.uqbarproject.jpa.java8.extras.transaction.TransactionalOps;

public class RepositorioCliente implements WithGlobalEntityManager, TransactionalOps {

    private final static RepositorioCliente INSTANCE = new RepositorioCliente();

    public static RepositorioCliente getInstance() {
        return INSTANCE;
    }

    @SuppressWarnings("unchecked")
    public List<Cliente> getClientes(){
        return entityManager()
                .createQuery("from Cliente", Cliente.class)
                .getResultList();
    }

    public void agregarCliente(Cliente cliente) {
        entityManager().persist(cliente);
    }

    public void actualizarCliente(Cliente cliente){
        withTransaction(() -> {
            entityManager().persist(cliente);
        });
    }

}
