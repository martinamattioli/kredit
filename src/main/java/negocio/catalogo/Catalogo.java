package negocio.catalogo;

import negocio.componente.Componente;
import negocio.persistentEntity.PersistentEntity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

@Entity
public class Catalogo extends PersistentEntity {

    private String nombre;

    @OneToMany
    @JoinColumn(name="idCatalogo")
    private List<Componente> componentes;

    public Catalogo(String nombre) {
        this.nombre = nombre;
        this.componentes = new ArrayList<Componente>();
    }

    public Catalogo() {

    }

    public void agregar(Componente componente){
        componentes.add(componente);
    }

    public void remover(Componente componente) {
        componentes.remove(componente);
    }

    public Integer obtenerCantidadDeComponentes(){
        return componentes.size();
    }

    private ArrayList<Componente> obtenerListaDeComponentesPorPredicado(Predicate<Componente> predicado) {
        List<Componente> lista = componentes.stream().filter(predicado).collect(Collectors.toList());
        return new ArrayList<Componente>(lista);
    }

    public Componente buscarPorNombre(String nombre){
        return componentes.stream().filter(componente -> componente.getNombre() == nombre).findFirst().get();
    }

    public ArrayList<Componente> filtrarComponentesConPrecioMayorOIgual(Integer precio){
        return this.obtenerListaDeComponentesPorPredicado(componente -> componente.getPrecio() >= precio);
    }

    public ArrayList<Componente> filtrarComponentesConPrecioMenorOIgual(Integer precio){
        return this.obtenerListaDeComponentesPorPredicado(componente -> componente.getPrecio() <= precio);
    }

}
