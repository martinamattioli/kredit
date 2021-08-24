package negocio.main;

import negocio.cliente.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("db");

        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        TarjetaDeCredito tarjetaDeCredito = new TarjetaDeCredito("Godzilla", "1234", 1234,
                new Date(), RedAsociada.VISA, 1000);

        em.persist(tarjetaDeCredito);

        Cliente cliente = new Cliente("San", "Lorenzo@gmail.com", TipoDeDocumento.DNI,
                "12345", "CASLA 123", tarjetaDeCredito, Ubicacion.CABA);

        em.persist(cliente);

        em.getTransaction().commit();

        em.close();

    }

}
