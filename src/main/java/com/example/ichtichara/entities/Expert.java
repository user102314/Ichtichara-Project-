package com.example.ichtichara.entities;


import jakarta.persistence.*;

@Entity
public class Expert {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idExpert;
    private Long idutilisateur;
    private Long idtype;
    private String description;
    private Long photoid;

    public Expert() {}

    public Long getIdExpert() { return idExpert; }
    public void setIdExpert(Long idExpert) { this.idExpert = idExpert; }
    public Long getIdutilisateur() { return idutilisateur; }
    public void setIdutilisateur(Long idutilisateur) { this.idutilisateur = idutilisateur; }
    public Long getIdtype() { return idtype; }
    public void setIdtype(Long idtype) { this.idtype = idtype; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public Long getPhotoid() { return photoid; }
    public void setPhotoid(Long photoid) { this.photoid = photoid; }
}