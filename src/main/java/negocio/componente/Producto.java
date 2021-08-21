package negocio.componente;

public class Producto extends Componente {
    private Integer precio;
    private Foto foto;
    private Integer peso;

    public Producto(String nombre, String caracteristicasGenerales, Integer precio, Foto foto, Integer peso) {
        super(nombre, caracteristicasGenerales);
        this.foto = foto;
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
