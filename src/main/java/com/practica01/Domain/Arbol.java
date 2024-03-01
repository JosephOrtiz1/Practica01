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

   

    
    
}
