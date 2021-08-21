package negocio.componente;

import java.util.ArrayList;
import java.util.List;

public class Combo extends Componente {
    private List<Componente> componentes;

    public Combo(String caracteristicasGenerales) {
        super(caracteristicasGenerales);
        componentes = new ArrayList<Componente>();
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
