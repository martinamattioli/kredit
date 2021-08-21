package negocio.componente;

import negocio.componente.Componente;
import negocio.componente.Foto;

public class Producto extends Componente {
    private Integer precio;
    private String modelo;
    private Foto foto;

    public Producto(String caracteristicasGenerales, Integer precio, Foto foto, String modelo) {
        super(caracteristicasGenerales);
        this.foto = foto;
        this.modelo = modelo;
        this.precio = precio;
    }

    public Integer getPrecio() {
        return precio;
    }

    public String getModelo() {
        return modelo;
    }
}
