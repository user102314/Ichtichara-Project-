package com.example.ichtichara.entities;

import jakarta.persistence.*;

@Entity
public class Text {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idligne;
    private Long idS;
    @Column(columnDefinition = "TEXT")
    private String text;

    public Text() {}

    public Long getIdligne() { return idligne; }
    public void setIdligne(Long idligne) { this.idligne = idligne; }
    public Long getIdS() { return idS; }
    public void setIdS(Long idS) { this.idS = idS; }
    public String getText() { return text; }
    public void setText(String text) { this.text = text; }
}