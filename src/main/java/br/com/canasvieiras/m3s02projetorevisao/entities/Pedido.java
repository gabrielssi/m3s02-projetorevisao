package br.com.canasvieiras.m3s02projetorevisao.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigInteger;
import java.util.Date;

@Data
@Entity
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Date criacao = new Date();

    @Column(nullable = false)
    private Date atualizacao = new Date();

    @Column(length = 255, nullable = false)
    private String numero_pedido;

    @Column(nullable = false)
    private BigInteger cliente_id;

    private BigInteger endereco_id;

    @Column(length = 2, nullable = false)
    private String status;

}
