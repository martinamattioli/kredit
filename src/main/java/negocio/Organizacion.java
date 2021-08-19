package negocio;

public class Organizacion {
    private static Organizacion instance = null;
    private String nombre;
    private Catalogo catalogo;

    private Organizacion(){
        nombre = null;
        catalogo = new Catalogo();
    }

    public static Organizacion getInstance(){
        if(instance == null){
            instance = new Organizacion();
        }
        return instance;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Catalogo getCatalogo() {
        return catalogo;
    }
}
