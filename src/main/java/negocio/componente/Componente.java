package negocio.componente;

import negocio.persistentEntity.PersistentEntity;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToOne;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Componente extends PersistentEntity {
    private String nombre;
    private String caracteristicasGenerales;
    private String foto;

    public Componente(String nombre, String caracteristicasGenerales, String foto) {
        this.nombre = nombre;
        this.caracteristicasGenerales = caracteristicasGenerales;
        this.foto = foto;
    }

    public Componente() {

    }

    public abstract Integer getPrecio();

    public abstract Integer getPeso();

    public String getCaracteristicasGenerales() { return caracteristicasGenerales; }

    public String getNombre(){
        return nombre;
    };
}
