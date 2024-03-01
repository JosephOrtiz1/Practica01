package com.practica01.Domain;

import jakarta.persistence.*;
import java.io.Serializable;

import lombok.Data;

/**
 *
 * @author Alonso Muñoz Aguilar
 */
@Data
@Entity
@Table(name="arbolSA")
public class Arbol implements Serializable{
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_arbol")
    private Long id_arbol;
    private String nombre_comun;
    private String nombre_cientifico;
    private String dureza_madera;
    private String descripcion;
    private String tipo_flor;
    private String ruta_imagen;

   

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
