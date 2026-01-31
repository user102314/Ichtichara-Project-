package com.example.ichtichara.entities;


import jakarta.persistence.*;

@Entity
public class Ichtichara {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idichtichara;
    private Long idtype;
    private Long iddocument;
    private Long idExpert;
    private Long idhistorique;
    private Long idUtilisateur;
    private String etat;
    private Double prixTotal;
    private Double prixTva;
    private Double prixBrut;

    public Ichtichara() {}

    public Long getIdichtichara() { return idichtichara; }
    public void setIdichtichara(Long idichtichara) { this.idichtichara = idichtichara; }
    public Long getIdtype() { return idtype; }
    public void setIdtype(Long idtype) { this.idtype = idtype; }
    public Long getIddocument() { return iddocument; }
    public void setIddocument(Long iddocument) { this.iddocument = iddocument; }
    public Long getIdExpert() { return idExpert; }
    public void setIdExpert(Long idExpert) { this.idExpert = idExpert; }
    public Long getIdhistorique() { return idhistorique; }
    public void setIdhistorique(Long idhistorique) { this.idhistorique = idhistorique; }
    public Long getIdUtilisateur() { return idUtilisateur; }
    public void setIdUtilisateur(Long idUtilisateur) { this.idUtilisateur = idUtilisateur; }
    public String getEtat() { return etat; }
    public void setEtat(String etat) { this.etat = etat; }
    public Double getPrixTotal() { return prixTotal; }
    public void setPrixTotal(Double prixTotal) { this.prixTotal = prixTotal; }
    public Double getPrixTva() { return prixTva; }
    public void setPrixTva(Double prixTva) { this.prixTva = prixTva; }
    public Double getPrixBrut() { return prixBrut; }
    public void setPrixBrut(Double prixBrut) { this.prixBrut = prixBrut; }
}
