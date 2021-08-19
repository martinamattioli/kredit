package negocio;

import java.util.ArrayList;
import java.util.List;

public class Organizacion {
    private static Organizacion instance = null;
    private String nombre;
    private List<Componente> catalogo;

    private Organizacion(){
        nombre = null;
        catalogo = new ArrayList<Componente>();
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

    public void agregarProducto(Componente componente){
        catalogo.add(componente);
    }

    public void removerProducto(Componente componente){
        catalogo.remove(componente);
    }
}
