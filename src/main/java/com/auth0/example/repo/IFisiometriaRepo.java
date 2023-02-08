package com.auth0.example.repo;

import com.auth0.example.model.Fisiometria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IFisiometriaRepo extends JpaRepository<Fisiometria,Integer> {
}

