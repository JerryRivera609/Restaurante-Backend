package com.rest.model.usuario;


import jakarta.persistence.*;


@Table(name = "usuarios")

public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String email;
    private String contrasenia;
    @Enumerated(EnumType.STRING)
    private String rol;
}
