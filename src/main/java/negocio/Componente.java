package negocio;

abstract class Componente {
    private Integer precio;
    private Integer anticipo;
    private Foto foto;
    private String caracteristicasGenerales;

    public Componente(Integer precio, Integer anticipo, Foto foto, String caracteristicasGenerales) {
        this.precio = precio;
        this.anticipo = anticipo;
        this.foto = foto;
        this.caracteristicasGenerales = caracteristicasGenerales;
    }
}
