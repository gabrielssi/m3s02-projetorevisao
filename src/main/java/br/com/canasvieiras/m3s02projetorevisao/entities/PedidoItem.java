package br.com.canasvieiras.m3s02projetorevisao.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="pedido_item")
public class PedidoItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
