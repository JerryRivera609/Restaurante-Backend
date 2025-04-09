package com.rest.model.productos;

import jakarta.persistence.*;

import java.security.PrivateKey;

public class Productos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    @Enumerated(EnumType.STRING)
    private String tipo;
    private Double precio;
    private String descripcion;
    private String img;
}
