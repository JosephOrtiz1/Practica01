/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.practica01.serviceImp;




import com.practica01.Dao.ArbolDao;
import com.practica01.Domain.Arbol;
import com.practica01.service.ArbolService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Luis David
 */
@Service
public class ArbolServiceImpl implements ArbolService{
    @Autowired
    private ArbolDao arbolDao;
    @Override
   @Transactional(readOnly = true)
    public List<Arbol> getArbols(Boolean activos) {
        var lista= arbolDao.findAll();
        
        return lista;
    }

    @Override
     @Transactional(readOnly = true)
    public Arbol getArbol(Arbol arbol) {
        
        return arbolDao.findById(arbol.getId_arbol()).orElse(null);
        
    }

    @Override
    @Transactional
    public void save(Arbol arbol) {
        arbolDao.save(arbol);
    }

    @Override
    @Transactional
    public void delete(Arbol arbol) {
       arbolDao.delete(arbol);
    }
    
}
