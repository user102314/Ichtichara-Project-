package com.example.ichtichara.entities;


import jakarta.persistence.*;

@Entity
public class Type {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idtype;
    private String type;

    public Type() {}

    public Long getIdtype() { return idtype; }
    public void setIdtype(Long idtype) { this.idtype = idtype; }
    public String getType() { return type; }
    public void setType(String type) { this.type = type; }
}