package com.rest.model.detallePedido;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "detalles_pedido")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class DetallePedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "id_pedido")
    private Long pedido;
    @ManyToOne
    @JoinColumn(name = "id_producto")
    private Long producto;
    private Integer cantidad;
    private Double precio;


}
