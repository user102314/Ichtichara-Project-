package com.example.ichtichara.entities;

import jakarta.persistence.*;
import java.util.Date;

@Entity
public class HistoriqueConversation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idligne;
    private Long idhistorique;
    private Long idutilisateur;
    private Long idexpert;
    private String message;
    private Date date;
    private Long idSender;

    public HistoriqueConversation() {}

    public Long getIdligne() { return idligne; }
    public void setIdligne(Long idligne) { this.idligne = idligne; }
    public Long getIdhistorique() { return idhistorique; }
    public void setIdhistorique(Long idhistorique) { this.idhistorique = idhistorique; }
    public Long getIdutilisateur() { return idutilisateur; }
    public void setIdutilisateur(Long idutilisateur) { this.idutilisateur = idutilisateur; }
    public Long getIdexpert() { return idexpert; }
    public void setIdexpert(Long idexpert) { this.idexpert = idexpert; }
    public String getMessage() { return message; }
    public void setMessage(String message) { this.message = message; }
    public Date getDate() { return date; }
    public void setDate(Date date) { this.date = date; }
    public Long getIdSender() { return idSender; }
    public void setIdSender(Long idSender) { this.idSender = idSender; }
}