package negocio.componente;

public class Producto extends Componente {
    private Integer precio;
    private String modelo;
    private Foto foto;
    private Integer peso;

    public Producto(String caracteristicasGenerales, Integer precio, Foto foto, String modelo, Integer peso) {
        super(caracteristicasGenerales);
        this.foto = foto;
        this.modelo = modelo;
        this.precio = precio;
        this.peso = peso;
    }

    // INICIO - GETTER & SETTER

    public Integer getPrecio() {
        return precio;
    }

    public String getModelo() {
        return modelo;
    }

    public Integer getPeso() { return peso; }

    // FIN - GETTER & SETTER
}
