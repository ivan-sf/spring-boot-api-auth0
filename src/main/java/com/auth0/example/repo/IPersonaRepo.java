package com.auth0.example.repo;

import com.auth0.example.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPersonaRepo extends JpaRepository<Persona, Integer> {
}
