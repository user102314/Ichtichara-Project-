package com.example.ichtichara.entities;

import jakarta.persistence.*;

@Entity
public class PrixIchtichara {
    @Id
    private Long idtype;
    private Double prix;

    public PrixIchtichara() {}

    public Long getIdtype() { return idtype; }
    public void setIdtype(Long idtype) { this.idtype = idtype; }
    public Double getPrix() { return prix; }
    public void setPrix(Double prix) { this.prix = prix; }
}
