package com.practica01.Domain;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 *
 * @author Alonso Muñoz Aguilar
 */
public class Arbol {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_arbol;
    private String nombre_comun;
    private String nombre_cientifico;
    private String dureza_madera;
    private String descripcion;
    private String tipo_flor;
    private String ruta_imagen;

    public Arbol(Long id_arbol, String nombre_comun, String nombre_cientifico, String dureza_madera, String descripcion, String tipo_flor, String ruta_imagen) {
        this.id_arbol = id_arbol;
        this.nombre_comun = nombre_comun;
        this.nombre_cientifico = nombre_cientifico;
        this.dureza_madera = dureza_madera;
        this.descripcion = descripcion;
        this.tipo_flor = tipo_flor;
        this.ruta_imagen = ruta_imagen;
    }

    public Long getId_arbol() {
        return id_arbol;
    }

    public String getNombre_comun() {
        return nombre_comun;
    }

    public String getNombre_cientifico() {
        return nombre_cientifico;
    }

    public String getDureza_madera() {
        return dureza_madera;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getTipo_flor() {
        return tipo_flor;
    }

    public String getRuta_imagen() {
        return ruta_imagen;
    }

    public void setId_arbol(Long id_arbol) {
        this.id_arbol = id_arbol;
    }

    public void setNombre_comun(String nombre_comun) {
        this.nombre_comun = nombre_comun;
    }

    public void setNombre_cientifico(String nombre_cientifico) {
        this.nombre_cientifico = nombre_cientifico;
    }

    public void setDureza_madera(String dureza_madera) {
        this.dureza_madera = dureza_madera;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setTipo_flor(String tipo_flor) {
        this.tipo_flor = tipo_flor;
    }

    public void setRuta_imagen(String ruta_imagen) {
        this.ruta_imagen = ruta_imagen;
    }
    
    
}
