package com.practica01.controller;

import com.practica01.Domain.Arbol;
import com.practica01.service.ArbolService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import com.practica01.service.FirebaseStorageService;
@Controller
@Slf4j
@RequestMapping("/arbol")
public class ArbolController {

    @Autowired
    private ArbolService arbolService;

    @GetMapping("/listado")
    public String listado(Model model) {
        var lista = arbolService.getArbol();
        model.addAttribute("arbols", lista);
        model.addAttribute("totalArbol", lista.size());
        return "/arbol/listado";
    }
  @Autowired
    private FirebaseStorageService firebaseStorageService;
  

   @PostMapping("/guardar")
    public String arbolGuardar(Arbol arbol,
            @RequestParam("imagenFile") MultipartFile imagenFile) {        
        if (!imagenFile.isEmpty()) {
            arbolService.save(arbol);
            arbol.setRuta_imagen( firebaseStorageService.cargaImagen(
                            imagenFile, 
                            "arbol", 
                            arbol.getId_arbol()));
                   
        }
        arbolService.save(arbol);
        return "redirect:/arbol/listado";
    }

     @GetMapping("/modificar/{idArbol}")
    public String arbolModificar(Arbol arbol, Model model) {
        arbol = arbolService.getArbol(arbol);
        model.addAttribute("arbol", arbol);
        return "/arbol/modifica";
    }


    @GetMapping("/eliminar/{idArbol}")
    public String elimina(Arbol arbol) {
        arbolService.delete(arbol);
        
        return "redirect:/arbol/listado";
    }


}

