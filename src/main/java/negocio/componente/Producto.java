package negocio.componente;

import negocio.componente.Componente;
import negocio.componente.Foto;

public class Producto extends Componente {
    private String modelo;
    private Foto foto;

    public Producto(Integer precio, Integer anticipo, String caracteristicasGenerales, Foto foto, String modelo) {
        super(precio, anticipo, caracteristicasGenerales);
        this.foto = foto;
        this.modelo = modelo;
    }
}
