package com.rest.model.pedidos;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.OffsetDateTime;


@Entity
@Table(name = "pedidos")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class Pedidos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "id_mesero")
    private String mesero;
    @ManyToOne
    @JoinColumn(name = "id_mesa")
    private  String mesa;
    @CreationTimestamp
    @Column(name = "fecha_hora", columnDefinition = "TIMESTAMPTZ")
    private OffsetDateTime fechaHora;
    @Enumerated(EnumType.STRING)
    private String estado;
}
