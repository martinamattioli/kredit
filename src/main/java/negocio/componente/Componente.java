package negocio.componente;

public abstract class Componente {
    private Integer precio;
    private String caracteristicasGenerales;

    public Componente(Integer precio, Integer anticipo, String caracteristicasGenerales) {
        this.precio = precio;
        this.caracteristicasGenerales = caracteristicasGenerales;
    }

    public Integer getPrecio() {
        return precio;
    }
}
