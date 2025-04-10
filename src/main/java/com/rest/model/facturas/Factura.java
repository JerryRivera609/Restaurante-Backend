package com.rest.model.facturas;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.OffsetDateTime;


@Entity
@Table(name = "facturas")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class Factura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    @JoinColumn(name = "id_pedido")
    private Long pedido;
    private Double total;
    @CreationTimestamp
    @Column(name = "fecha_hora", columnDefinition = "TIMESTAMPTZ")
    private OffsetDateTime fechaHora;

}
