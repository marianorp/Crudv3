package com.Crud.controller;

import com.Crud.model.Usuario;
import com.Crud.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;


@RestController
@RequestMapping("api")

public class ApiDemo {

    /*injecto la interfaz*/
    @Autowired
    UsuarioService usuarioService;


    @GetMapping("/home")
    public String saludar(){
        return "Devolviending222222....";
    }

    @GetMapping("/all")
    public ArrayList<Usuario> getAllUser(){
        return usuarioService.getAllUser();
    }

    @GetMapping("/find/{id}")
    public Optional<Usuario> getUserById(@PathVariable("id") long id){
        return usuarioService.getUserById(id);
    }

    /*recibe como parametro un objeto del tipo usuario*/
    @PostMapping("/save")
    public Usuario saveUser(@RequestBody Usuario u){
        return usuarioService.saveUser(u);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteUserById(@PathVariable("id") long id){
        if(usuarioService.deleteUserById(id))
            return "Se ha eliminado el usuario";
        else
            return  "No se ha eliminado el usuario";
    }

}


