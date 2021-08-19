package negocio;

public class Producto extends Componente{
    private TipoDeProducto tipoDeProducto;
    private String modelo;

    public Producto(Integer precio, Integer anticipo, Foto foto, String caracteristicasGenerales) {
        super(precio, anticipo, foto, caracteristicasGenerales);
    }
}
