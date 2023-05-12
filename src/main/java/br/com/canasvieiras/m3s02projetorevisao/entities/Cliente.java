package br.com.canasvieiras.m3s02projetorevisao.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigInteger;
import java.util.Date;

@Data
@Entity
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Date criacao = new Date();

    @Column(nullable = false)
    private Date atualizacao = new Date();

    @Column(length = 18, nullable = false, unique = true)
    private String documento;

    private BigInteger endereco_padrao_id;


}
