package com.example.pruebados;

public class Datos {
    private String descripcion;
    String precio, codigo;

    public Datos() {
    }

    public Datos(String descripcion, String precio, String codigo) {
        this.descripcion = descripcion;
        this.precio = precio;
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
}
