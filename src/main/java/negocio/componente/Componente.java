package negocio.componente;

public abstract class Componente {
    private String nombre;
    private String caracteristicasGenerales;

    public Componente(String nombre, String caracteristicasGenerales) {
        this.nombre = nombre;
        this.caracteristicasGenerales = caracteristicasGenerales;
    }

    public abstract Integer getPrecio();

    public String getCaracteristicasGenerales() { return caracteristicasGenerales; }

    public String getNombre(){
        return nombre;
    };
}
