package com.auth0.example.web;

import com.auth0.example.model.Persona;
import com.auth0.example.repo.IPersonaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api")
// For simplicity of this sample, allow all origins. Real applications should configure CORS for their use case.
@CrossOrigin(origins = "*")
public class UsuarioRestController {
    @Autowired
    private IPersonaRepo repo;

    @GetMapping(value="/personas")
    public List<Persona> read(){
        return repo.findAll();
    }


    @GetMapping(value="/usuarios")
    public List<Persona> readPublic(){
        return repo.findAll();
    }

    @PostMapping(value="/personas")
    public void create(@RequestBody Persona per){
        repo.save(per);
    }

    @PutMapping(value="/personas")
    public void update(@RequestBody Persona per){
        repo.save(per);
    }

    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable("id") Integer id){
        repo.deleteById(id);
    }
}




