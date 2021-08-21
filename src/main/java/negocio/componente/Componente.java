package negocio.componente;

public abstract class Componente {
    private String caracteristicasGenerales;

    public Componente(String caracteristicasGenerales) {
        this.caracteristicasGenerales = caracteristicasGenerales;
    }

    public abstract Integer getPrecio();

    public String getCaracteristicasGenerales() { return caracteristicasGenerales; }
}
