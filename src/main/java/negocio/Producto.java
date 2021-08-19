package negocio;

public class Producto extends Componente{
    private TipoDeProducto tipoDeProducto;
    private String modelo;

    public Producto(Integer precio, Integer anticipo, Foto foto, String caracteristicasGenerales,
                    TipoDeProducto tipoDeProducto, String modelo) {
        super(precio, anticipo, foto, caracteristicasGenerales);
        this.tipoDeProducto = tipoDeProducto;
        this.modelo = modelo;
    }
}
