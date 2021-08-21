package negocio.componente;

import negocio.componente.Componente;
import negocio.componente.Foto;

public class Producto extends Componente {
    private Integer precio;
    private Foto foto;
    private Double peso;

    public Producto(String nombre, String caracteristicasGenerales, Integer precio, Foto foto, Double peso) {
        super(nombre, caracteristicasGenerales);
        this.foto = foto;
        this.precio = precio;
        this.peso = peso;
    }

    // INICIO - GETTER & SETTER

    public Integer getPrecio() {
        return precio;
    }

    public Double getPeso() { return peso; }

    // FIN - GETTER & SETTER
}
