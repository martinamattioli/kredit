package negocio;

import java.util.ArrayList;
import java.util.List;

public class Computadora extends Componente{
    private List<Componente> componentes;

    public Computadora(Integer precio, Integer anticipo, Foto foto, String caracteristicasGenerales) {
        super(precio, anticipo, foto, caracteristicasGenerales);
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
}
