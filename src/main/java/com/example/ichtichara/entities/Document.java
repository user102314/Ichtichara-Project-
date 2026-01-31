package com.example.ichtichara.entities;


import jakarta.persistence.*;
import java.util.Date;

@Entity
public class Document {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long iddocument;

    @Lob
    @Column(columnDefinition = "LONGBLOB")
    private byte[] document;

    private Date datesubmited;

    public Document() {}

    public Long getIddocument() { return iddocument; }
    public void setIddocument(Long iddocument) { this.iddocument = iddocument; }
    public byte[] getDocument() { return document; }
    public void setDocument(byte[] document) { this.document = document; }
    public Date getDatesubmited() { return datesubmited; }
    public void setDatesubmited(Date datesubmited) { this.datesubmited = datesubmited; }
}