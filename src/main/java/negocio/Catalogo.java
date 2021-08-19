package negocio;

import java.util.ArrayList;
import java.util.List;

public class Catalogo {
    private List<Componente> productos;

    public Catalogo() {
        productos = new ArrayList<Componente>();
    }

    public void agregarProducto(Componente componente){
        productos.add(componente);
    }

    public void removerProducto(Componente componente){
        productos.remove(componente);
    }
}
