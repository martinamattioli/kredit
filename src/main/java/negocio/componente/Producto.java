package negocio.componente;

public class Producto extends Componente {
    private Integer precio;
    private Integer peso;

    public Producto(String nombre, String caracteristicasGenerales, Foto foto, Integer precio, Integer peso) {
        super(nombre, caracteristicasGenerales, foto);
        this.precio = precio;
        this.peso = peso;
    }

    // INICIO - GETTER & SETTER

    public Integer getPrecio() {
        return precio;
    }

    public Integer getPeso() { return peso; }

    // FIN - GETTER & SETTER
}
