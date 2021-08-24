package negocio.componente;

import javax.persistence.Entity;

@Entity
public class Producto extends Componente {
    private Integer precio;
    private Integer peso;

    public Producto(String nombre, String caracteristicasGenerales, String foto, Integer precio, Integer peso) {
        super(nombre, caracteristicasGenerales, foto);
        this.precio = precio;
        this.peso = peso;
    }

    public Producto() {

    }

    // INICIO - GETTER & SETTER

    public Integer getPrecio() {
        return precio;
    }

    public Integer getPeso() { return peso; }

    // FIN - GETTER & SETTER
}
