package negocio.envio;

import negocio.cliente.Ubicacion;
import negocio.persistentEntity.PersistentEntity;

import javax.persistence.Entity;

@Entity
public abstract class TipoDeEnvio extends PersistentEntity {
    public abstract Integer calcularCosto(Integer peso, Ubicacion ubicacion);
}
