/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.practica01.service;


import com.practica01.Domain.Arbol;
import java.util.List;

/**
 *
 * @author Luis David
 */
public interface ArbolService {
    //recupera registros de la tabla arbol en una lista}
    public List<Arbol> getArbol();
    
    public Arbol getArbol(Arbol arbol);
    
    public void save(Arbol arbol);
    
    public void delete(Arbol arbol);
    
    
}
