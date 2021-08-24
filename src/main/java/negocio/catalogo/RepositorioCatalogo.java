package negocio.catalogo;

import java.util.List;

import org.uqbarproject.jpa.java8.extras.WithGlobalEntityManager;
import org.uqbarproject.jpa.java8.extras.transaction.TransactionalOps;

public class RepositorioCatalogo implements WithGlobalEntityManager, TransactionalOps {

    private final static RepositorioCatalogo INSTANCE = new RepositorioCatalogo();

    public static RepositorioCatalogo getInstance() {
        return INSTANCE;
    }

    @SuppressWarnings("unchecked")
    public List<Catalogo> getCatalogos(){
        return entityManager()
                .createQuery("from Catalogo", Catalogo.class)
                .getResultList();
    }

    public void agregarCatalogo(Catalogo catalogo) {
        entityManager().persist(catalogo);
    }

    public void actualizarCatalogo(Catalogo catalogo){
        withTransaction(() -> {
            entityManager().persist(catalogo);
        });
    }

}
