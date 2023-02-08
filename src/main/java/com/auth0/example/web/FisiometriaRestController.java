package com.auth0.example.web;

import com.auth0.example.model.Fisiometria;
import com.auth0.example.repo.IFisiometriaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api")
@CrossOrigin(origins = "*")
public class FisiometriaRestController {
    @Autowired
    private IFisiometriaRepo repo;
    @GetMapping(value="/fisiometria")
    public List<Fisiometria> read(){
        return repo.findAll();
    }
    @PostMapping(value="/fisiometria")
    public void create(@RequestBody Fisiometria fis){
        repo.save(fis);
    }
    @PutMapping(value="/fisiometria")
    public void update(@RequestBody Fisiometria fis){
        repo.save(fis);
    }
    @DeleteMapping(value = "fisiometria/{id}")
    public void delete(@PathVariable("id") Integer id){
        repo.deleteById(id);
    }
}
