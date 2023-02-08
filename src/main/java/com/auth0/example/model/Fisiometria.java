package com.auth0.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.Instant;
import java.util.UUID;

@Entity
public class Fisiometria {
    @Id
    @GeneratedValue
    @Column(name="id")
    private UUID id;
    @Column(name="userId")
    private String userId;
    @Column(name="empresaId")
    private String empresaId;
    @Column(name="ritmoCardiaco")
    private Integer ritmoCardiaco;
    @Column(name="ritmoRespiratorio")
    private Integer ritmoRespiratorio;
    @Column(name="oximetria")
    private Integer oximetria;
    @Column(name="presionArterialSistolica")
    private  Integer presionArterialSistolica;
    @Column(name="presionArterialDiastolica")
    private  Integer presionArterialDiastolica;
    @Column(name="fechaRegistro")
    private Instant fechaRegistro;
    @Column(name="fechaToma")
    private Instant fechaToma;


    public UUID getId() {
        return id;
    }
    public void setId(UUID id) {
        this.id = id;
    }
    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }
    public String getEmpresaId() {
        return empresaId;
    }
    public void setEmpresaId(String empresaId) {
        this.empresaId = empresaId;
    }
    public int getRitmoCardiaco() {
        return ritmoCardiaco;
    }
    public void setRitmoCardiaco(int ritmoCardiaco) {
        this.ritmoCardiaco = ritmoCardiaco;
    }
    public int getRitmoRespiratorio() {
        return ritmoRespiratorio;
    }
    public void setRitmoRespiratorio(int ritmoRespiratorio) {
        this.ritmoRespiratorio = ritmoRespiratorio;
    }
    public int getOximetria() {
        return oximetria;
    }
    public void setOximetria(int oximetria) {
        this.oximetria = oximetria;
    }
    public int getPresionArterialSistolica() {
        return presionArterialSistolica;
    }
    public void setPresionArterialSistolica(int presionArterialSistolica) {
        this.presionArterialSistolica = presionArterialSistolica;
    }
    public int getPresionArterialDiastolica() {
        return presionArterialDiastolica;
    }
    public void setPresionArterialDiastolica(int presionArterialDiastolica) {
        this.presionArterialDiastolica = presionArterialDiastolica;
    }
    public Instant getFechaRegistro() {
        return fechaRegistro;
    }
    public void setFechaRegistro(Instant fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public Instant getFechaToma() {
        return fechaToma;
    }
    public void setFechaToma(Instant fechaToma) {
        this.fechaToma = fechaToma;
    }
}


