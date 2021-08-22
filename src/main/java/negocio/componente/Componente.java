package negocio.componente;

public abstract class Componente {
    private String nombre;
    private String caracteristicasGenerales;
    private Foto foto;

    public Componente(String nombre, String caracteristicasGenerales, Foto foto) {
        this.nombre = nombre;
        this.caracteristicasGenerales = caracteristicasGenerales;
        this.foto = foto;
    }

    public abstract Integer getPrecio();

    public abstract Integer getPeso();

    public String getCaracteristicasGenerales() { return caracteristicasGenerales; }

    public String getNombre(){
        return nombre;
    };
}
