package com.practica01.controller;

import com.practica01.Dao.ArbolDao;
import com.practica01.Domain.Arbol;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/arboles") 
public class ArbolController {

    @Autowired
    private ArbolDao arbolDao; 

    @GetMapping
    public List<Arbol> getAllArboles() {
        return arbolDao.findAll();
    }

    @PostMapping
    public Arbol createArbol(@RequestBody Arbol arbol) {
        return arbolDao.save(arbol);
    }

    @PutMapping("/{id}")
    public Arbol updateArbol(@PathVariable Long id, @RequestBody Arbol arbolDetails) {
        Arbol arbol = arbolDao.findById(id)
                .orElseThrow(() -> new RuntimeException("Arbol no ha sido encontrado con el ID: " + id)); 

        return arbolDao.save(arbol);
    }

    @DeleteMapping("/{id}")
    public void deleteArbol(@PathVariable Long id) {
        Arbol arbol = arbolDao.findById(id)
                .orElseThrow(() -> new RuntimeException("Arbol no ha sido encontrado con el ID: " + id));

        arbolDao.delete(arbol);
    }
}

