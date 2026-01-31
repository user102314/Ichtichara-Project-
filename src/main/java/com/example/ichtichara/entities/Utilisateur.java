package com.example.ichtichara.entities;


import jakarta.persistence.*;

@Entity
public class Utilisateur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idutilisateur;
    private String nom;
    private String prenom;
    private String numtelephone;
    private String email;
    private String role;
    private Long idS;

    public Utilisateur() {}

    public Long getIdutilisateur() { return idutilisateur; }
    public void setIdutilisateur(Long idutilisateur) { this.idutilisateur = idutilisateur; }
    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }
    public String getPrenom() { return prenom; }
    public void setPrenom(String prenom) { this.prenom = prenom; }
    public String getNumtelephone() { return numtelephone; }
    public void setNumtelephone(String numtelephone) { this.numtelephone = numtelephone; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getRole() { return role; }
    public void setRole(String role) { this.role = role; }
    public Long getIdS() { return idS; }
    public void setIdS(Long idS) { this.idS = idS; }
}