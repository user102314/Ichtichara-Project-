package com.example.ichtichara.entities;


import jakarta.persistence.*;

@Entity
public class Photos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idphoto;

    @Lob
    @Column(columnDefinition = "LONGBLOB")
    private byte[] photo;

    public Photos() {}

    public Long getIdphoto() { return idphoto; }
    public void setIdphoto(Long idphoto) { this.idphoto = idphoto; }
    public byte[] getPhoto() { return photo; }
    public void setPhoto(byte[] photo) { this.photo = photo; }
}