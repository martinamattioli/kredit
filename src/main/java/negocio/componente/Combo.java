package negocio.componente;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Combo extends Componente {

    @OneToMany
    @JoinColumn(name="idCombo")
    private List<Componente> componentes;

    public Combo(String nombre, String caracteristicasGenerales, String foto) {
        super(nombre, caracteristicasGenerales, foto);
        componentes = new ArrayList<Componente>();
    }

    public Combo() {

    }

    public void agregarComponente(Componente componente){
        componentes.add(componente);
    }

    public void removerComponente(Componente componente){
        componentes.remove(componente);
    }

    public List<Componente> getComponentes() {
        return componentes;
    }

    public Integer getPrecio() {
        return componentes.stream().mapToInt(Componente::getPrecio).sum();
    }

    public Integer getPeso() {
        return componentes.stream().mapToInt(Componente::getPeso).sum();
    }
}
