package negocio.componente;

import negocio.componente.Componente;
import negocio.componente.Foto;

public class Producto extends Componente {
    private Integer precio;
    private String modelo;
    private Foto foto;
    private Double peso;

    public Producto(String caracteristicasGenerales, Integer precio, Foto foto, String modelo, Double peso) {
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

    public Double getPeso() { return peso; }

    // FIN - GETTER & SETTER
}
